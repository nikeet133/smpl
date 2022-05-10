package com.dlithe.ecommerce.serviceImpl;


import com.dlithe.ecommerce.dto.ProductD;
import com.dlithe.ecommerce.dto.ProductReview;
import com.dlithe.ecommerce.entity.Products;
import com.dlithe.ecommerce.repository.ProductsDAO;
import com.dlithe.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductsDAO productsDAO;


    @Override
    public ProductD getProductDetails(int productId) {

        Optional<Products> products=productsDAO.findById(productId);
        Products product=products.get();

        ProductD productD=new ProductD();
        productD.setName(product.getProductName());
        productD.setPrice(product.getPrice());
        productD.setDescription(product.getProductDescription());

        ProductReview productReview=new ProductReview();
        productReview.setReview("that is good quality and smoothness ");
        productReview.setName("nik");
        productReview.setRating("4.5");

        productD.setProductReview(productReview);


        return productD;
    }
}
