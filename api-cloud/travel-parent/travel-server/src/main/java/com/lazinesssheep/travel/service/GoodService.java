package com.lazinesssheep.travel.service;

import com.lazinesssheep.travel.entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoodService {

    @Autowired
    GoodService goodService;

    public Map<String, Object> getList(@RequestBody Good good) {
        Map<String, Object> retMap = new HashMap<>();
        return retMap;
    }

    public Map<String, Object> getTopList(@RequestBody Good good) {
        Map<String, Object> retMap = new HashMap<>();
        goodService.getTopList(good);
        return retMap;
    }

    public Map<String, Object> getSpecialList(@RequestBody Good good) {
        Map<String, Object> retMap = new HashMap<>();
        return retMap;
    }

    public Map<String, Object> save(@RequestBody Good good) {
        Map<String, Object> retMap = new HashMap<>();
        return retMap;
    }

}
