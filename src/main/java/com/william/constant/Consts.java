package com.william.constant;

/**
 * 业务
 * @author xinchuang
 * @version v1.0
 * @date 2019/12/3 18:37
 * @since Copyright(c) 爱睿智健康科技
 */
public interface Consts {

    // 短信验证码
    String LOGIN_CAPTCH_SUFFIX = "LOGIN:CAPTCH";
    // token
    String LOGIN_TOKEN_SUFFIX = "LOGIN:TOKEN";
    // token 30天
    Integer REDIS_TOKEN_EXPIRE_TIME = 60 * 60 * 24 * 30;
    // 验证码过期时间 1分钟
    Integer REDIS_CAPTCH_EXPIRE_TIME = 1*60;
    // 小程序端
    String MINI_CHAT_CLIENT = "miniWeChat";
    String MANAGER_ROLE_ID = "5ddbaf823646973f0c0b0f83";
    // 加密秘钥
    String AES_KEY = "1214WilliAm1985";

    Integer SINGAL_ZERO = 0;
    Integer SINGAL_ONE = 1;
}
