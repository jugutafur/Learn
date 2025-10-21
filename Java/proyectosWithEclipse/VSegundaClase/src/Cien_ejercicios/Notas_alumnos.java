package Cien_ejercicios;
import java.util.*;

public class Notas_alumnos {
	
	public static void main(String []args) {
		
		System.out.println("Programa para definir estudiante de acuerdo a sus notas ");
		Scanner entrada=new Scanner(System.in);

		alumno estudiante1=new alumno("maria tafur",15);
		alumno estudiante2=new alumno("Luis carlos", 14);
		
		System.out.println("Ingrese el nombre del alumno");
		estudiante1.setter_nombre(entrada.nextLine());
		System.out.println("Ingrese las notas");
		estudiante1.setter_notas(10, 10, 9);
		estudiante1.getter_definitiva();
		System.out.println("El alumno "+estudiante1.getter_nombre()+ " tiene un promedio = "+ estudiante1.getter_parcial()
		+ " y una nota = "+estudiante1.getter_definitiva());

		
		profesor teacher1=new profesor("Carmen isabel", 45);
		
		System.out.println(teacher1.getter_nombre());
	}
}

class alumno {
	
	private String nombre;
	private String Nota_final;
	private int edad, primera, segunda,tercera,parcial=74;
	
	public alumno(String nom, int edad) {	
		nombre=nom;
		this.edad=edad;
		
	}
	
	public void setter_nombre(String nom) {
		nombre=nom;
	}
	
	public int getter_parcial() {	
		return parcial;
	}
	
	public void setter_notas(int A, int B, int C) {
	primera = A;
	segunda = B;
	tercera = C;
	}
	
	public String getter_definitiva() {
		 parcial = (primera + segunda + tercera) /3;
		
		if(parcial>=9  && parcial <= 10) {
			Nota_final = "Excelente";
			
		}else if(parcial >= 6) {
			Nota_final = "Aceptable";
			
		}else{
			Nota_final = "deficiente";
		}
		return " " + Nota_final;
	}
	
	public String getter_nombre() {
		return nombre;
	}
}

class profesor extends alumno{
	
	private int sueldo;
	private String Materia;

	public profesor (String nombre, int edad) {
		super(nombre, edad);
	}
}

class director extends profesor{
	
	private int incentivo;

	public director(String nombre, int edad) {
		super(nombre, edad);
	}
	
}