package com.kiki.kikistore.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiki.common.utils.PageUtils;
import com.kiki.kikistore.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 21:44:19
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

