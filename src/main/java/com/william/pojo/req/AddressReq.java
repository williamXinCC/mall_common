package com.william.pojo.req;

import lombok.Data;

import java.util.Date;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/26 13:47
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class AddressReq extends BaseRequest {

    private String id;

    private String customerId;

    private String receivingName;

    private String receivingPhone;

    private String province;

    private String city;

    private String county;

    private String location;

    private String checked;

    private String type;

}
