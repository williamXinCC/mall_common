package com.william.pojo.resp;

import com.william.pojo.WilliamEvaluate;
import com.william.pojo.WilliamGoods;
import com.william.pojo.WilliamGoodsAttribute;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 17:05
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GoodsInfoPageResp", description="商品详情页面")
public class GoodsInfoPageResp {

    private WilliamGoods williamGoods;
    private List<WilliamEvaluate> evaluateList;
    private Integer evaluateTotalCount;
    private List<WilliamGoodsAttribute> goodsAttributeList;
    private Integer alreadyCollect;

}
