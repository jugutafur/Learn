package Web.Entity.General;

import java.util.List;
import java.util.stream.Collectors;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Web.Entity.Pojo.aulaMatriz.coffeStock.Producto;
import Web.Entity.Pojo.aulaMatriz.coffeStock.Tienda;
import Web.Exeptiones.aulaMatriz.coffeStock.StoreNotFoundException;
import aulaMatriz.coffeStock.RepositoryI.RepositoryI;
import aulaMatriz.coffeStock.RepositoryImpl.RepositoryImpl;
import aulaMatriz.coffeStock.ServiceI.ServiceI;
import aulaMatriz.coffeStock.ServiceImpl.ServiceImpl;

@ManagedBean
@RequestScoped
public class GestorDeInventarioTres {

	private String test = "brasil";
	
    public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	private ServiceI serviceI;
    
    public GestorDeInventarioTres(ServiceI serviceI){
        this.serviceI = serviceI;
    }
    
	public static void main(String[] args) {
        System.out.println("App de Store Tres");
        
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
        
        GestorDeInventarioTres gestorDeInventarioDos = new GestorDeInventarioTres(serviceI);
        
        System.out.println("\n****************findAllStore****************");
        gestorDeInventarioDos.findAllStore();/*
        System.out.println("\n****************createStore*****************");
        gestorDeInventarioDos.createStore();
        System.out.println("\n****************findAllStore****************");
        gestorDeInventarioDos.findAllStore();
        System.out.println("\n****************putToProductIntoStore*******");
        gestorDeInventarioDos.putToProductIntoStore();*/
        /*
                
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
        }*/
    }
    
	public String prueba() {
		return "juan tafur nene";
	}
	
    public void createStore(){
        Tienda newStore = new Tienda();
        newStore.setNombre("Tienda 4 nueva");
        newStore.setDireccion("Calle 4 nueva");
        Tienda createStore = this.serviceI.createStore(newStore);
        System.out.println("La tienda creada es = "+ createStore);
    }

    public void findStoreById(byte idStore){
        
        List<Tienda> listStores = this.serviceI.findAllStore();
        
        List<Tienda> foundStores = listStores.stream().filter((store)->store.getId() == idStore).collect(Collectors.toList());
        
        //otra forma de ver lo mismo que el anterio
        foundStores.stream().forEach(System.out::println);
    }
    
    public void findAllStore(){

    List<Tienda> stores = this.serviceI.findAllStore();
        
        for (Tienda store : stores) {
            System.out.println("mi tienda = "+ store);
            
            if(store !=null && store.getProductos()!= null){
                for (Producto product : store.getProductos()) {
                    System.out.println("Producto encontrado: "+ product);
                }
            }
        }
    }
    
    public void putToProductIntoStore(){
        Producto product = new Producto();
        product.setId((short)1);
        product.setNombre("Cafe");
        product.setCantidad(3_500);
        
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
