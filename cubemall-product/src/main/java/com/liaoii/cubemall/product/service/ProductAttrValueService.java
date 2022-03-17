package com.liaoii.cubemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu
 *
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:06
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

