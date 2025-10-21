package UseJaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="libro")
@XmlType(propOrder={"isbn","titulo","autor"}) //El orden en el cual encontrara las tag
public class Libro {
	private String isbn;		//Aca lo definimos como un atributo pero en el XML es un Elemento del tag libro
	private String titulo;		//En cambio este atributo de clase si es un tag en el XML
	private String autor;		//Tambien este es un tag en el XML
	
	public Libro() {
	}

	@XmlAttribute(name="isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	//@XmlElement(name="otroNombre") Esto en el caso de que le tag tenga otro nombre y la clase sea otro
	@XmlElement(name="titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	//@XmlElement(name="otroNombre") Esto en el caso de que le tag tenga otro nombre y la clase sea otro
	@XmlElement(name="autor")
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
