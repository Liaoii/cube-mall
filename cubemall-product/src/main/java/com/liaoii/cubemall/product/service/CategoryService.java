package com.liaoii.cubemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品类目
 *
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:07
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

