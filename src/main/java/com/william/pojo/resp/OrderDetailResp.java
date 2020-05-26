package com.william.pojo.resp;

import com.william.pojo.WilliamGoods;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/25 17:22
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class OrderDetailResp {

    private String orderId;
    private Integer orderStatus;
    private Integer productCount;
    private String orderAmountTotal;
    private Date orderCreateTime;

    private List<WilliamGoods> orderGoodsList;
}
