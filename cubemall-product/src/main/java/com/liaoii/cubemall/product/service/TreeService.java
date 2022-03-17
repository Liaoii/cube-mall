package com.liaoii.cubemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.product.entity.TreeEntity;

import java.util.Map;

/**
 * 
 *
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:06
 */
public interface TreeService extends IService<TreeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

