package com.william.bcpojo.echarts;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EchartsEntity {

    private String name;
    private Double value;

    public EchartsEntity(String name, Double value) {
        this.name = name;
        this.value = value;
    }
}
