package com.lazinesssheep.travel.entity.dto;

import java.io.Serializable;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class GoodItineraryDay implements Serializable {
    private String itineraryId;
    private String accommodationId;
    private String content;
    private String startingTime;
    private String endingTime;

    public String getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(String itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(String accommodationId) {
        this.accommodationId = accommodationId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }
}