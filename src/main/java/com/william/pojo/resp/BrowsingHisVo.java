package com.william.pojo.resp;

import com.william.pojo.WilliamGoods;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/12/30 18:18
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BrowsingHisVo {

    @ApiModelProperty(value = "hisId")
    private Integer hisId;

    @ApiModelProperty(value = "客户id")
    private String customerId;

    @ApiModelProperty(value = "商品id")
    private WilliamGoods williamGoods;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
