package com.java.fundamentals.coffe.stock.app.Entity;

public class Stock {
    private short id;
    private Product[] product;
    private Store store;

    public Stock(short id, Product[] product, Store store) {
        this.id = id;
        this.product = product;
        this.store = store;
    }
    
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
