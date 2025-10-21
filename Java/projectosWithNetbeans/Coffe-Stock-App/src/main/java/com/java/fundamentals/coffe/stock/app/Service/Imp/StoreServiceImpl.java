package com.java.fundamentals.coffe.stock.app.Service.Imp;

import com.java.fundamentals.coffe.stock.app.Entity.Product;
import com.java.fundamentals.coffe.stock.app.Entity.Store;
import com.java.fundamentals.coffe.stock.app.Exeptiones.StoreNotFoundException;
import com.java.fundamentals.coffe.stock.app.Respository.StoreRepositoryI;
import com.java.fundamentals.coffe.stock.app.Service.StoreServiceI;

public class StoreServiceImpl implements StoreServiceI{
    
    private StoreRepositoryI storeRepositoryI;

    //INJECTION DEPEDENCIES en este caso esta misma el constructor de esta clase 
    //se encarga de resolver la injeccion cada vez que sea instanciada esta clase 
    //pide en el constructor que se le pase una Interfaz
    public StoreServiceImpl(StoreRepositoryI storeRepositoryI) {
        this.storeRepositoryI = storeRepositoryI;
    }
    
    @Override
    public Store createStore(Store store) {
        return this.storeRepositoryI.createStore(store);
    } 

    @Override
    public Store[] findAllStore() {
        //INJECTION DEPEDENCIES POR CONSTRUCTOR en este caso esta misma clase se encarga de resolver la injeccion 
        //storeRepositoryI = new StoreRepositoryImpl();
        Store[] stores = storeRepositoryI.findAllStore();
        for(Store store: stores){
            System.out.println(store);
        }
        return stores;
    }   
    
    @Override
    public Store findByIdStore(byte id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //para probar los metodos desde aca
    /*
    public static void main(String[] args) {
        new StoreServiceImpl().finAllStore().toString();
    }
    */

    //Este metodo RELANZA LA EXCEPTION PARA QUE EL REPOSITORIO SEA QUIEN LA GESTIONE 
    //TAMBIEN SE DEBE AGREGAR A LA INTERFAZ PARA QUE LAS FIRMAS DE METODOS QUEDEN IGUALES
    
    @Override
    public void addProductToStore(byte idStore, Product product) throws StoreNotFoundException{
        storeRepositoryI.addProductToStore(idStore, product);
    }    
}
