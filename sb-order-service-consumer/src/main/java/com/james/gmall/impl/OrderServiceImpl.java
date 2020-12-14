package com.james.gmall.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.james.gmall.bean.UserAddress;
import com.james.gmall.service.OrderService;
import com.james.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 08 - 24 23:59
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        /**
         * 1. 查询用户的收货地址
         */

        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
