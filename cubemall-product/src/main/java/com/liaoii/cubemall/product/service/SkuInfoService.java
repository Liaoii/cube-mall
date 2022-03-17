package com.liaoii.cubemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku??Ϣ
 *
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:07
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

