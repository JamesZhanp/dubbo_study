package com.james.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: JamesZhan
 * @create: 2020 - 12 - 14 22:43
 * SpringBoot与dubbo整合的三种方式
 * 1. 导入dubbo-spring-boot-starter,在application.yml中配置
 *    使用@Service, 在调用者中@Reference
 * 2. 保留provider.xml/consumer.xml文件
 *    在启动类上导入 @ImportResource()
 *    方法1无法精确到档额方法
 * 3. 使用主节API
 *      将每个组件手加入到配置类中
 * @EnableDubbo(scanBasePackage = "扫描包的路径")
 */

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.james.gmall")
//@EnableDubboConfiguration
public class UserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderApplication.class, args);
    }
}
