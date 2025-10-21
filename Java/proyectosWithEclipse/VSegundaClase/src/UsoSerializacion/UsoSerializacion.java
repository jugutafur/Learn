package UsoSerializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class UsoSerializacion {
	
	public static void main(String [] args) {
		
		System.out.println("Esta aplicacion va a serializar un obejto es decir lo va a pasar a bytes para que"
				+ "sea almacenado en disco y luego se va a deserializar es decir se va a restaurar el objeto ");
		
		int i=0;
		
		JOptionPane.showMessageDialog(null, "mensaje de prueba");
		
		EmpleadoX trabajador1 =new EmpleadoX("luis", 5000, 1988, 9, 24);
		
		trabajador1.setSueldo(20);
		System.out.println("El trabajador 1 tiene un sueldo "+trabajador1.getsueldo()+" Su Id es "
				+trabajador1.getID()+ "y su fecha de contrato es "+trabajador1.getContrato());
		
		/*
		PersonaX[] lasPersonas=new PersonaX[3];
		
		lasPersonas[0] = new EmpleadoX("luis conde",5000, 2009, 02, 25);
		lasPersonas[1] = new AlumnoX("jorge", "sistemas");
		lasPersonas[2] = trabajador1;
		
		for (PersonaX personaX : lasPersonas) {
			System.out.println("Del array lasPersonas "+i+". = "+personaX);
			i++;
		}
		i=0;
		
		//vamos a armar el flujo de ObjectOutputStream
		//Como esto lanza una exception debemos manejar con un bloque try catch
		
		try {
			ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\VEstudioEnserio\\src\\UsoSerializacion\\Serializacion.txt"));
			ObjectOutputStream.writeObject(lasPersonas); //El objeto que queremos trasferir 
			ObjectOutputStream.close(); //Cerrar la conexion
			
			//Recuperar el objeto
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\VEstudioEnserio\\src\\UsoSerializacion\\Serializacion.txt"));
			//En este punto estamos listos para leer de afuera hacia adentro pero como lo que vamos a recuperar
			//es un array debemos guardar lo que leemos en un array por ello creamos uno nuevo en el cual se almacenara 
			//lo que estamos leyendo 
			
			//El metodo readObjet que pertenece a la clase ObjectInputStream devuelve un tipo de dato Object es por 
			//ello que se debe hacer casting   
			PersonaX[] personasRecuperadas = (PersonaX[]) objectInputStream.readObject();
			
			objectInputStream.close(); //Cerrar la conexion
			
			System.out.println("Esta data es el array recuperado desde el fichero ");
			
			for (PersonaX personasRecuperadasI : personasRecuperadas) {
				System.out.println("Del array lasPersonas "+i+". = "+personasRecuperadasI);
				i++;
			}
			i=0;
			
		}catch(Exception e) {
			System.out.println("El error es = "+e);
		}
		
//--------------------------------------------------------------
	//ejemplo de refundicion o casting
		
		double num1=1.75;
		int num2=(int) num1;
		
	//de donde es? nuevo_obeto=(el tipo al qu elo queremos convertir) el otro obejto;
	//jefatura jefa_finanzas=(jefatura) misEmpledos[x]; 
//------------------------------------------------------------------			
		
		for(PersonaX p:lasPersonas) {
			System.out.println(p.getNombre()+","+p.getDatos());
		}*/
	}
}

 abstract class PersonaX implements Serializable {
	 
	 //podemos setear un valor por defecto al serialVersionUID para que sin importar que lo que se 
	 //guarda sea diferente a lo que se lee 
	 
	private static final long serialVersionUID = 1l;

	private String nombre;
	
	public PersonaX(String nom) {
		nombre=nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDatos();

	//Sobre-Escribir el metodo toString de manera adecuada con StringBuilder
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(nombre);
		return stringBuilder.toString();
	}
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