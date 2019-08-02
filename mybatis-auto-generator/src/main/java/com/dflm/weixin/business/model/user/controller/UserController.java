package com.dflm.weixin.business.model.user.controller;


import com.dflm.weixin.business.model.user.model.User;
import com.dflm.weixin.business.model.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CG
 * @since 2019-08-02
 */
@Controller
@RequestMapping("/user/user")
public class UserController {
    @Autowired
    private UserService userService;
    public void test(){
        userService.saveOrUpdate(new User());

    }
}
