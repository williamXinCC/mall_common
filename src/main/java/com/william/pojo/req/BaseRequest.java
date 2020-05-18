package com.william.pojo.req;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求标准类 IOS ANDROID MINI-WECHAT
 * @author xinchuang
 * @date 2018/7/5 19:43
 * @version v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRequest {
    /**
     * 平台
     */
    @TableField(exist = false)
    private String platform;
    /**
     * 时间戳
     */
    @TableField(exist = false)
    private String timeStamp;
    /**
     * 版本号
     */
    @TableField(exist = false)
    private String version;
    /**
     * 设备编号
     */
    @TableField(exist = false)
    private String deviceId;
    /**
     * 租户
     */
    @TableField(exist = false)
    private String tenantId;

    /**
     * 端
     */
    @TableField(exist = false)
    private String client;

}
