package com.william.bcpojo.vo;

import com.william.bcpojo.WilliamPermission;
import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/15 14:14
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class PermissionVo extends WilliamPermission{

    private static final long serialVersionUID = 1L;
    private Integer page=1;
    private Integer limit=10;
}
