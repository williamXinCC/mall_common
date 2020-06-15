package com.william.pojo;


import com.william.constant.RespCodeAndMsg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/12 19:11
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Integer code = 0;
    private String msg = "";
    private Object data;
    private Long count = 0L;
    private String remark = "";

    public Result(Object data) {
        this.data = data;
    }


    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Long count, Object data) {
        this.count = count;
        this.data = data;
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Result(Integer code, String msg, String remark) {
        this.code = code;
        this.msg = msg;
        this.remark = remark;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg, Object data, Long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public Result(Integer code, String msg, Object data, String remark) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.remark = remark;
    }

    public static Result getResult(RespCodeAndMsg respCodeAndMsg){
        return new Result(respCodeAndMsg.getCode(),respCodeAndMsg.getMessage());
    }

    public static Result getResult(RespCodeAndMsg respCodeAndMsg,Object data){
        return new Result(respCodeAndMsg.getCode(),respCodeAndMsg.getMessage(),data);
    }

    public static Result getResult(RespCodeAndMsg respCodeAndMsg,Object data,Long count){
        return new Result(respCodeAndMsg.getCode(),respCodeAndMsg.getMessage(),data,count);
    }

    public static Result getResult(RespCodeAndMsg respCodeAndMsg,String remark){
        return new Result(respCodeAndMsg.getCode(),respCodeAndMsg.getMessage(),remark);
    }


}
