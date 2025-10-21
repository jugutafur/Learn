package Interfaz_Grafica;

import poo.clase1;

//Esta clase se crea con el unico objetivo para ver la importacion desde otro paquete
//esta misma es llamada por clase2.java en el paquete poo ver la clase 

public class clase3 extends clase1{
	
	private int edad ;
	private String nombre;
	private boolean sexo;
	
	public clase3 (int edad,  String nombre, boolean sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo =  sexo;
	}
	
	public void setEdad(int edad) {
		edad = this.edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		nombre = this.nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setSexo(boolean sexo) {
		sexo = this.sexo;
	}
	
	public boolean getSexo() {
		return sexo;
	}

}
