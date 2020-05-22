package com.william.pojo.req;


import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/18 17:06
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UpdateCustomerReq", description="修改个人信息")
public class UpdateCustomerReq extends BaseRequest {

    private String customerPhone;

    private String customerPassword;

    private String customerName;

    private String customerGender;

    private String customerBirth;

    private String customerProvince;

    private String customerCity;

    private String customerDistricts;

    private String customerAddress;

    private String customerEmail;

    private String customerProfession;

}
