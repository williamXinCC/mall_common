package com.william.bcpojo.bcresp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/13 13:52
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class UserRoleResp {

    private Integer roleId;
    // 角色编号
    private String roleCode;
    private String roleName;
    private String roleDesc;
    private Integer deleteType;
    private String createId;
    private String createName;
    private String status;
    private String modId;
    private String modName;
    @JsonProperty("LAY_CHECKED")
    private Boolean LAY_CHECKED;


}
