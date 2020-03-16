package com.huyi.porvue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huyi.porvue.entity.ProductVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huyi
 * @since 2020-03-13
 */
public interface ProductMapper extends BaseMapper<Product> {

    IPage selectPageVo(Page page, ProductVo vo);
}
