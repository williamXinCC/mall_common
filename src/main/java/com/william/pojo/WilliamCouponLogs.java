package com.william.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券使用记录
 * @author     xinchuang
 * @date       2020/5/27 11:16
 * @version    v1.0
 * @since      @Copyright(c) 爱睿智健康科技(北京)有限公司
 */
public class WilliamCouponLogs {
    private Long id;

    private Long buyerId;

    private Long couponReceiveId;

    private String orderId;

    private BigDecimal orderOriginalAmount;

    private BigDecimal couponAmount;

    private BigDecimal orderFinalAmount;

    private Date createTime;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getCouponReceiveId() {
        return couponReceiveId;
    }

    public void setCouponReceiveId(Long couponReceiveId) {
        this.couponReceiveId = couponReceiveId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getOrderOriginalAmount() {
        return orderOriginalAmount;
    }

    public void setOrderOriginalAmount(BigDecimal orderOriginalAmount) {
        this.orderOriginalAmount = orderOriginalAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getOrderFinalAmount() {
        return orderFinalAmount;
    }

    public void setOrderFinalAmount(BigDecimal orderFinalAmount) {
        this.orderFinalAmount = orderFinalAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}