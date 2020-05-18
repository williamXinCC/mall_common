package com.william.pojo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2018/8/9 17:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageConditionReq extends BaseRequest{

    private String startPage = "0";
    private String pageSize = "10";
    @NotEmpty(message = "关键字为空")
    private String keyName;

}
