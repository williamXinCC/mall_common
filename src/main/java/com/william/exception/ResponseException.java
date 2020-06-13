package com.william.exception;


import com.william.constant.RespCodeAndMsg;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2018/8/31 16:18
 */
public class ResponseException extends RuntimeException {

    private int code;
    private String message;

    public static void e(RespCodeAndMsg respCodeAndMsg) {
        throw new ResponseException(respCodeAndMsg);
    }

    public ResponseException(RespCodeAndMsg respCodeAndMsg) {
        code = respCodeAndMsg.getCode();
        message = respCodeAndMsg.getMessage();
    }

    public ResponseException(int code) {
        this.code = code;
        this.message = "";
    }

    public ResponseException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
