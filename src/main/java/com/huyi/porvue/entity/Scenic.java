package com.huyi.porvue.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author huyi
 * @since 2020-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_scenic")
public class Scenic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String level;

    /**
     * 景点风格
     */
    private String type;

    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区/县
     */
    private Integer district;

    /**
     * 门票
     */
    private String ticket;

    /**
     * 图片
     */
    private String pic;

    /**
     * 介绍
     */
    private String introduction;


}
