package com.william.utils;


import com.william.constant.Constant;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.util.ByteSource;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/25 17:16
 * @since Copyright(c) 爱睿智健康科技
 */
public class IdSaltUtils {

    public static ByteSource getSalt(String username,String uid){
        String baseSalt = username + uid + Constant.Salt_KEY;
        ByteSource credentialsSalt = ByteSource.Util.bytes(baseSalt.getBytes());
        return credentialsSalt;
    }

    public static void main(String[] args) {
        ByteSource william = getSalt("william", "1");
        System.out.println(william);
        String s = new Md5Hash("123", william, 2).toString();
        System.out.println(s);
    }
}
