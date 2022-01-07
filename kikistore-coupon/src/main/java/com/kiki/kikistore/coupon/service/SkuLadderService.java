package com.kiki.kikistore.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiki.common.utils.PageUtils;
import com.kiki.kikistore.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 11:43:28
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

