package com.james.gmall.config;

import com.alibaba.dubbo.config.*;
import com.james.gmall.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 12 - 15 22:45
 */
@Configuration
public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-user-service-provider");
        return applicationConfig;
    }

    /**
     * 注册中心*/
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    /**
     * 协议
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
        ServiceConfig<UserService> serviceServiceConfig = new ServiceConfig<>();
        serviceServiceConfig.setInterface(UserService.class);
        serviceServiceConfig.setRef(userService);
        serviceServiceConfig.setVersion("1.0.0");

        /**
         * 配置每个方法的属性
         */
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        List<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        serviceServiceConfig.setMethods(methods);

        return serviceServiceConfig;



    }

}
