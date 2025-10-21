package aulaMatriz.coffeStock.ServiceI;

import java.util.List;

import Web.Entity.Pojo.aulaMatriz.coffeStock.Producto;
import Web.Entity.Pojo.aulaMatriz.coffeStock.Tienda;
import Web.Exeptiones.aulaMatriz.coffeStock.StoreNotFoundException;

public interface ServiceI {
    List<Tienda> findAllStore();
    Tienda createStore(Tienda store);
    Tienda findByIdStore(byte id);
    void addProductToStore(byte idStore, Producto product) throws StoreNotFoundException;
}