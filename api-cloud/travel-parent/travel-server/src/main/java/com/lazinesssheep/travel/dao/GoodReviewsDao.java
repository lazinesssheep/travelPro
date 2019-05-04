package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.GoodReviews;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodReviewsDao {

    public GoodReviews get(String id);

    public List<GoodReviews> findList(GoodReviews goodReviews);

    public List<GoodReviews> findAllList();

    public int insert(GoodReviews goodReviews);

    public int insertBatch(List<GoodReviews> goodReviewss);

    public int update(GoodReviews goodReviews);

    public int delete(GoodReviews goodReviews);

}