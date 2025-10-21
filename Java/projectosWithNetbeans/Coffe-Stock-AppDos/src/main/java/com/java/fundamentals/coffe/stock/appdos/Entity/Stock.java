package com.java.fundamentals.coffe.stock.appdos.Entity;

public class Stock {
    private short id;
    private Product[] products;
    private Store store;

    public Stock(short id, Product[] products, Store store) {
        this.id = id;
        this.products = products;
        this.store = store;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
