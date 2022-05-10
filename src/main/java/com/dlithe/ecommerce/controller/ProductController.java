package com.dlithe.ecommerce.controller;

import com.dlithe.ecommerce.dto.ProductD;
import com.dlithe.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {

     @Autowired
    private ProductService productService;
//
//    @GetMapping("get-product-List/{productId}")
//    private ProductListRequest fetchTheProductList(@PathVariable int productId){
//
//        return productService.getProductList(productId);
//    }

    @GetMapping("get-product-details/{productId}")
    private ProductD fetchProductDetails(@PathVariable int productId){
        return productService.getProductDetails(productId);
    }





}
