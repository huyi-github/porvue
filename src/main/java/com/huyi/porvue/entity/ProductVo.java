package com.huyi.porvue.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductVo extends Product implements Serializable {
    private String provinceName;
    private String cityName;
    private String  districtName;

    private String rids;
    private String rnames;

    private Double price1;
    private Double price2;


}
