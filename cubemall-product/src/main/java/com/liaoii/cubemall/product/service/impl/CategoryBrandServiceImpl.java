package com.liaoii.cubemall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.common.utils.Query;

import com.liaoii.cubemall.product.dao.CategoryBrandDao;
import com.liaoii.cubemall.product.entity.CategoryBrandEntity;
import com.liaoii.cubemall.product.service.CategoryBrandService;


@Service("categoryBrandService")
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandDao, CategoryBrandEntity> implements CategoryBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandEntity> page = this.page(
                new Query<CategoryBrandEntity>().getPage(params),
                new QueryWrapper<CategoryBrandEntity>()
        );

        return new PageUtils(page);
    }

}