package com.liaoii.cubemall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息
 * 
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:07
 */
@Data
@TableName("tb_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Long id;
	/**
	 * spu名称
	 */
	private String spuName;
	/**
	 * spu描述
	 */
	private String spuDescription;
	/**
	 * 分类ID
	 */
	private Long categoryId;
	/**
	 * 品牌ID
	 */
	private Long brandId;
	/**
	 * 权重
	 */
	private BigDecimal weight;
	/**
	 * 发布状态
	 */
	private Integer publishStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
