package com.zzy.honey.controller;


import com.zzy.honey.entity.User;
import com.zzy.honey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    public User findUserById(){
        return userService.findUserById("qwer");
    }
}
