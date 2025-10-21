package Collections;

import java.util.Set;
import java.util.HashSet;

public class Libreria {
	public static void main(String [] args) {
		System.out.println("This a Librery");
		
		Libro libroUno = new Libro("Hary Potter", "Paulo Cohelo", 26);
		Libro libroDos = new Libro("Hary Potter", "Paulo Cohelo", 28);
		
		Set<Libro> myListLibro = new HashSet<Libro>();
		
		myListLibro.add(libroUno);
		myListLibro.add(libroDos);
		
		for(Libro LibroX: myListLibro) {
			System.out.println("This is my libro ="+ LibroX.hashCode());
		}
		
		
		if(libroUno.equals(libroDos)) {
			System.out.println("Son los mismos libros");
		}else {
			System.out.println("Son diferentes");
		}
	}
}
