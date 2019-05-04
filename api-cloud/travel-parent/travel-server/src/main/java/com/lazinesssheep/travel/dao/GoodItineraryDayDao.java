package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.GoodItineraryDay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodItineraryDayDao {

    public GoodItineraryDay get(String id);

    public List<GoodItineraryDay> findList(GoodItineraryDay goodItineraryDay);

    public List<GoodItineraryDay> findAllList();

    public int insert(GoodItineraryDay goodItineraryDay);

    public int insertBatch(List<GoodItineraryDay> goodItineraryDays);

    public int update(GoodItineraryDay goodItineraryDay);

    public int delete(GoodItineraryDay goodItineraryDay);

}