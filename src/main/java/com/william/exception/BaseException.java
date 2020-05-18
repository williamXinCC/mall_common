package com.william.exception;

public class BaseException extends RuntimeException {
    private String msg;
    private Integer code;

    public BaseException(Integer code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
