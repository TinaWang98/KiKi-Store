package com.kiki.kikistore.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiki.common.utils.PageUtils;
import com.kiki.kikistore.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-03 11:51:40
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

