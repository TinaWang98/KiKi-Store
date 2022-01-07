package com.kiki.kikistore.order.dao;

import com.kiki.kikistore.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 21:44:19
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
