package com.william.pojo.req;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 购物车数量
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/29 10:40
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UpdateCartItemNumReq", description="修改购物车项数量")
public class UpdateCartItemNumReq {

     private String itemId;
     // 1 添加 2 减少 3 选中
     private String type;
}
