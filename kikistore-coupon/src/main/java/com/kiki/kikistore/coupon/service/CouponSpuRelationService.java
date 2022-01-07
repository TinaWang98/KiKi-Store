package com.kiki.kikistore.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiki.common.utils.PageUtils;
import com.kiki.kikistore.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 11:43:28
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

