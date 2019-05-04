package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.Orderayinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface OrderayinfoDao {

    public Orderayinfo get(String id);

    public List<Orderayinfo> findList(Orderayinfo orderayinfo);

    public List<Orderayinfo> findAllList();

    public int insert(Orderayinfo orderayinfo);

    public int insertBatch(List<Orderayinfo> orderayinfos);

    public int update(Orderayinfo orderayinfo);

    public int delete(Orderayinfo orderayinfo);

}