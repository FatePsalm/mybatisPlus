package com.solace.mybatisselect.controller;


import com.solace.mybatisselect.beans.User;
import com.solace.mybatisselect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author CaoGang
 * @since 2018-09-13
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("demo")
    public User demo() {
        System.out.println("UserController.demo");
        return userService.getById(1);
    }
}

