package com.james.gmall.service;

import com.james.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 12 - 10 23:42
 */
public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
