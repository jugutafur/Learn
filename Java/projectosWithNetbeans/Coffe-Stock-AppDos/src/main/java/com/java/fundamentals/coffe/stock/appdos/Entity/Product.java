package com.java.fundamentals.coffe.stock.appdos.Entity;

public class Product {
    private short id;
    private String name;
    private float amount; // cantidad
    private Store store;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + 
                ", name=" + name + 
                ", amount=" + amount + 
                ", store=" + store + '}';
    } 
}
