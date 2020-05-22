package com.william.pojo.resp;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 浏览历史
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 15:14
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FootmarkResp {

    private Integer count;
    private String hisId;
    private String createTime;
    private String goodsId;
    private String goodsImg;
    private String goodsName;



}
