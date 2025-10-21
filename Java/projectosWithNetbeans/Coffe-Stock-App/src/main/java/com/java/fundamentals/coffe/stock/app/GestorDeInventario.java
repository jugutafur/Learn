package com.java.fundamentals.coffe.stock.app;

import com.java.fundamentals.coffe.stock.app.Entity.Product;
import com.java.fundamentals.coffe.stock.app.Entity.Store;
import com.java.fundamentals.coffe.stock.app.Exeptiones.StoreNotFoundException;
import com.java.fundamentals.coffe.stock.app.Respository.Imp.StoreRepositoryImpl;
import com.java.fundamentals.coffe.stock.app.Respository.StoreRepositoryI;
import com.java.fundamentals.coffe.stock.app.Service.Imp.StoreServiceImpl;
import com.java.fundamentals.coffe.stock.app.Service.StoreServiceI;

public class GestorDeInventario {
    
    private StoreServiceI storeServiceI;

    public GestorDeInventario(StoreServiceI storeServiceI) {
        this.storeServiceI = storeServiceI;
    }
        
    public static void main(String[] args) {
        
        System.out.println("App de Store");

        //En estas lineas de codigo se esta instanciando una objeto que pertenece al tipo 
        //StoreRepositoryImpl que tiene una referencia a StoreRepositoryImpl este objeto o 
        //variable de referencia puede pasar como parametro cuando se espera a la interfaz
        // ya que son compatibles ya que la clase implementa la intefaz
        
        //StoreRepositoryImpl storeRepositoryImpl = new StoreRepositoryImpl();
        
        //Se puede pasar como argumento la instancia de la clase y no da error y todo funciona bien
        //PEROOOOO como se debe programar orientado hacia interfaces
        StoreRepositoryI storeRepositoryI = new StoreRepositoryImpl();
        StoreServiceI storeServiceI = new StoreServiceImpl(storeRepositoryI);
        
        //Estas lineas que estan comentadas es la forma larga en la cual se puede hacer lo 
        //SIGUIENTE
        
        //StoreServiceI storeServiceI = new StoreServiceImpl(new StoreRepositoryImpl());
        
        //La anterior linea es la forma corta de hacer lo mismo  
        
        GestorDeInventario gestorDeInventario = new GestorDeInventario(storeServiceI);
        System.out.println("\n*/*/*/*/*/*/*/*/*findAllStore*/*/*/*/*/*/*/*/*");
        gestorDeInventario.findAllStore();
        System.out.println("\n*/*/*/*/*/*/*/*/*createStore*/*/*/*/*/*/*/*/*");
        gestorDeInventario.createStore();
        System.out.println("\n*/*/*/*/*/*/*/*/*findAllStore*/*/*/*/*/*/*/*/*");
        gestorDeInventario.findAllStore();
        System.out.println("\n*/*/*/*/*/*/*/*/*putToProductIntoStore*/*/*/*/*/*/*/*/*");
        gestorDeInventario.putToProductIntoStore();
    }
    
    public void createStore(){
        Store newStore = new Store();
        newStore.setName("Tienda 4 nueva");
        newStore.setAddress("Calle 4 nueva");
        Store createStore = this.storeServiceI.createStore(newStore);
        System.out.println("La tienda creada es = "+ createStore);
    }
    
    public void findAllStore(){
    Store[] stores = this.storeServiceI.findAllStore();
        
        for (Store store : stores) {
            System.out.println("mi tienda = "+ store);
            
            if(store !=null && store.getProducts()!= null){
                for (Product product : store.getProducts()) {
                    System.out.println("Producto encontrado: "+ product);
                }
            }
        }
    }
    
    public void putToProductIntoStore(){
        Product product = new Product();
        product.setId((short)1);
        product.setName("Cafe");
        product.setAmount(3_500);
        
        //PARA ATRAPAR UNA EXCEPTION StoreNotFoundException
        //Con esto catch una exception 
        try {
            this.storeServiceI.addProductToStore((byte)20, product);
            System.out.println("El producto se ha agregado a la tienda");
        } catch (StoreNotFoundException storeNotFoundException) {
            System.out.println(storeNotFoundException.getMessage());
        }        
        findAllStore();
    }
}
