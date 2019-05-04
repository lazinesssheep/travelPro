package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface UserDao {

    public User getOne(User user);

    public int insert(User user);

    public int update(User user);

}