package com.product.product.Controller;

import com.product.product.Product;
import com.product.product.Service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;


@RestController
public class ProductController {

    private ProductServiceImpl productService;
    public ProductController(ProductServiceImpl productService){
        this.productService = productService;
    }

    @RequestMapping(
            value="/products",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )

    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @RequestMapping(
            value = "/products",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public List<Product> findAll(){
        return productService.findAll();
    }

    @RequestMapping(
            value = "/products/{idProduct}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public Product findById(@PathVariable("idProduct")String id){
        return productService.findById(id);
    }

    @RequestMapping(
            value = "/products/delete/{idProduct}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Product delete(@PathVariable("idProduct") String idProduct){
        return productService.delete(idProduct);
    }

    @RequestMapping(
            value = "/products/update/{idProduct}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }
}
