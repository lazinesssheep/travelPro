package com.lazinesssheep.travel.service;

import com.alibaba.fastjson.JSON;
import com.lazinesssheep.travel.common.ApiConstant;
import com.lazinesssheep.travel.common.RedisConstant;
import com.lazinesssheep.travel.common.RedisUtil;
import com.lazinesssheep.travel.dao.UserDao;
import com.lazinesssheep.travel.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.bind.ValidationException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDao userDao;

    public Map<String, Object> register(@RequestBody User user) throws Exception {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put(ApiConstant.API_CODE, ApiConstant.API_CODE_SUCC);
        retMap.put(ApiConstant.API_MSG, "注册成功");

        try {

            // 判断用户名是否重复
            User dbUser = userDao.getOne(user);
            if (dbUser != null) {
                throw new ValidationException("用户已注册");
            }

            // 注册
            int count = userDao.insert(user);
            if (count == 0) {
                throw new ValidationException("入库失败");
            }

        } catch (ValidationException e) {
            retMap.put(ApiConstant.API_CODE, ApiConstant.API_CODE_FAIL);
            retMap.put(ApiConstant.API_MSG, e.getMessage());
            logger.info("注册异常", e);
        } catch (Exception e) {
            retMap.put(ApiConstant.API_CODE, ApiConstant.API_CODE_FAIL);
            retMap.put(ApiConstant.API_MSG, e.getMessage());
            logger.error("注册异常", e);
        }

        return retMap;
    }

    public Map<String, Object> login(@RequestBody User user) {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put(ApiConstant.API_CODE, ApiConstant.API_CODE_SUCC);
        retMap.put(ApiConstant.API_MSG, "登录成功");

        try {

            // 判断用户名是否重复
            User dbUser = userDao.getOne(user);
            if (dbUser == null) {
                throw new ValidationException("用户不存在");
            }

            // 生成accessToken
            String accessToken = UUID.randomUUID().toString().replaceAll("-", "");

            // 缓存用户信息
            RedisUtil.setHashValue(RedisConstant.ACCESS_TOKEN, accessToken, JSON.toJSONString(dbUser));

            retMap.put(ApiConstant.API_DATA, accessToken);
        } catch (ValidationException e) {
            retMap.put(ApiConstant.API_CODE, ApiConstant.API_CODE_FAIL);
            retMap.put(ApiConstant.API_MSG, e.getMessage());
            logger.info("登录异常", e);
        } catch (Exception e) {
            retMap.put(ApiConstant.API_CODE, ApiConstant.API_CODE_FAIL);
            retMap.put(ApiConstant.API_MSG, e.getMessage());
            logger.error("登录异常", e);
        }

        return retMap;
    }

}
