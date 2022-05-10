package com.dlithe.ecommerce.serviceImpl;


import com.dlithe.ecommerce.dto.BaseResponse;
import com.dlithe.ecommerce.dto.ProductDetails;
import com.dlithe.ecommerce.dto.ProductReview;
import com.dlithe.ecommerce.entity.Products;
import com.dlithe.ecommerce.repository.ProductsDAO;
import com.dlithe.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductsDAO productsDAO;


    @Override
    public ResponseEntity<BaseResponse> getProductDetails(int productId) throws IOException {

        Optional<Products> products=productsDAO.findById(productId);

        Products product=products.get();
        BaseResponse baseResponse = new BaseResponse();
        ProductDetails productDetails =new ProductDetails();
        productDetails.setName(product.getProductName());
        productDetails.setPrice(product.getPrice());
        productDetails.setDescription(product.getProductDescription());

        ProductReview productReview=new ProductReview();
        productReview.setReview("that is good quality and smoothness ");
        productReview.setName("nik");
        productReview.setRating("4.5");

        File file = new File("product-images/" + product.getImage());
        Resource fileSystemResource = new FileSystemResource(file);
        productDetails.setProductImage(fileSystemResource.getFile());
        productDetails.setProductReview(productReview);

        baseResponse.setMessage("Successfully added");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(productDetails);

        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK );
    }



//    public ProductDetails getProductDetails(int productId) throws IOException {
//
//        Optional<Products> products=productsDAO.findById(productId);
//        Products product=products.get();
//
//        ProductDetails productDetails =new ProductDetails();
//        productDetails.setName(product.getProductName());
//        productDetails.setPrice(product.getPrice());
//        productDetails.setDescription(product.getProductDescription());
//
//        ProductReview productReview=new ProductReview();
//        productReview.setReview("that is good quality and smoothness ");
//        productReview.setName("nik");
//        productReview.setRating("4.5");
//
//        File file = new File("product-images/" + product.getImage());
//        Resource fileSystemResource = new FileSystemResource(file);
//        productDetails.setProductImage(fileSystemResource.getFile());
//        productDetails.setProductReview(productReview);
//
//
//        return productDetails;
//    }
}
