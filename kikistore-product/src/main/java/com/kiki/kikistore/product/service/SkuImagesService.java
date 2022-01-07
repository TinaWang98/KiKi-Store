package com.kiki.kikistore.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiki.common.utils.PageUtils;
import com.kiki.kikistore.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-02 20:01:19
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

