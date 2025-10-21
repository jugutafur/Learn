package aulaMatriz.coffeStock.ServiceImpl;

import aulaMatriz.coffeStock.RepositoryI.RepositoryI;

import java.util.List;

import Web.Entity.Pojo.aulaMatriz.coffeStock.Producto;
import Web.Entity.Pojo.aulaMatriz.coffeStock.Tienda;
import Web.Exeptiones.aulaMatriz.coffeStock.StoreNotFoundException;
import aulaMatriz.coffeStock.ServiceI.ServiceI;

public class ServiceImpl implements ServiceI {
    
    private RepositoryI repositoryI;
    
    //INJECTION DEPEDENCIES en este caso el constructor de esta clase 
    //se encarga de resolver la injeccion cada vez que sea instanciada esta clase 
    //pide en el constructor que se le pase una Interfaz
    public ServiceImpl(RepositoryI repositoryI){
        this.repositoryI = repositoryI;
    }

    @Override
    public Tienda createStore(Tienda store) {
        return this.repositoryI.createStore(store);
    }

    @Override
    public List<Tienda> findAllStore() {
        //INJECTION DEPEDENCIES POR CONSTRUCTOR en este caso esta misma clase se encarga de resolver la injeccion 
        //storeRepositoryI = new StoreRepositoryImpl();
        
        List<Tienda> stores = repositoryI.findAllStore();
        
        System.out.println("//Formato Imperativo");
        for (Tienda store : stores) {
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
    public Tienda findByIdStore(byte id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Este metodo RELANZA LA EXCEPTION PARA QUE EL REPOSITORIO SEA QUIEN LA GESTIONE 
    //TAMBIEN SE DEBE AGREGAR A LA INTERFAZ PARA QUE LAS FIRMAS DE METODOS QUEDEN IGUALES
    @Override
    public void addProductToStore(byte idStore, Producto product) throws StoreNotFoundException {
        repositoryI.addProductToStore(idStore, product);
    }
    
    //para probar los metodos desde aca
    /*
    public static void main(String[] args) {
        new StoreServiceImpl().finAllStore().toString();
    }
    */
}
