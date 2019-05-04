package com.lazinesssheep.travel.api;

import com.lazinesssheep.travel.entity.Good;
import com.lazinesssheep.travel.entity.Manager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface ManagerApi {

    @PostMapping("login")
    Map<String, Object> login(@RequestBody Manager manager);

}
