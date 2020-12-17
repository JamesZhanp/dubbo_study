package com.james.gmall.service;

import com.james.gmall.bean.UserAddress;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 12 - 15 22:20
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 构造器注入
     * @param userService
     */
    public UserServiceStub(UserService userService){
        this.userService = userService;
    }
    @Override
    public List<UserAddress> getUserAddressList(String userId) throws InterruptedException {
        System.out.println("STUD");
        if (!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
