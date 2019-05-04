package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.Accommodation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface AccommodationDao {

    public Accommodation get(String id);

    public List<Accommodation> findList(Accommodation accommodation);

    public List<Accommodation> findAllList();

    public int insert(Accommodation accommodation);

    public int insertBatch(List<Accommodation> accommodations);

    public int update(Accommodation accommodation);

    public int delete(Accommodation accommodation);

}