package com.kiki.kikistore.order.dao;

import com.kiki.kikistore.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 21:44:20
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
