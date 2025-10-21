package UseJaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


//Esta clase representa el elemento raiz del documento xml
//Define el elemento raiz para un arbol XML

@XmlRootElement(name="libreria")  
@XmlType(propOrder= {"nombre","libros"})
public class Libreria {
	private String nombre;
	
	//Este atributo contiene otros tag internamente en este caso debemos configurar 
	//en el getLibros que es un wrapper un ENVOLTORIO
	private ArrayList<Libro> libros = new ArrayList();
	
	public Libreria() {
	}

	@XmlElement(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElementWrapper(name="libros")
	@XmlElement(name="libro")//Que cada objeto que devuelve esta coleccion (libro) es un objeto que esta dentro de libros 
	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
}
