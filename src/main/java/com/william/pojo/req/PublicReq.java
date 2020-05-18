package com.william.pojo.req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2018/9/22 10:40
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PublicReq", description="公共请求单一参数")
public class PublicReq extends BaseRequest{

    @NotEmpty(message = "关键字为空")
    @ApiModelProperty(value = "关键字")
    private String keyName;

}
