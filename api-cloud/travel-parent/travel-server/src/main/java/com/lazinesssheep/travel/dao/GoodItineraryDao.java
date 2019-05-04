package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.GoodItinerary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodItineraryDao {

    public GoodItinerary get(String id);

    public List<GoodItinerary> findList(GoodItinerary goodItinerary);

    public List<GoodItinerary> findAllList();

    public int insert(GoodItinerary goodItinerary);

    public int insertBatch(List<GoodItinerary> goodItinerarys);

    public int update(GoodItinerary goodItinerary);

    public int delete(GoodItinerary goodItinerary);

}