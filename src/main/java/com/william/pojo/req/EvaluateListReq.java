package com.william.pojo.req;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 16:21
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="EvaluateListReq", description="商品评价")
public class EvaluateListReq extends BaseRequest{

    private String startPage = "0";
    private String pageSize = "10";
    private String type;
    private String contentType;
    private String goodsId;

}
