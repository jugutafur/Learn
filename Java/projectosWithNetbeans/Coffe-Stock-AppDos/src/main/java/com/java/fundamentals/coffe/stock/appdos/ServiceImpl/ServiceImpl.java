package com.java.fundamentals.coffe.stock.appdos.ServiceImpl;

import com.java.fundamentals.coffe.stock.appdos.Entity.Product;
import com.java.fundamentals.coffe.stock.appdos.Entity.Store;
import com.java.fundamentals.coffe.stock.appdos.Exeptiones.StoreNotFoundException;
import com.java.fundamentals.coffe.stock.appdos.RepositoryI.RepositoryI;
import com.java.fundamentals.coffe.stock.appdos.ServiceI.ServiceI;
import java.util.List;

public class ServiceImpl implements ServiceI{
    
    private RepositoryI repositoryI;
    
    //INJECTION DEPEDENCIES en este caso esta misma el constructor de esta clase 
    //se encarga de resolver la injeccion cada vez que sea instanciada esta clase 
    //pide en el constructor que se le pase una Interfaz
    public ServiceImpl(RepositoryI repositoryI){
        this.repositoryI = repositoryI;
    }

    @Override
    public Store createStore(Store store) {
        return this.repositoryI.createStore(store);
    }

    @Override
    public List<Store> findAllStore() {
        //INJECTION DEPEDENCIES POR CONSTRUCTOR en este caso esta misma clase se encarga de resolver la injeccion 
        //storeRepositoryI = new StoreRepositoryImpl();
        
        List<Store> stores = repositoryI.findAllStore();
        
        System.out.println("//Formato Imperativo");
        for (Store store : stores) {
            System.out.println(store);
        }
        
        System.out.println("//Formato Declarativo Java 8 Oracle");
        stores.stream().forEach(storess -> {System.out.println("Con Stream objeto stores = " + storess);});
        
        System.out.println("//Formato Declarativo Java 8 Oracle con Referncia de Metodos");
        stores.stream().forEach(System.out::println);
        
        System.out.println("//Fin ...");
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
    public void addProductToStore(byte idStore, Product product) throws StoreNotFoundException {
        repositoryI.addProductToStore(idStore, product);
    }
}
