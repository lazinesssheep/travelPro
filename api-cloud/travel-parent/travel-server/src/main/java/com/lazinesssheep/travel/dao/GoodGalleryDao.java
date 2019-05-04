package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.GoodGallery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface GoodGalleryDao {

    public GoodGallery get(String id);

    public List<GoodGallery> findList(GoodGallery goodGallery);

    public List<GoodGallery> findAllList();

    public int insert(GoodGallery goodGallery);

    public int insertBatch(List<GoodGallery> goodGallerys);

    public int update(GoodGallery goodGallery);

    public int delete(GoodGallery goodGallery);

}