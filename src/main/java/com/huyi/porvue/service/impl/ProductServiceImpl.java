package com.huyi.porvue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyi.porvue.entity.Product;
import com.huyi.porvue.entity.ProductVo;
import com.huyi.porvue.mapper.ProductMapper;
import com.huyi.porvue.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huyi
 * @since 2020-03-13
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public IPage selectPageVo(Page page, ProductVo vo) {
        return productMapper.selectPageVo(page,vo);
    }
}
