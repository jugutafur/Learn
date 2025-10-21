package Collections;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class UsoLinkedList {

	public static void main(String[] args) {
		int posicion=1;
		String dia ="";
		System.out.println("Uso de linkedList");
		
		LinkedList<String> myListStringDiasSemana = new LinkedList<String>(); 

		myListStringDiasSemana.add("Lunes");
		myListStringDiasSemana.add("Martes");
		myListStringDiasSemana.add("Jueves");
		myListStringDiasSemana.add("Viernes");
		
		//Insertar en una posicion especifica		
		myListStringDiasSemana.add(2,"Miercoles");
		
		System.out.println("Cantidad de datos guardados =" +myListStringDiasSemana.size());
		
		Iterator<String> iteratorMyListStringDiasSemana = myListStringDiasSemana.iterator();
		while(iteratorMyListStringDiasSemana.hasNext()) {
			dia= iteratorMyListStringDiasSemana.next();
			System.out.println("Ver dia N° "+ posicion+ " = " +dia);
			posicion++;
		}
		
		//Ahora SE DEBE TENER EN CUENTA QUE LISKENDLIST TIENE SU PROPIO INTERADOR
		//Esto se debe a que como esta lista debe ser ordenada se debe usar ListIterator
		
		//ListIterator tiene mucho mas metodos que iterator
		//la Interfaz ListIterator hereda de la interfaz iterator
		
		ListIterator<String> ListiteratorMyListStringDiasSemana = myListStringDiasSemana.listIterator();
		
		ListiteratorMyListStringDiasSemana.next(); //moverse hacia adelante
		ListiteratorMyListStringDiasSemana.add("Domingo"); //agregar despues de moverse En este caso no la agrega al final
		ListiteratorMyListStringDiasSemana.hasNext();
		ListiteratorMyListStringDiasSemana.hasPrevious(); //devuelve un boolean si hay mas elementos previos
		ListiteratorMyListStringDiasSemana.previous(); //devuelve el elemento previo
		ListiteratorMyListStringDiasSemana.remove(); // Elimina el elemento actual
		
	}

}
