package com.vone.mq.dto;

import java.math.BigDecimal;

public class CreateOrderRes {
    private String payId;
    private String orderId;
    private int payType;
    private BigDecimal price;
    private BigDecimal reallyPrice;
    private String payUrl;
    private int isAuto;
    private int state;
    private int timeOut;
    private long date;

    public CreateOrderRes(String payId, String orderId, int payType, double price, double reallyPrice, String payUrl, int isAuto, int state, int timeOut, long date) {
        this.payId = payId;
        this.orderId = orderId;
        this.payType = payType;
        this.price = BigDecimal.valueOf(price).setScale(2,BigDecimal.ROUND_HALF_UP);
        this.reallyPrice = BigDecimal.valueOf(reallyPrice).setScale(2,BigDecimal.ROUND_HALF_UP);
        this.payUrl = payUrl;
        this.isAuto = isAuto;
        this.state = state;
        this.timeOut = timeOut;
        this.date = date;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getReallyPrice() {
        return reallyPrice;
    }

    public void setReallyPrice(BigDecimal reallyPrice) {
        this.reallyPrice = reallyPrice;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public int getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(int isAuto) {
        this.isAuto = isAuto;
    }
}
