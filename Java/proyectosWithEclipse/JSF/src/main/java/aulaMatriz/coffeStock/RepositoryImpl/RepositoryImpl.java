package aulaMatriz.coffeStock.RepositoryImpl;

import java.util.List;

import Web.Entity.Pojo.aulaMatriz.coffeStock.Producto;
import Web.Entity.Pojo.aulaMatriz.coffeStock.Tienda;
import Web.Exeptiones.aulaMatriz.coffeStock.StoreNotFoundException;
import aulaMatriz.coffeStock.RepositoryI.RepositoryI;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class RepositoryImpl implements RepositoryI {

	private List<Tienda> storeList = new ArrayList<>();
	private List<Tienda> storeList2;

	public RepositoryImpl() {
		storeList2 = new ArrayList<>();

		Tienda storeUno = new Tienda();
		storeUno.setId((byte) 1);
		storeUno.setNombre("Store Uno");
		storeUno.setDireccion("Street 1");

		storeList2.add(storeUno);

		Tienda storeDos = new Tienda();
		storeDos.setId((byte) 2);
		storeDos.setNombre("Store Dos");
		storeDos.setDireccion("Street 2");

		storeList2.add(storeDos);

		Tienda storeTres = new Tienda();
		storeTres.setId((byte) 3);
		storeTres.setNombre("Store Tres");
		storeTres.setDireccion("Street 3");

		storeList2.add(storeTres);

		Tienda storeCuatro = new Tienda();
		storeCuatro.setId((byte) 4);
		storeCuatro.setNombre("Store Cuatro");
		storeCuatro.setDireccion("Street 4");

		storeList2.add(storeCuatro);

		Tienda storeCinco = new Tienda();
		storeCinco.setId((byte) 5);
		storeCinco.setNombre("Store Cinco");
		storeCinco.setDireccion("Street 5");

		storeList2.add(storeCinco);

		Tienda storeSeis = new Tienda();
		storeSeis.setId((byte) 6);
		storeSeis.setNombre("Store Seis");
		storeSeis.setDireccion("Street 6");

		storeList2.add(storeSeis);
	}

	@Override
	public List<Tienda> findAllStore() {
		return this.storeList2;
	}

	@Override
	public Tienda createStore(Tienda storeToCreate) {
		storeToCreate.setId((byte) 9);
		this.storeList2.add(storeToCreate);
		return storeToCreate;
	}

	// Este metodo POSIBLEMENTE PUEDE LLEGAR A LANZAR UNA EXCEPTION
	@Override
	public void addProductToStore(byte idStore, Producto products) throws StoreNotFoundException {

		var storeToSearch = new Tienda();
		var isStoreFound = false; // Esto es una bandera que determina si encontro o no una Store

		// Antes que valide que si hay match entre el idStore es decir antes que valide
		// si se encontro la
		// tienda para agregar producto SE DEBE PENSAR EN UNA EXCEPCION PENSADA PARA QUE
		// EL PROGRAMA SE
		// REVIENDE POR UNA CAUSA JUSTA Y EL HECHO QUE NO LE PASEN UN PRODUCTO PARA
		// AGREGAR

		// Para reventar el programa con una excepcion valida se realiza lo siguiente

		if (products == null) {
			throw new IllegalArgumentException(
					"Hay un problema con el paso del" + "argumento ya que esta llegando nulo ");
		}

		for (Tienda store : storeList2) {
			if (store != null) {
				if (store.getId() == idStore) {
					storeToSearch = store;
					isStoreFound = true; // Si no la encontro
					break;
				}
			}
		}

		if (!isStoreFound) {
			throw new StoreNotFoundException("La tienda no fue " 
					+ "encontrada. No se agrego ningun producto"); // Se lanza una exception																												n
		}
		
		Producto[] myproducts = new Producto[1];
		myproducts[0] = products;
		storeToSearch.setProductos(myproducts);

	}

}
