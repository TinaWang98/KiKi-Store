package com.kiki.kikistore.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kiki.kikistore.product.entity.BrandEntity;
import com.kiki.kikistore.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KikistoreProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

//       BrandEntity brandEntity = new BrandEntity();
//       brandEntity.setBrandId(1L);
//       brandEntity.setDescript("Apple");
//
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("save successfully.....");

//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        list.forEach((item)->{
            System.out.println(item);
        }
        );
    }

}
