package com.product.product.Repository;

import com.product.product.Product;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,String> {
    List<Product> findAllById(String id);
    List<Product> findAllByProductName(String name);
}
