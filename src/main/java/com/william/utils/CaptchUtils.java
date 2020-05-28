package com.william.utils;

import java.util.Random;

/**
 *   短信验证码生成器
 * @author     xinchuang
 * @date       2018/11/28 20:32
 * @version    v1.0
 * @since      @Copyright(c) 爱睿智健康科技(北京)有限公司
 */
public class CaptchUtils {

    /**
     * 短信验证码消息内容
     * @return String
     */
    public static String getRandomCode(){
        StringBuilder num = new StringBuilder();
        Random random= new Random();
        for (int i = 0; i < 4; i++) {
            String rand = String.valueOf(random.nextInt(10));
            num.append(rand);
        }
        return num.toString();
    }

}
