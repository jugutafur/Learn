package Collections;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private int codigo;
	
	public Libro(String titulo, String autor, int codigo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
	}

	public String getDatos() {
		return "El titulo = "+ titulo+ " El autor = " + autor + "y el codigo = "+ codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return codigo == other.codigo;
	}
	
	/*
	public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro otro =(Libro) obj; 
			//ahora ya podemos comparar
			//Con this hace REFERENCIA AL OBJETO EN EL CUAL NOS ENCONTRAMOS
			if(this.codigo == otro.codigo) {
				return true;
			}else {
				return false;
			}
			}else{
				return false;
		}
	}*/
	
	

}
