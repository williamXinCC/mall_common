package com.william.bcpojo.echarts;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/12/6 10:47
 * @since Copyright(c) 爱睿智健康科技
 */
@Data
@NoArgsConstructor
public class BaseStatistics {

    private String name;
    private Object value;

    public BaseStatistics(String name, Double value) {
        this.name = name;
        this.value = value;
    }
}
