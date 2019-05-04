package com.lazinesssheep.travel.entity.dto;

import com.lazinesssheep.travel.entity.common.Base;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class GoodReviews extends Base {
    private String goodId;
    private String content;
    private String reviewTime;
    private String supportNum;
    private String unSupportNum;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getSupportNum() {
        return supportNum;
    }

    public void setSupportNum(String supportNum) {
        this.supportNum = supportNum;
    }

    public String getUnSupportNum() {
        return unSupportNum;
    }

    public void setUnSupportNum(String unSupportNum) {
        this.unSupportNum = unSupportNum;
    }
}