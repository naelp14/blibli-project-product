package com.product.product;

public class Product {
    private String id;
    private String productName;
    private String idCategory;
    private int price;

    public Product(){

    }

    public Product(String id, String productName, String idCategory, int price) {
        this.id = id;
        this.productName = productName;
        this.idCategory = idCategory;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }
}
