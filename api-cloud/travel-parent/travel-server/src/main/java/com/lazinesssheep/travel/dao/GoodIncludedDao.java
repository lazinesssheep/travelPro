package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.GoodIncluded;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodIncludedDao {

    public GoodIncluded get(String id);

    public List<GoodIncluded> findList(GoodIncluded goodIncluded);

    public List<GoodIncluded> findAllList();

    public int insert(GoodIncluded goodIncluded);

    public int insertBatch(List<GoodIncluded> goodIncludeds);

    public int update(GoodIncluded goodIncluded);

    public int delete(GoodIncluded goodIncluded);

}