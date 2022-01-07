package com.kiki.kikistore.coupon.dao;

import com.kiki.kikistore.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 11:43:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
