package com.william.pojo.req;

import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 17:48
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class CollectReq extends BaseRequest{

    private String collectId;
    private String type;
}
