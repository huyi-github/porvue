package com.huyi.porvue.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NationVo implements Serializable {
    //对应三级联动的id值 id，cid，did
    private Integer value;

    private String label;

    private List<NationVo> children;

}
