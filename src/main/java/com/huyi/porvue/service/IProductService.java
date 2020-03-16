package com.huyi.porvue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huyi.porvue.entity.ProductVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huyi
 * @since 2020-03-13
 */
public interface IProductService extends IService<Product> {

    IPage selectPageVo(Page page, ProductVo vo);
}
