package com.james.gmall.controller;

import com.james.gmall.bean.UserAddress;
import com.james.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: JamesZhan
 * @create: 2020 - 12 - 13 23:29
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/init-order")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){

        return orderService.initOrder(userId);

    }

}
