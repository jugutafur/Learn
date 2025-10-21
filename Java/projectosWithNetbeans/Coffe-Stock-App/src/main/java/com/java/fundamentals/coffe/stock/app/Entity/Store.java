package com.java.fundamentals.coffe.stock.app.Entity;

public class Store {
    private byte id;
    private Product[] products;
    private String name;
    private String address;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Store{" + "id=" + id + 
                ", products=" + products + 
                ", name=" + name + 
                ", address=" + address + '}';
    }  
}