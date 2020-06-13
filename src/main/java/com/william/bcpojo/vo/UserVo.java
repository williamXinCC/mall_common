package com.william.bcpojo.vo;

import com.william.bcpojo.WilliamUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/11/25 16:53
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends WilliamUser {

    private static final long serialVersionUID = 1L;
    private Integer page=1;
    private Integer limit=10;
}
