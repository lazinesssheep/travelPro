package com.lazinesssheep.travel.api;

import com.lazinesssheep.travel.entity.Good;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface GoodApi {

    @GetMapping("getList")
    Map<String, Object> getList(@RequestBody Good good) throws Exception;

    @GetMapping("getTopList")
    Map<String, Object> getTopList(@RequestBody Good good) throws Exception;

    @GetMapping("getSpecialList")
    Map<String, Object> getSpecialList(@RequestBody Good good) throws Exception;

    @PostMapping("save")
    Map<String, Object> save(@RequestBody Good good) throws Exception;

}
