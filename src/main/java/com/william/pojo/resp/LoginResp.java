package com.william.pojo.resp;

import com.william.pojo.WilliamCustomer;
import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/4/28 17:23
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class LoginResp {

    private WilliamCustomer customer;
    private String accessToken;
}
