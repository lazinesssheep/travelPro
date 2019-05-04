package com.lazinesssheep.travel.dao;

import com.lazinesssheep.travel.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
@Mapper
public interface ManagerDao {

    public Manager get(String id);

    public List<Manager> findList(Manager manager);

    public List<Manager> findAllList();

    public int insert(Manager manager);

    public int insertBatch(List<Manager> managers);

    public int update(Manager manager);

    public int delete(Manager manager);

}