package com.yang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yang.model.ProductInfo;
import com.yang.service.ProductInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yang
 * @Date: 2018\8\2 0002 16:33
 * @Description:
 */
@RestController
public class CityController {

    @Reference(version = "1.0.0")
    private ProductInfoService productInfoService;


    @RequestMapping("/getProductInfo")
    public String getProductInfo(){
        ProductInfo productInfo = productInfoService.findProductInfoByProductName("衡阳");
        return  productInfo.toString();
    }

}
