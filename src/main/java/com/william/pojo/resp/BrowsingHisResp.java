package com.william.pojo.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/12/31 8:50
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BrowsingHisResp", description="浏览历史按日期")
public class BrowsingHisResp {

    private String dayTime;
    private List<BrowsingHisVo> browsingHisVoList;
}
