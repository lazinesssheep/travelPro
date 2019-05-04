package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodDao {

    public Good get(String id);

    public List<Good> findList(Good good);

    public List<Good> findAllList();

    public int insert(Good good);

    public int insertBatch(List<Good> goods);

    public int update(Good good);

    public int delete(Good good);

}