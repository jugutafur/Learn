package Cien_ejercicios;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class TrabajoOptional {
	public static void main(String args[]) {
		System.out.println("Trabajo con OPtional");
		
		int a=5, b=2;
		
		int resultado = Operacion.suma(a, b);
		System.out.println("El resultado de la suma = "+ resultado);
		
		OptionalApp app1 = new OptionalApp();
		app1.probar("mito");  	//true
		app1.probar("nnn");		//false
		//si le doy null da NullPointerException
		app1.probar(null);
		
		app1.orElse(null);
		app1.orElseThrow("mitto"); // si le mandas un NULL da una excepcion y se bloquea el programa
		app1.isPresent("mitzzfdfo"); //va a dar true con cualquier String pero dara un false con un NULL
		
		Humano2 personaUno = new Humano2("Miguel", "Medellin", 33);
		Optional<Humano2> optionalPerson = Optional.of(personaUno);
		
		System.out.println("Valor del opctional "+ optionalPerson.get().getNombre());
		
	}
}

class Operacion{
	private String nombre;
	private int edad;
	private String Ciudad;
	
	public static int suma(int a , int b) {
		int prueba =5;
		int perro = 8;
		int resultadoDos =0;
		resultadoDos -= prueba;
		int resultado = a+b;
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public Operacion(String nombre, int edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Ciudad = ciudad;
	}
}

class OptionalApp{
	public void probar(String valor) {
		try {			
			System.out.println(valor.contains("mito"));
		}catch(Exception e) {
			System.out.println("Error = "+ e);
		}
		
		//ahora para ver su funcionamiento creamos un optional vacio
		Optional prueba = Optional.empty();
		Optional<String> prueba2 = Optional.empty();
		//Este optional es un envoltorio un wrapper
		
		try {
			prueba.get(); //Devuelve un dato de tipo Objet pues no se le indico nada PERO
			prueba2.get(); //Devuelve String
		}catch(Exception e) {
			System.out.println("hay un error = "+ e);
		}
	}
	
	//Con este metodo en caso de que reciba un valor NULL sacara un String predeterminado si no 
	//mostrara por pantalla el string que le envie por parametro 
	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("Predeterminado");
		System.out.println("El valor es = "+ x);
	}
	
	//Con este metodo lanzamos una excepcion diferente a NullPointerException
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
		System.out.println("El valor es = "+ valor);
	}
	
	//Con este metodo devuelve true or false 
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
}


class Humano2{
	private String nombre;
	private String ciudad;
	private int edad;
	
	public Humano2() {}

	public Humano2(String nombre, String ciudad, int edad) {
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


