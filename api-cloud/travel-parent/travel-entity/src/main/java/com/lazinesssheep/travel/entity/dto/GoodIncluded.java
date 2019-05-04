package com.lazinesssheep.travel.entity.dto;

import com.lazinesssheep.travel.entity.common.Base;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class GoodIncluded extends Base {
    private String goodId;
    private String title;
    private String desc;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}