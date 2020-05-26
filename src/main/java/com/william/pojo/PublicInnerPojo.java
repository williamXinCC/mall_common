package com.william.pojo;

import lombok.Data;

/**
 * 内部共享实体
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/22 17:44
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class PublicInnerPojo {

    private String startPage;
    private String pageSize;
    private String tenantId;
    private String client;
    private String uid;
}
