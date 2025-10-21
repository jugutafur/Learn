package ListaWithNodo;

public class ImplementacionLista {
	
	public static void main(String [] args) {
		System.out.println("nodos anidados");
		
		int b=5, c=10, d=15, e=20, f=25;
		
		MetodosLista mt = new MetodosLista();
		
		mt.addNodoAlFinal(b);
		mt.addNodoAlFinal(c);
		mt.addNodoAlFinal(d);
		mt.addNodoAlFinal(e);
		mt.addNodoAlFinal(f);
		
		mt.tamanio();
		mt.imprimir();
		mt.deleteLast(); //borra 25
		mt.tamanio();
		mt.imprimir();
		mt.deleteLast(); //borra 20
		mt.tamanio();
		mt.imprimir();
		mt.deleteLast(); //borra 15
		mt.tamanio();
		mt.imprimir();
		//mt.deleteLast(); //borra 10
		//mt.tamanio();
		//mt.imprimir();
		//mt.deleteLast(); //borra 5
		//mt.tamanio();
		//mt.imprimir();
		//mt.deleteLast(); //la lista esta vacia
		//mt.tamanio();
		//mt.imprimir();
		
		//mt.addNodoAlFinal(8);
		//mt.tamanio();
		//mt.imprimir();
		//mt.addNodoAlIncio(66);
		//mt.tamanio();
		//mt.imprimir();
		mt.deleteFirst();
		mt.tamanio();
		mt.imprimir();
		
		
	}

}
