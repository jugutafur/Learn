package com.java.fundamentals.coffe.stock.appdos.RepositoryI;

import com.java.fundamentals.coffe.stock.appdos.Entity.Product;
import com.java.fundamentals.coffe.stock.appdos.Entity.Store;
import com.java.fundamentals.coffe.stock.appdos.Exeptiones.StoreNotFoundException;
import java.util.List;

public interface RepositoryI {
    List<Store> findAllStore();
    Store createStore(Store storeToCreate);
    void addProductToStore(byte idStore, Product products)throws StoreNotFoundException;
}
