package com.william.pojo.resp;

import lombok.Data;

import java.util.Date;


/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/27 11:17
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class CustomerCouponResp {

    private String couponId;

    private String name;
    // 图片
    private String image;
    // 使用 1 全场通用 2 指定商品 3 指定店铺
    private Integer useType;
    // 优惠形式
    private Integer couponType;
    // 优惠金额
    private String couponTypeValue;
    // 优惠折扣
    private String couponTypeDiscount;
    // 开始时间
    private Date expiryStartTime;
    // 结束时间
    private Date expiryEndTime;
    // 使用门槛 0 无门槛
    private Integer useLevel;
    // 限领数量
    private Integer perLimit;
    // 已领取
    private Integer couponCount;
    // 总数
    private Integer count;
    // 剩余总数
    private Integer residueCount;
    // 使用时间
    private Date useTime;
}
