package com.kiki.kikistore.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiki.common.utils.PageUtils;
import com.kiki.kikistore.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 11:43:28
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

