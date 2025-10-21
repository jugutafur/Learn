package poo;

import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import java.util.Date;

public class Uso_Personas_Abst {
	
	public static void main(String [] args) {
		
		JOptionPane.showMessageDialog(null, "mensaje de prueba");
		
		EmpleadoX trabajador1 =new EmpleadoX("luis", 5000, 1988, 9, 24);
		
		trabajador1.setSueldo(20);
		System.out.println("El trabajador 1 tiene un sueldo "+trabajador1.getsueldo()+" Su Id es "+trabajador1.getID()+""
				+ "y su fecha de contrato es "+trabajador1.getContrato());
		
		
		PersonaX[] lasPersonas=new PersonaX[2];
		
		lasPersonas[0] =new EmpleadoX("luis conde",5000, 2009, 02, 25);
		lasPersonas[1]= new AlumnoX("jorge", "sistemas");
		
//--------------------------------------------------------------
	//ejemplo de refundicion o casting
		
		double num1=1.75;
		int num2=(int) num1;
		
	//de donde es? nuevo_obeto=(el tipo al qu elo queremos convertir) el otro obejto;
	//jefatura jefa_finanzas=(jefatura) misEmpledos[x]; 
//------------------------------------------------------------------			
		
		for(PersonaX p:lasPersonas) {
			System.out.println(p.getNombre()+","+p.getDatos());
		}
	}
}

 abstract class PersonaX{
	
	public PersonaX(String nom) {
		
		nombre=nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDatos();

	private String nombre;
}

class EmpleadoX extends PersonaX{
	public EmpleadoX(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo=sue;
		GregorianCalendar Calendario =new GregorianCalendar(agno, mes-1, dia);
		AltaContrato=Calendario.getTime();
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public double getsueldo() {
		return sueldo;
	}
	
	public Date getContrato() {
		return AltaContrato;
	}
	
	public String getID() {
		return "el Id del trabajador es "+Id;
	}
	
	public void setSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	public String getDatos() {
		return "te escribo desde Empleado";
	}
	private double sueldo; 
	private int agno, mes, dia;
	private Date AltaContrato;
	private int Id;
	private static int IdSiguiente=1;
}

class AlumnoX extends PersonaX {
	public AlumnoX(String nom, String Car) {
		
		super(nom);
		carrera=Car;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public String getDatos() {
		return "te escribo desde alumno";
	}
	
	private String carrera;
}