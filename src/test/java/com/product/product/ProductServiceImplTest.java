package com.product.product;

import com.product.product.Service.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductServiceImplTest {
    private ProductServiceImpl products;

    @Before
    public void setUp() throws Exception {
        products = new ProductServiceImpl();
    }

    @Test
    public void testCreate(){
        Product product = new Product("123","asdf","contoh",200);
        products.create(product);

        Assert.assertTrue("Total harus ada 1", products.findAll().size()==1);

        Product temp = products.findById("123");
        Assert.assertTrue("Product harus ada", product.getId().equals(temp.getId()));
    }

    @Test
    public void testFindId(){

        Product product = products.findById("kosong");
        Assert.assertTrue("Product harus null", product == null);

        products.create(new Product("234","ababab","cth",500));
        Assert.assertTrue("ID harus ketemu", products.findById("234").getProductName().equals("ababab"));
    }

    @Test
    public void testFindAll(){
        products.create(new Product("234","ababab","ctg",500));
        Product product = new Product("123","asdf","ctg",200);
        products.create(product);

        Assert.assertTrue("Size harus 2", products.findAll().size()==2);
    }

    @Test
    public void testUpdate(){
        products.create(new Product("234","ababab","ctg",500));
        products.update(new Product("234","hahaahh","hai",800));

        Assert.assertTrue("Nama harus terupdate", products.findById("234").getProductName().compareTo("hahaahh")==0);

        Product product = products.update(new Product("534","ababab","ctg",500));

        Assert.assertTrue(product==null);
    }

    @Test
    public void testDelete(){
        Product product = products.delete("534");

        Assert.assertTrue(product==null);

        products.create(new Product("234","ababab","ctg",500));
        products.create(new Product("534","hahaahh","hai",800));

        Assert.assertTrue("Size harus 2", products.findAll().size()==2);

        products.delete("234");
        Assert.assertTrue("Harus di delete", products.findById("234")==null);

        products.delete("534");
        Assert.assertTrue("Size harus 0", products.findAll().size()==0);
    }
}
