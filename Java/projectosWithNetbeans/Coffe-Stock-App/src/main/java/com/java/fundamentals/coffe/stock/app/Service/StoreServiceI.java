package com.java.fundamentals.coffe.stock.app.Service;

import com.java.fundamentals.coffe.stock.app.Entity.Product;
import com.java.fundamentals.coffe.stock.app.Entity.Store;
import com.java.fundamentals.coffe.stock.app.Exeptiones.StoreNotFoundException;

public interface StoreServiceI {
    Store createStore(Store store);
    Store[] findAllStore();
    Store findByIdStore(byte id);
    void addProductToStore(byte idStore, Product product) throws StoreNotFoundException;
}
