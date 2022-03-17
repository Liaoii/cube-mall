package com.liaoii.cubemall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu
 * 
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:06
 */
@Data
@TableName("tb_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spuid
	 */
	private Long spuId;
	/**
	 * 属性id
	 */
	private Long attrId;
	/**
	 * 属性名称
	 */
	private String attrName;
	/**
	 * 属性值
	 */
	private String attrValue;
	/**
	 * 属性排序
	 */
	private Integer attrSort;
	/**
	 * 显示
	 */
	private Integer quickShow;

}
