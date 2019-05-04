package com.lazinesssheep.travel.controller;

import com.lazinesssheep.travel.api.UserApi;
import com.lazinesssheep.travel.entity.User;
import com.lazinesssheep.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
@RequestMapping("/user")
public class UserController implements UserApi {

    @Autowired
    UserService userService;

    @Override
    public Map<String, Object> register(@RequestBody User user) throws Exception {
        return userService.register(user);
    }

    @Override
    public Map<String, Object> login(@RequestBody User user) throws Exception {
        return userService.login(user);
    }
}
