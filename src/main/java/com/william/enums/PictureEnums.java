package com.william.enums;

/**
 * 图片分类 与数据库对应
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 17:58
 * @since Copyright(c) 爱睿智健康科技
 */
public enum PictureEnums {

    HOMEPAGE_BANNER("首页轮播图",1);

    PictureEnums(String type, Integer code) {
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
