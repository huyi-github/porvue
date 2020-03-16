package com.huyi.porvue.entity;

import lombok.Data;

@Data
public class UserVo extends User{
    private String provinceName;
    private String cityName;
    private String  districtName;

    private String rids;
    private String rnames;
    private String  rnameZhs;

}
