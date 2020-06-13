package com.william.bcpojo.bcresp;

import lombok.Data;

import java.util.Date;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/11 16:57
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class UserInfoResp {

    private String userId;

    private Integer deptId;

    private String deptName;

    private Integer userType;

    private String userName;

    private String userPhone;

    private String userPassword;

    private String userIcon;

    private Integer gender;

    private Date birth;

    private String email;

    private String idcard;

    private String workNum;

}
