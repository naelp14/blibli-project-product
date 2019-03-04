package com.product.product;

public class Product {
    private String id;
    private String productName;
    private String idCategory;
    private String desc;
    private int price;
    private int qty;

    public Product(String id, String productName, String idCategory, String desc, int price, int qty) {
        this.id = id;
        this.productName = productName;
        this.idCategory = idCategory;
        this.desc = desc;
        this.price = price;
        this.qty = qty;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
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
