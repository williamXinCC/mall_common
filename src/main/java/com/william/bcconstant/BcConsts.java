package com.william.bcconstant;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/11 11:00
 * @since Copyright(c) 爱睿智健康科技
 */
public interface BcConsts {

    // 默认密码
    String DEFAULT_PASSWORD = "123456";
    // 当前租户
    String TENANT_ID = "123";
    // 菜单 type类型 1 菜单 2 按钮
    Integer PERMISSION_TYPE_MENU = 1;
    Integer PERMISSION_TYPE_BUTTON = 2;

    /**
     * 用户类型
     */
    Integer USER_TYPE_SUPER = 2; // 管理员
    Integer USER_TYPE_NORMAL = 1;

}
