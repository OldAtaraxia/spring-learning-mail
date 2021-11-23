package com.oldataraxia.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oldataraxia.common.utils.PageUtils;
import com.oldataraxia.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ????&???Է???????
 *
 * @author oldataraxia
 * @email aqwanghaoxuan@163.com
 * @date 2021-10-17 16:59:02
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

