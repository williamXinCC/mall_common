package com.william.pojo.resp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/21 14:53
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class CategoryTreeNodesResp {

    private Integer id;
    private Integer pid;
    private Integer seq;
    private String title;
    private String icon;
    private String href;
    private String avdImage;
    private Boolean spread;
    private List<CategoryTreeNodesResp> child = new ArrayList<>();


}
