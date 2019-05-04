package com.lazinesssheep.travel.entity.dto;

import com.lazinesssheep.travel.entity.common.Base;

/**
 * Author lazinesssheep
 * Date  2019-05-01
 */
public class Order extends Base {
    private String goodId;
    private String goodOrderId;
    private String orderNo;
    private String Address;
    private String City;
    private String Postal;
    private String Province;
    private String orderTime;
    private String orderStatus;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodOrderId() {
        return goodOrderId;
    }

    public void setGoodOrderId(String goodOrderId) {
        this.goodOrderId = goodOrderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostal() {
        return Postal;
    }

    public void setPostal(String postal) {
        Postal = postal;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}