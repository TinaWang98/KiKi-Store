package com.kiki.kikistore.order.dao;

import com.kiki.kikistore.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 21:44:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
