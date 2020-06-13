package com.william.pojo.resp;

import com.william.pojo.WilliamCartItem;
import com.william.pojo.WilliamGoods;
import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/28 17:42
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class CartResp {

    private WilliamCartItem williamCartItem;
    private WilliamGoods williamGoods;
}
