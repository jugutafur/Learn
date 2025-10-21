package poo;

import java.util.Date;
import java.util.GregorianCalendar;

//Este fichero nos mostrara el como implementar una clase y metodo abstracto 
public class Uso_Persona {
	
	public static void main(String []args) {
		System.out.println("ok");
	
		Persona[] lasPersonas=new Persona[2];
		
		//Polimorfismo Esto es gracias a la regla "ES UN..."
		lasPersonas[0]= new Empleado2("fredy lopez", 50000, 2008, 02, 15);
		lasPersonas[1]= new Alumno("Julio Peres","Sistemas");
		
		//Enlazado Dinamico 
		for(Persona e:lasPersonas) {
			System.out.println(e.dime_nombre()+","+e.dame_descripcion());
		}
	}
}
//----------------------------------------------------------------------------------------------------
abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre =nom;
	}
		
	public String dime_nombre() {//getter
		return nombre ;
	}
	
	//Declaracion de metodos abstract
	public abstract String dame_descripcion();
}
//----------------------------------------------------------------------------------------------------
class Empleado2 extends Persona{
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente;

	public Empleado2 (String nom, double suel, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=suel;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);

		altaContrato= calendario.getTime();	
		
		Id=IdSiguiente;
		IdSiguiente++;	
	}

	public String dame_descripcion() {
		return "Este empleado tiene un Id = " + Id +  "con un sueldo = " + sueldo ;
	}
	
	public double dime_sueldo() {//getter
		return sueldo;
	}
	
	public Date dime_fecha_contrato() {//getter
		return altaContrato;
	}
	
	public void sube_sueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
}

//----------------------------------------------------------------------------------------------------
class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera=car;
	}
	
	public String dame_descripcion() {
		return "Este alumno esta estudiando la carrera de "+carrera;
	}
	
}
