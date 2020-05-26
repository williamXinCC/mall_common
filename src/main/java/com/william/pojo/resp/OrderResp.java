package com.william.pojo.resp;

import com.william.pojo.WilliamOrderGoods;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 订单
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/25 15:23
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class OrderResp {

    private String orderId;
    private Integer orderStatus;
    private Integer productCount;
    private String orderAmountTotal;
    private Date orderCreateTime;

    private List<WilliamOrderGoods> orderGoodsList;

}
