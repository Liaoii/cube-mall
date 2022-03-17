package com.liaoii.cubemall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu描述
 * 
 * @author liaoxi
 * @email liaoxi33215@gmail.com
 * @date 2022-03-17 21:37:07
 */
@Data
@TableName("tb_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * 描述
	 */
	private String decript;

}
