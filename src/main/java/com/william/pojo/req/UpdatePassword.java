package com.william.pojo.req;

import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/28 15:03
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class UpdatePassword extends BaseRequest{

    private String phone;
    private String captch;
    private String password;
    private String repassword;
}
