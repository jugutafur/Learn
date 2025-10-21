import com.java.fundamentals.coffe.stock.appdos.Entity.Product;
import com.java.fundamentals.coffe.stock.appdos.Entity.Store;
import com.java.fundamentals.coffe.stock.appdos.Exeptiones.StoreNotFoundException;
import com.java.fundamentals.coffe.stock.appdos.RepositoryI.RepositoryI;
import com.java.fundamentals.coffe.stock.appdos.RepositoryImpl.RepositoryImpl;
import com.java.fundamentals.coffe.stock.appdos.ServiceI.ServiceI;
import com.java.fundamentals.coffe.stock.appdos.ServiceImpl.ServiceImpl;
import java.util.List;
import java.util.stream.Collectors;

public class GestorDeInventarioDos {

    private ServiceI serviceI;
    
    public GestorDeInventarioDos(ServiceI serviceI){
        this.serviceI = serviceI;
    }
    
    public static void main(String[] args) {
        System.out.println("App de Store Dos");
        
        //En estas lineas de codigo se esta instanciando una objeto que pertenece al tipo 
        //StoreRepositoryImpl que tiene una referencia a StoreRepositoryImpl este objeto o 
        //variable de referencia puede pasar como parametro cuando se espera a la interfaz
        // ya que son compatibles ya que la clase implementa la intefaz
        
        //StoreRepositoryImpl storeRepositoryImpl = new StoreRepositoryImpl();
        
        //Se puede pasar como argumento la instancia de la clase y no da error y todo funciona bien
        //PEROOOOO como se debe programar orientado hacia interfaces
        RepositoryI repositoryI = new RepositoryImpl();
        ServiceI serviceI = new ServiceImpl(repositoryI);
        
        //Estas lineas que estan comentadas es la forma larga en la cual se puede hacer lo 
        //SIGUIENTE
        
        //StoreServiceI storeServiceI = new StoreServiceImpl(new StoreRepositoryImpl());
        
        //La anterior linea es la forma corta de hacer lo mismo  
        
        GestorDeInventarioDos gestorDeInventarioDos = new GestorDeInventarioDos(serviceI);
        /*
        System.out.println("\n****************findAllStore****************");
        gestorDeInventarioDos.findAllStore();
        System.out.println("\n****************createStore*****************");
        gestorDeInventarioDos.createStore();
        System.out.println("\n****************findAllStore****************");
        gestorDeInventarioDos.findAllStore();
        System.out.println("\n****************putToProductIntoStore*******");
        gestorDeInventarioDos.putToProductIntoStore();
        */
                
        switch(args[0]){
            case "findAllStore":
                gestorDeInventarioDos.findAllStore();
                break;
            case "findStoreById":
                gestorDeInventarioDos.findStoreById(Byte.valueOf(args[1]));
                break;
            case "createStore":
                gestorDeInventarioDos.createStore();
                break;
            case "putToProductIntoStore":
                gestorDeInventarioDos.putToProductIntoStore();
                break;
            default:
                System.out.println("No entro a ninguna opcion");
                break;
        }
    }
    
    public void createStore(){
        Store newStore = new Store();
        newStore.setName("Tienda 4 nueva");
        newStore.setAddress("Calle 4 nueva");
        Store createStore = this.serviceI.createStore(newStore);
        System.out.println("La tienda creada es = "+ createStore);
    }

    public void findStoreById(byte idStore){
        
        List<Store> listStores = this.serviceI.findAllStore();
        
        List<Store> foundStores = listStores.stream().filter((store)->store.getId() == idStore).collect(Collectors.toList());
        
        //otra forma de ver lo mismo que el anterio
        foundStores.stream().forEach(System.out::println);
    }
    
    public void findAllStore(){
    List<Store> stores = this.serviceI.findAllStore();
        
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
            this.serviceI.addProductToStore((byte)20, product);
            System.out.println("El producto se ha agregado a la tienda");
        } catch (StoreNotFoundException storeNotFoundException) {
            System.out.println(storeNotFoundException.getMessage());
        }        
        findAllStore();
    }
}
