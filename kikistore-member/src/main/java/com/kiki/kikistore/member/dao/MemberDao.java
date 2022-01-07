package com.kiki.kikistore.member.dao;

import com.kiki.kikistore.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 11:51:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
