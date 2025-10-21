package Web.Exeptiones.aulaMatriz.coffeStock;


//Al exrender de la clase Exception ya esta clase se vuelve una exception gestionada
//Esta podra ser lanzada por cualquier clase que la extienda al no encontrar una tienda
public class StoreNotFoundException extends Exception {
	
	//se puede llamar a mas constructores que vienen en la super clase
	public StoreNotFoundException(String message) {
		super(message);
	}

	public StoreNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
