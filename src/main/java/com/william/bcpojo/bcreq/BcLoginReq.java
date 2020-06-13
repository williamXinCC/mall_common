package com.william.bcpojo.bcreq;

import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/5 17:38
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class BcLoginReq extends BcBaseReq {

    private String userPhone;
    private String password;
    private String captcha;
}
