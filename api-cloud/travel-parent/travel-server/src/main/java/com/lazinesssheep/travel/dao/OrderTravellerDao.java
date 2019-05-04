package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.OrderTraveller;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface OrderTravellerDao {

    public OrderTraveller get(String id);

    public List<OrderTraveller> findList(OrderTraveller orderTraveller);

    public List<OrderTraveller> findAllList();

    public int insert(OrderTraveller orderTraveller);

    public int insertBatch(List<OrderTraveller> orderTravellers);

    public int update(OrderTraveller orderTraveller);

    public int delete(OrderTraveller orderTraveller);

}