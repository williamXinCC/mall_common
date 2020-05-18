package com.william.utils;

import com.william.constant.Consts;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 *   加解密工具类
 * @author     xinchuang
 * @date       2018/11/28 20:28
 * @version    v1.0
 * @since      @Copyright(c) 爱睿智健康科技(北京)有限公司
 */
public class AESCipher {

    private static final String IV_STRING = "16-Bytes--String";

    private static String encryptAES(String content, String key) throws UnsupportedEncodingException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {

        byte[] byteContent = content.getBytes("UTF-8");

        // 注意，为了能与 iOS 统一
        // 这里的 key 不可以使用 KeyGenerator、SecureRandom、SecretKey 生成
        byte[] enCodeFormat = key.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");

        byte[] initParam = IV_STRING.getBytes();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);

        // 指定加密的算法、工作模式和填充方式
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

        byte[] encryptedBytes = cipher.doFinal(byteContent);

        // 同样对加密后数据进行 base64 编码
        BASE64Encoder encoder = new BASE64Encoder();;
        return encoder.encode(encryptedBytes);
    }

    /**将16进制转换为二进制
     * @param hexStr
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1){
            return null;
        }
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }


    private static String decryptAES(String content, String key){
        byte[] result = null;
        String rs = "";
        try{
            // base64 解码
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] encryptedBytes = decoder.decodeBuffer(content);

            byte[] enCodeFormat = key.getBytes();
            SecretKeySpec secretKey = new SecretKeySpec(enCodeFormat, "AES");

            byte[] initParam = IV_STRING.getBytes();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);

            result = cipher.doFinal(encryptedBytes);
            return new String(result, "UTF-8");
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    /**将二进制转换成16进制
     * @param buf
     * @return
     */
    public static String parseByte2HexStr(byte[] buf) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }


    /**
     * 解密入口
     *
     * @param string 解密对象字符串
     * @return 解密后的字符串
     * @throws Exception
     * @throws UnsupportedEncodingException
     */
    public static String decrypt(String string){
        return decryptAES(string, Consts.AES_KEY);
    }

    /**
     * 加密入口
     *
     * @param string 加密对象字符串
     * @return 加密后的字符串
     * @throws Exception
     */
    public static String encrypt(String string) throws Exception {
        return encryptAES(string, Consts.AES_KEY);
    }

}
