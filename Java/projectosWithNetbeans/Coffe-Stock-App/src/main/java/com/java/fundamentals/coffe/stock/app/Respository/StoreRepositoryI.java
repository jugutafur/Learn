package com.java.fundamentals.coffe.stock.app.Respository;

import com.java.fundamentals.coffe.stock.app.Entity.Product;
import com.java.fundamentals.coffe.stock.app.Entity.Store;
import com.java.fundamentals.coffe.stock.app.Exeptiones.StoreNotFoundException;

public interface StoreRepositoryI {
    Store[] findAllStore();
    Store createStore(Store storeToCreate);
    void addProductToStore(byte idStore, Product product)throws StoreNotFoundException;
}
