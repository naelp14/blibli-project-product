package com.product.product.Service;

import com.product.product.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product findById(String id);
    Product update(Product product);
    List<Product> findAll();
    Product delete(String id);
}
