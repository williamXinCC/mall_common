package com.william.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WilliamCoupon {
    private Long id;

    private Integer type;

    private String name;

    private String image;

    private Integer platform;

    private Integer count;

    private Integer residueCount;

    private BigDecimal amount;

    private Integer perLimit;

    private Integer useLevel;

    private Integer couponType;

    private String couponTypeValue;

    private Integer useType;

    private String useTypeValue;

    private String remark;

    private Integer memberLevel;

    private Integer expiryType;

    private Integer expiryValue;

    private Date expiryStartTime;

    private Date expiryEndTime;

    private String createId;

    private Date createTime;

    private String modId;

    private Date modTime;

    private String tenantId;

    private String client;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getResidueCount() {
        return residueCount;
    }

    public void setResidueCount(Integer residueCount) {
        this.residueCount = residueCount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public Integer getUseLevel() {
        return useLevel;
    }

    public void setUseLevel(Integer useLevel) {
        this.useLevel = useLevel;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getCouponTypeValue() {
        return couponTypeValue;
    }

    public void setCouponTypeValue(String couponTypeValue) {
        this.couponTypeValue = couponTypeValue == null ? null : couponTypeValue.trim();
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public String getUseTypeValue() {
        return useTypeValue;
    }

    public void setUseTypeValue(String useTypeValue) {
        this.useTypeValue = useTypeValue == null ? null : useTypeValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Integer getExpiryType() {
        return expiryType;
    }

    public void setExpiryType(Integer expiryType) {
        this.expiryType = expiryType;
    }

    public Integer getExpiryValue() {
        return expiryValue;
    }

    public void setExpiryValue(Integer expiryValue) {
        this.expiryValue = expiryValue;
    }

    public Date getExpiryStartTime() {
        return expiryStartTime;
    }

    public void setExpiryStartTime(Date expiryStartTime) {
        this.expiryStartTime = expiryStartTime;
    }

    public Date getExpiryEndTime() {
        return expiryEndTime;
    }

    public void setExpiryEndTime(Date expiryEndTime) {
        this.expiryEndTime = expiryEndTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}