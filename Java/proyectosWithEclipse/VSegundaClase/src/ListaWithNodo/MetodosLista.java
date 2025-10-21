package ListaWithNodo;

public class MetodosLista {
	
	private Nodo primero;
	private Nodo ultimo;
	private int tamanio;
	
	//Constructor
	public MetodosLista() {
		this.primero = null;
		this.ultimo = null;
		this.tamanio = 0 ;	
	}
	
	//Metodo para comprobar si la lista esta vacia
	public boolean siVacio() {
		return (this.primero == null);
	}
	
	//Metodo para agregar al final de la lista
	public MetodosLista addNodoAlFinal(int dato) {
		//Preguntar primero si la lista esta vacia
		if(siVacio()) {
			//Creamos un nodo y como la lista esta vacia este sera el primero y el ultumo
			Nodo nuevo = new Nodo(dato);
			primero = nuevo;
			ultimo = nuevo;
			nuevo.nodeDer = null;
		}else {
			Nodo nuevo = new Nodo(dato);
			nuevo.nodeDer = null;
			ultimo.nodeDer = nuevo;
			ultimo = nuevo;
		}
		this.tamanio++;
		return this;
	}
	
	//Metodo para agregar al incio de la lista
	public MetodosLista addNodoAlIncio(int dato) {
		Nodo nuevo = new Nodo(dato);
		if(siVacio()) {
			primero = nuevo;
			ultimo = nuevo;
			nuevo.nodeDer = null;
		}else {
			nuevo.nodeDer = primero;
		}
		this.tamanio++;
		return this;
	}
	
	//Metod para eliminar al primero de la lista
	public Nodo deleteFirst() {
		Nodo Eliminar = null;
		//Si la lista esta vacia
		if(siVacio()) {
			System.out.println("la lista esta vacia");
		}
		
		//En el caso de que solo hay un nodo
		if(primero == ultimo) {
			primero = null;
			ultimo = null;
		}else { // En el caso de que hayan mas nodos en la lista
			Nodo actual = primero;
			Eliminar = actual;
		}
		this.tamanio--;
		return Eliminar;
	}
	
	//Eliminar el Nodo que apunte al null que resulta siendo el ultimo 
	public Nodo deleteLast() {
		Nodo eliminar = null;
		
		//Si la lista esta vacia
		if(siVacio()) {
			System.out.println("La lista esta vacia");
		}
		
		//En el caso que solo haya un nodo 
		if(primero == ultimo) {
			primero = null;
			ultimo = null;
		}else {  //En el caso que hayan mas Nodo, debemos recorrer todos
			//El primero lo copiamos en otro variable para trabajarlo
			Nodo actual = primero ;
			
			while(actual.nodeDer != ultimo) {
				//ahora lo vamos rodando en los demas nodos hasta encontrar el nodo que apunta al ultimo
				actual = actual.nodeDer;
			}
			
			eliminar = actual.nodeDer;
			actual.nodeDer = null;
			ultimo = actual;
		}
		//restamos 1 ya que eliminamos el ultimo nodo
		this.tamanio--;
		return eliminar;
	}
	
	//Conocer el tamanio de la lista
	public void tamanio() {
		System.out.println("El tamanio de la lista es = "+this.tamanio);
	}
	
	//Ver la lista
	public void imprimir() {
		if(tamanio != 0 ) {
			Nodo temporal = primero;
			String str = "";
			
			for(int i = 0; i<this.tamanio; i++) {
				str = str + temporal.dato + "\n";
				temporal = temporal.nodeDer;
			}
			System.out.println(str);
		}
	}
}












