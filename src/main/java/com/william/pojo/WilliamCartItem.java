package com.william.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WilliamCartItem {
    private Long itemId;

    private String customerId;

    private String goodsId;

    private BigDecimal goodsUnit;

    private Integer goodsCnt;

    private String goodsSku;

    private BigDecimal subtotal;

    private Date createTime;

    private Integer status;

    private Date cellTime;

    private String tenantId;

    private String client;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public BigDecimal getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(BigDecimal goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Integer getGoodsCnt() {
        return goodsCnt;
    }

    public void setGoodsCnt(Integer goodsCnt) {
        this.goodsCnt = goodsCnt;
    }

    public String getGoodsSku() {
        return goodsSku;
    }

    public void setGoodsSku(String goodsSku) {
        this.goodsSku = goodsSku == null ? null : goodsSku.trim();
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
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

    public Date getCellTime() {
        return cellTime;
    }

    public void setCellTime(Date cellTime) {
        this.cellTime = cellTime;
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
}