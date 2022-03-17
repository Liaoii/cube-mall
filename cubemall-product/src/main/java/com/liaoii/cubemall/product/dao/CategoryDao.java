package com.liaoii.cubemall.product.dao;

import com.liaoii.cubemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品类目
 * 
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
