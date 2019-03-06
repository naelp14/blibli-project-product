package com.product.product;

import com.product.product.Repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testRepository() {
        Product product = new Product();
        product.setId("1");
        product.setProductName("Hahah");
        product.setPrice(1000);
        product.setIdCategory("3");

        //Save or Update
        productRepository.save(product);

        //Select All
        Page<Product> list = productRepository.findAll(PageRequest.of(0, 10));
        List<Product> page = list.getContent();
        list.getTotalElements();
        list.getTotalPages();

        Optional<Product> optional = productRepository.findById("1");
        if (optional.isPresent()) {
            Product temp = optional.get();
        } else {
            //gak ada
        }

    }
}
