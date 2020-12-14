package com.james.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.james.gmall.bean.UserAddress;
import com.james.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 12 - 14 22:48
 */

//暴露服务
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "浙江省杭州师富阳区", "1", "詹老师", "77729", true);
        UserAddress userAddress2 = new UserAddress(2, "浙江省杭州师富阳区", "1", "潘老师", "187487", true);

        return Arrays.asList(userAddress1, userAddress2);
    }
}
