package com.java.fundamentals.coffe.stock.appdos.RepositoryImpl;

import com.java.fundamentals.coffe.stock.appdos.Entity.Product;
import com.java.fundamentals.coffe.stock.appdos.Entity.Store;
import com.java.fundamentals.coffe.stock.appdos.Exeptiones.StoreNotFoundException;
import com.java.fundamentals.coffe.stock.appdos.RepositoryI.RepositoryI;
import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements RepositoryI{
    
    //private Store[] stores;  //Arreglo primitivo
    
    //Desde java 7 ya no es necesario declarar en el constructor que tipo de dato va a tener 
    //la lista y esto se debe a LA INFERENCIA DE TIPOS
    private List<Store> storeList = new ArrayList<>();
    //O SE PUEDE HACER EN DOS PARTES DONDE ACA FUERA HAGO LA DECLARACION Y DENTRO DEL CONSTRUCTOR HAGO 
    //LA INSTANCIACION DE LA LISTA
    
    private List<Store> storeList2;
    
    public RepositoryImpl(){
        
        storeList2 = new ArrayList<>();
        
        Store storeUno = new Store();
        storeUno.setId((byte)1);
        storeUno.setName("Store Uno");
        storeUno.setAddress("Street 1");

        storeList2.add(storeUno);
        
        Store storeDos = new Store();
        storeDos.setId((byte)1);
        storeDos.setName("Store Dos");
        storeDos.setAddress("Street 2");
        
        storeList2.add(storeDos);
        
        Store storeTres = new Store();
        storeTres.setId((byte)1);
        storeTres.setName("Store Tres");
        storeTres.setAddress("Street 3");
        
        storeList2.add(storeTres);
    }

    @Override
    public List<Store> findAllStore() {
        return this.storeList2;
    }

    @Override
    public Store createStore(Store storeToCreate) {
        storeToCreate.setId((byte)4);
        this.storeList2.add(storeToCreate);
        return storeToCreate;
    }

    //Este metodo POSIBLEMENTE PUEDE LLEGAR A LANZAR UNA EXCEPTION 
    @Override
    public void addProductToStore(byte idStore, Product products) throws StoreNotFoundException {
        var storeToSearch = new Store();
        var isStoreFound = false; //Esto es una bandera que determina si encontro o no una Store
        
        //Antes que valide que si hay match entre el idStore es decir antes que valide si se encontro la 
        //tienda para agregar producto SE DEBE PENSAR EN UNA EXCEPCION PENSADA PARA QUE EL PROGRAMA SE 
        //REVIENDE POR UNA CAUSA JUSTA Y EL HECHO QUE NO LE PASEN UN PRODUCTO PARA AGREGAR
        
        //Para reventar el programa con una excepcion valida se realiza lo siguiente 
        
        if(products == null){
            throw new IllegalArgumentException("Hay un problema con el paso del "
                    + "argumento ya que esta llegando nulo");
        }
        
        for (Store store : storeList2) {
            if(store != null){
                if(store.getId() == idStore){
                storeToSearch = store;
                isStoreFound = true; // Si no la encontro 
                break;
                }
            }
        }   
        if(!isStoreFound){
            throw new StoreNotFoundException("La tienda no fue "
                    + "encontrada. No se agrego ningun producto"); //Se lanza una exception 
        }
        Product[] myproducts = new Product[1];
        myproducts[0] = products;
        storeToSearch.setProducts(myproducts);   
    }
}
