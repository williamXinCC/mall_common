package com.william.pojo.resp;

import com.william.pojo.WilliamGoods;
import com.william.pojo.WilliamPicture;
import com.william.pojo.WilliamSysNotice;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2020/5/20 16:19
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="HomePageResp", description="首页")
public class HomePageResp {

    private List<WilliamPicture> bannerList;

    private List<WilliamSysNotice> homeNoticList;

    private List<WilliamGoods> recommendGoodsList;

    private List<WilliamGoods> hotGoodsList;

    private List<WilliamGoods> newGoodsList;

    private List<WilliamGoods> likeGoodsList;

    private HomePageAdvResp homePageAdvResp;
}
