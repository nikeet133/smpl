package com.dlithe.ecommerce.repository;



import com.dlithe.ecommerce.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsDAO extends JpaRepository<Products,Integer> {

    @Query(value="select * from products where product_id =?1",nativeQuery = true)
    List<Products> findByProductId(int productId);

//    @Query(value = "SELECT * FROM main_product" , nativeQuery = true)
//    List<Products> mainProductList();

}
