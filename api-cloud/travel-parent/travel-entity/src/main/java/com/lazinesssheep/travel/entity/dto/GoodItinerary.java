package com.lazinesssheep.travel.entity.dto;

import com.lazinesssheep.travel.entity.common.Base;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class GoodItinerary extends Base {
    private String goodId;
    private String duration;
    private String countries;
    private String ages;
    private String startingPoint;
    private String endingPoint;
    private String introduction;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getCountries() {
        return countries;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    public String getAges() {
        return ages;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }

    public String getEndingPoint() {
        return endingPoint;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return introduction;
    }

}