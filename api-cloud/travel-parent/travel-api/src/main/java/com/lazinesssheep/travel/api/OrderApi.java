package com.lazinesssheep.travel.api;

import com.lazinesssheep.travel.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface OrderApi {

    @GetMapping("getList")
    Map<String, Object> login(@RequestBody Order order);

    @PostMapping("save")
    Map<String, Object> save(@RequestBody Order order);

}
