package com.liaoii.cubemall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liaoii.cubemall.common.utils.PageUtils;
import com.liaoii.cubemall.common.utils.Query;

import com.liaoii.cubemall.product.dao.TreeDao;
import com.liaoii.cubemall.product.entity.TreeEntity;
import com.liaoii.cubemall.product.service.TreeService;


@Service("treeService")
public class TreeServiceImpl extends ServiceImpl<TreeDao, TreeEntity> implements TreeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TreeEntity> page = this.page(
                new Query<TreeEntity>().getPage(params),
                new QueryWrapper<TreeEntity>()
        );

        return new PageUtils(page);
    }

}