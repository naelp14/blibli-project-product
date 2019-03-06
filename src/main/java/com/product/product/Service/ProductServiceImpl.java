package com.product.product.Service;

import com.product.product.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private ArrayList<Product> products = new ArrayList<Product>();

    @Override
    public Product create(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product findById(String id) {
        Product temp = new Product();
        for (int i=0;i<products.size();i++){
            if(products.get(i).getId().equals(id)){
                BeanUtils.copyProperties(products.get(i),temp);
                return temp;
            }
        }
        return null;
    }

    @Override
    public Product update(Product product) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId().compareTo(product.getId())==0){
                products.get(i).setProductName(product.getProductName());
                products.get(i).setPrice(product.getPrice());
                products.get(i).setIdCategory(product.getIdCategory());
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product delete(String id) {
        Product temp = new Product();
        for (int i=0;i<products.size();i++){
            if(products.get(i).getId().equals(id)){
                BeanUtils.copyProperties(products.get(i),temp);
                products.remove(i);
                return temp;
            }
        }
        return null;
    }
}
