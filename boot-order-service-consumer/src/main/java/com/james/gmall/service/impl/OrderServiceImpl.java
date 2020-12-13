package com.james.gmall.service.impl;

import com.james.gmall.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import com.james.gmall.service.OrderService;
import com.james.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 08 - 24 23:59
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        /**
         * 1. 查询用户的收货地址
         */

        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
