package com.william.pojo.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/4/28 9:20
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginByPasswordReq extends BaseRequest {

    private String customerPhone;
    private String customerPassword;
}
