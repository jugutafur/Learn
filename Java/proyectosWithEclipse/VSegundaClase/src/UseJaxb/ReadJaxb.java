package UseJaxb;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

//Leer un documento xml usando java
//ver video https://www.youtube.com/watch?v=3qMVLs3K0ws
public class ReadJaxb {

	public static void main(String[] args) throws JAXBException{
		
		System.out.println("App to read XML");
		//Objetos necesarios para leer el documento
		//.....JAXBContext.newInstance(Va a pedir un objeto class que identifique cual
		//va a ser la clase que represente la totalidad del XML )
		//como esta linea puede lanzar una Exception debemos indicar que esta clase main es 
		//posible que puede lanzar una excepcion 
		JAXBContext context = JAXBContext.newInstance(Libreria.class);
		System.out.println("App to read XML");
		//Ahora debemos declarar un objeto que nos permita leer el XML
		//PASAR DE XML A JAVA
		
		Unmarshaller unMarshaller = context.createUnmarshaller();
		//Todas las clases JAVA devulven object es por eso que se debe hacer un Casting
		Libreria libreria = (Libreria) unMarshaller.unmarshal(new File("libreria.xml"));
		
		System.out.println("Nombre = "+libreria.getNombre());
		ArrayList<Libro> librosRecuperados = libreria.getLibros();
		
		for(Libro librosI: librosRecuperados) {
			System.out.println(librosI.getIsbn()+" "+librosI.getTitulo()+" "+librosI.getAutor());
		}		
	}
}
