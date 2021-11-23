package com.oldataraxia.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oldataraxia.common.utils.PageUtils;
import com.oldataraxia.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku??Ϣ
 *
 * @author oldataraxia
 * @email aqwanghaoxuan@163.com
 * @date 2021-10-17 16:59:02
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

