package com.william.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

/**
 *   MD5
 * @author     xinchuang
 * @date       2018/11/28 20:31
 * @version    v1.0
 * @since      @Copyright(c) 爱睿智健康科技(北京)有限公司
 */
public class Md5Util {

    /**
     * Md5加密
     * @author     xinchuang
     * @param string :
     * @return : java.lang.String
     */
    public static String md5(String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 is unsupported", e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MessageDigest不支持MD5Util", e);
        }
        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 0x10) {
                hex.append("0");
            }
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString();
    }


    /**
     * md5签名
     *
     * 按参数名称升序，将参数值进行连接 签名
     * @param appSecret
     * @param params
     * @return
     */
    public static String sign(String appSecret, TreeMap<String, String> params) {
        StringBuilder paramValues = new StringBuilder();
        params.put("appSecret", appSecret);

        for (Map.Entry<String, String> entry : params.entrySet()) {
            paramValues.append(entry.getValue());
        }
        System.out.println(md5(paramValues.toString()));
        return md5(paramValues.toString());
    }

}
