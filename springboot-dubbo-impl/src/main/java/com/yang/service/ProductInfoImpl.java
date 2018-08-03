package com.yang.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.yang.model.ProductInfo;

/**
 * @Auther: yang
 * @Date: 2018\8\2 0002 17:07
 * @Description:
 */
@Service(version = "1.0.0")
public class ProductInfoImpl  implements  ProductInfoService{

    @Override
    public ProductInfo findProductInfoByProductName(String productName) {
        return new ProductInfo("哇哈哈哈","非常好吃的无敌娃哈哈");
    }
}
