package com.kiki.kikistore.order.dao;

import com.kiki.kikistore.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 21:44:20
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
