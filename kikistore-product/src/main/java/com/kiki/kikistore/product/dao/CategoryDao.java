package com.kiki.kikistore.product.dao;

import com.kiki.kikistore.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kiki
 * @email wtina8998@gmail.com
 * @date 2022-01-02 20:01:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
