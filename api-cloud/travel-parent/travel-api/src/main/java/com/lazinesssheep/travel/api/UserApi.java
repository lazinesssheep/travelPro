package com.lazinesssheep.travel.api;

import com.lazinesssheep.travel.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface UserApi {

    @GetMapping("register")
    Map<String, Object> register(@RequestBody User user) throws Exception;

    @PostMapping("login")
    Map<String, Object> login(@RequestBody User user) throws Exception;

}
