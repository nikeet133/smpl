package com.dlithe.ecommerce.service;

import com.dlithe.ecommerce.dto.ProductD;
import org.springframework.stereotype.Component;

@Component
public interface ProductService {

ProductD getProductDetails(int productId);



}
