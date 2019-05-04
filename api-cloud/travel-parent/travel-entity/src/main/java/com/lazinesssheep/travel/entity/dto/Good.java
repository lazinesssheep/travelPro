package com.lazinesssheep.travel.entity.dto;

import com.lazinesssheep.travel.entity.common.Base;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class Good extends Base {
    private String title;
    private String desc;
    private String address;
    private String startingPoint;
    private String endingPoint;
    private String duration;
    private String highlights;
    private String state;

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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}