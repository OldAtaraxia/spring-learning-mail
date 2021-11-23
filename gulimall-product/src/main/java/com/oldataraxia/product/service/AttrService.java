package com.oldataraxia.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oldataraxia.common.utils.PageUtils;
import com.oldataraxia.product.entity.AttrEntity;

import java.util.Map;

/**
 * ??Ʒ?
 *
 * @author oldataraxia
 * @email aqwanghaoxuan@163.com
 * @date 2021-10-17 16:59:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

