package Cien_ejercicios;

import java.util.List;
import java.util.ArrayList;

public class TrabajoList {
	public static void main(String args[]) {
		System.out.println("Trabajo con List");
		
		int count=0;
		List<String> lista_nombre = new ArrayList<>();
		
		//Definiccion de un Array List
		ArrayList list = new ArrayList(9);
		
		list.add("James");
		list.add(5); //De esta manera no es permitido pero aun asi funciona
		list.add(new Integer(8)); //Esto es lo que hace internamente el codigo con la anterior linea
								  //POr medio de la clase emvolvente Wrapper
		list.add(true);
		
		System.out.println("ArrayList");
		System.out.println(list);
		
		//agregar items a la lista
		lista_nombre.add("Manuel");
		lista_nombre.add("carlos");
		lista_nombre.add("maria");
		lista_nombre.add("sonia");
		lista_nombre.add("rocio");
		
		
		for(String e:lista_nombre) {
			count++;
			System.out.println("nombre "+ count + " es = " + e);
		}
		//CONOCER el tamaño de la lista
		System.out.println("El tama;o de la lista = "+lista_nombre.size());
		
		//OBTENER una posicion especifica RECUERDE QUE SE DEBE TENER EN CUENTA EL 0!!
		System.out.println("la posicion 2 tiene un nombre = "+lista_nombre.get(2));
		
		//ELIMINAR una posicion especifica RECUERDE QUE SE DEBE TENER EN CUENTA EL 0!!
		lista_nombre.remove(2);
		
		count=0;
		for(String e:lista_nombre) {
			count++;
			System.out.println("nombre "+ count + " es = " + e);
		}
		//CONOCER el tamaño de la lista
		System.out.println("El tama;o de la lista = "+lista_nombre.size());
		System.out.println("la posicion 2 tiene un nombre = "+lista_nombre.get(2));
		
		//Si contiene un valor
		
		List<String> paises = new ArrayList<>();
		
		paises.add("Colombia");
		paises.add("peru");
		paises.add("panama");
		paises.add("brazil");
		paises.add("venezuela");
		
		System.out.println("contine es peru = "+paises.contains("peru"));
		
		Humano personaUno = new Humano("Juan", "bogota", 33);
		Humano personaDos = new Humano("Carlos", "Tolima", 34);
		
		List<Humano> lista_persona = new ArrayList<>();
		
		lista_persona.add(personaUno);
		lista_persona.add(personaUno);
		
	}
}


class Humano{
	private String nombre;
	private String ciudad;
	private int edad;
	
	public Humano() {}

	public Humano(String nombre, String ciudad, int edad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}

