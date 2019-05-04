package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface OrderDao {

    public Order get(String id);

    public List<Order> findList(Order order);

    public List<Order> findAllList();

    public int insert(Order order);

    public int insertBatch(List<Order> orders);

    public int update(Order order);

    public int delete(Order order);

}