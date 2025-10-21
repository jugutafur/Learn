package com.java.fundamentals.coffe.stock.appdos.ServiceI;

import com.java.fundamentals.coffe.stock.appdos.Entity.Store;
import com.java.fundamentals.coffe.stock.appdos.Entity.Product;
import com.java.fundamentals.coffe.stock.appdos.Exeptiones.StoreNotFoundException;
import java.util.List;

public interface ServiceI {
    List<Store> findAllStore();
    Store createStore(Store store);
    Store findByIdStore(byte id);
    void addProductToStore(byte idStore, Product product) throws StoreNotFoundException;
}