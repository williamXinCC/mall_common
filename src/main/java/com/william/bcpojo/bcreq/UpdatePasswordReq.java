package com.william.bcpojo.bcreq;

import lombok.Data;

/**
 * 修改密码
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/13 9:45
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class UpdatePasswordReq {

    private String userId;
    private String oldPassword;
    private String newPassword;
    private String renewPassword;
}
