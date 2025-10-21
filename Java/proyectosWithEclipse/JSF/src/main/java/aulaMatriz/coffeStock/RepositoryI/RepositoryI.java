package aulaMatriz.coffeStock.RepositoryI;

import java.util.List;

import Web.Entity.Pojo.aulaMatriz.coffeStock.Producto;
import Web.Entity.Pojo.aulaMatriz.coffeStock.Tienda;
import Web.Exeptiones.aulaMatriz.coffeStock.StoreNotFoundException;

public interface RepositoryI {
	
	List<Tienda> findAllStore();
	Tienda createStore(Tienda storeToCreate);
	void addProductToStore(byte idStore, Producto product) throws StoreNotFoundException;

}
