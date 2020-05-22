package com.william.pojo.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/20 14:02
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="EvaluateCountResp", description="评价统计")
public class EvaluateCountResp {

    // 全部
    private Integer total;
    // 好评
    private Integer good;
    // 中评
    private Integer ordinary;
    // 差评
    private Integer negative;
    // 有图
    private Integer hasImage;
    // 追加
    private Integer addTo;
}
