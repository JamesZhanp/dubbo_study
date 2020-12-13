package com.james.gmall.impl;

import com.james.gmall.bean.UserAddress;
import com.james.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 08 - 24 23:37
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "浙江省杭州师富阳区", "1", "詹老师","77729", true);
        UserAddress userAddress2 = new UserAddress(2, "浙江省杭州师富阳区", "1", "潘老师","187487", true);

        return Arrays.asList(userAddress1, userAddress2);
    }
}
