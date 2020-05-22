package com.william.pojo.resp;

import com.william.pojo.WilliamPicture;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/22 14:33
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
public class HomePageAdvResp {

    private List<WilliamPicture> homePageHot = new ArrayList<>();
    private List<WilliamPicture> homePageNew = new ArrayList<>();
    private List<WilliamPicture> homePageRecommend = new ArrayList<>();
    private List<WilliamPicture> homePageTop = new ArrayList<>();
}
