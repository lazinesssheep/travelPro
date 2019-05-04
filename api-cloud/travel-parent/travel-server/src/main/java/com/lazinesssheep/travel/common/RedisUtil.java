package com.lazinesssheep.travel.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Redis 工具类
 */
@Component
public class RedisUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * 根据key获取Redis opsForHash中的值
     *
     * @param redisKeyConstant
     * @param redisKey
     * @return
     */
    public static String getHashValue(String redisKeyConstant, String redisKey) {
        if (getRedisTemplate().opsForHash().hasKey(redisKeyConstant, redisKey)) {
            return String.valueOf(getRedisTemplate().opsForHash().get(redisKeyConstant, redisKey));
        } else {
            return "";
        }
    }

    /**
     * 根据key获取Redis opsForHash中的值
     *
     * @param redisKeyConstant
     * @return
     */
    public static String getHashValue(String redisKeyConstant) {
        return String.valueOf(getRedisTemplate().opsForHash().values(redisKeyConstant));
    }

    /**
     * 根据key获取Redis opsForValue中的值
     *
     * @param redisKey 键
     * @return
     */
    public static String getValue(String redisKey) {
        return String.valueOf(getRedisTemplate().opsForValue().get(redisKey));
    }

    /**
     * 设置Redis opsForHash中的值
     *
     * @param redisKeyConstant 常量key
     * @param redisKey         key
     * @param redisValue       值
     */
    public static void setHashValue(String redisKeyConstant, String redisKey, String redisValue) {
        getRedisTemplate().opsForHash().put(redisKeyConstant, redisKey, redisValue);
    }

    /**
     * 设置Redis opsForValue中的值
     *
     * @param redisKey   键
     * @param redisValue 值
     */
    public static void setValue(String redisKey, String redisValue) {
        getRedisTemplate().opsForValue().set(redisKey, redisValue);
    }

    /**
     * 根据key删除Redis opsForHash中的值
     *
     * @param redisKeyConstant
     * @param redisKey
     * @return
     */
    public static Long deleteHash(String redisKeyConstant, String redisKey) {
        return getRedisTemplate().opsForHash().delete(redisKeyConstant, redisKey);
    }


    public static RedisTemplate getRedisTemplate() {
        return (RedisTemplate) getApplicationContext().getBean("redisTemplate");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (RedisUtil.applicationContext == null) {
            RedisUtil.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
