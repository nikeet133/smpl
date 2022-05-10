package com.dlithe.ecommerce.repository;



import com.dlithe.ecommerce.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDAO extends JpaRepository<Products,Integer> {
}
