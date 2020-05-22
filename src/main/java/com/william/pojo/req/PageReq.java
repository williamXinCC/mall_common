package com.william.pojo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/19 15:20
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageReq extends BaseRequest{

    private String startPage = "0";
    private String pageSize = "10";
}
