package com.lazinesssheep.travel.entity.dto;

import com.lazinesssheep.travel.entity.common.Base;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class GoodOrder extends Base {
    private String goodId;
    private String startingTime;
    private String startingWeek;
    private String endingTime;
    private String endingWeek;
    private String total;
    private String residue;
    private String price;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getStartingWeek() {
        return startingWeek;
    }

    public void setStartingWeek(String startingWeek) {
        this.startingWeek = startingWeek;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }

    public String getEndingWeek() {
        return endingWeek;
    }

    public void setEndingWeek(String endingWeek) {
        this.endingWeek = endingWeek;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getResidue() {
        return residue;
    }

    public void setResidue(String residue) {
        this.residue = residue;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}