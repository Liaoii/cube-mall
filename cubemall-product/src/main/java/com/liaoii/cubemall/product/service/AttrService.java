package com.liaoii.cubemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 属性表
 *
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:07
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

