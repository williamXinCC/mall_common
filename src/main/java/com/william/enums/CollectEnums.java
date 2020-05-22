package com.william.enums;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 17:58
 * @since Copyright(c) 爱睿智健康科技
 */
public enum  CollectEnums {

    GOODS_COLLECT_TYPE("商品收藏",1),
    STORE_COLLECT_TYPE("店铺收藏",2);

    CollectEnums(String type, Integer code) {
        this.type = type;
        this.code = code;
    }

    private String type;
    private Integer code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
