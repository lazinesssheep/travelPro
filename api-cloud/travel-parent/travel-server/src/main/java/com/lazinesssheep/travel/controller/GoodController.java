package com.lazinesssheep.travel.controller;

import com.lazinesssheep.travel.api.GoodApi;
import com.lazinesssheep.travel.entity.Good;
import com.lazinesssheep.travel.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GoodController implements GoodApi {

    @Autowired
    GoodService goodService;

    @Override
    public Map<String, Object> getList(@RequestBody Good good) throws Exception {
        return goodService.getList(good);
    }

    @Override
    public Map<String, Object> getTopList(@RequestBody Good good) throws Exception {
        return goodService.getTopList(good);
    }

    @Override
    public Map<String, Object> getSpecialList(@RequestBody Good good) throws Exception {
        return goodService.getSpecialList(good);
    }

    @Override
    public Map<String, Object> save(@RequestBody Good good) throws Exception {
        return goodService.save(good);
    }

}
