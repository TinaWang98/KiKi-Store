package com.kiki.kikistore.product.dao;

import com.kiki.kikistore.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-02 20:01:19
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
