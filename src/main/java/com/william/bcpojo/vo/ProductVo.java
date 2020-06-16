package com.william.bcpojo.vo;

import com.william.pojo.WilliamProduct;
import lombok.Data;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/6/16 15:51
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class ProductVo extends WilliamProduct{

    private static final long serialVersionUID = 1L;
    private Integer page=1;
    private Integer limit=10;
}
