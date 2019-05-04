package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.GoodOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodOrderDao {

    public GoodOrder get(String id);

    public List<GoodOrder> findList(GoodOrder goodOrder);

    public List<GoodOrder> findAllList();

    public int insert(GoodOrder goodOrder);

    public int insertBatch(List<GoodOrder> goodOrders);

    public int update(GoodOrder goodOrder);

    public int delete(GoodOrder goodOrder);

}