package com.william.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WilliamOrder {
    private String orderId;

    private Integer orderStatus;

    private Integer afterStatus;

    private Integer productCount;

    private BigDecimal productAmountTotal;

    private BigDecimal orderAmountTotal;

    private BigDecimal logisticsFee;

    private Integer logisticsType;

    private String addressId;

    private String payChannel;

    private String outTradeNo;

    private String escrowTradeNo;

    private Integer orderType;

    private String orderCreateId;

    private Date orderCreateTime;

    private String tenantId;

    private String client;

    private String operatePermission;

    private String modId;

    private Date modTime;

    private String deleteId;

    private Date deleteTime;

    private Integer status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getAfterStatus() {
        return afterStatus;
    }

    public void setAfterStatus(Integer afterStatus) {
        this.afterStatus = afterStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductAmountTotal() {
        return productAmountTotal;
    }

    public void setProductAmountTotal(BigDecimal productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    public BigDecimal getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(BigDecimal orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public BigDecimal getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(BigDecimal logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public Integer getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Integer logisticsType) {
        this.logisticsType = logisticsType;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getEscrowTradeNo() {
        return escrowTradeNo;
    }

    public void setEscrowTradeNo(String escrowTradeNo) {
        this.escrowTradeNo = escrowTradeNo == null ? null : escrowTradeNo.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderCreateId() {
        return orderCreateId;
    }

    public void setOrderCreateId(String orderCreateId) {
        this.orderCreateId = orderCreateId == null ? null : orderCreateId.trim();
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    public String getOperatePermission() {
        return operatePermission;
    }

    public void setOperatePermission(String operatePermission) {
        this.operatePermission = operatePermission == null ? null : operatePermission.trim();
    }

    public String getModId() {
        return modId;
    }

    public void setModId(String modId) {
        this.modId = modId == null ? null : modId.trim();
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(String deleteId) {
        this.deleteId = deleteId == null ? null : deleteId.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}