package poo;

public class Pruebas {
	
	public static void main(String []args) {
		
		Empleados trabajador1=new Empleados("Jose");
		Empleados trabajador2=new Empleados("Pedro");
		Empleados trabajador3=new Empleados("Camilo");
		Empleados trabajador4=new Empleados("Eduardo");
		
		trabajador1.set_seccion("bodega");
		trabajador3.set_seccion("sistemas");
		trabajador2.set_nombre("miguel");
		
		System.out.println("trabajador A " +trabajador1.get_datos());
		System.out.println("trabajador C " +trabajador3.get_datos());
		System.out.println("trabajador B " +trabajador4.get_nombre());
				
		System.out.println(Empleados.dameIdSiguiente());
	}
}


class Empleados{
	
	private String nombre;				//cada objeto tiene una copia de nombre
	private String seccion;				//cada objeto tiene una copia de seccion
	private int Id;
	private static int IdSiguiente=1;  	//ningun objeto tiene esta copia de namera individual
										//esta variable de clase es COMPARTIDA
		
	public Empleados(String nom) {
		nombre=nom;
		seccion="administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void set_nombre(String nombre) {//setter
		this.nombre=nombre;
	}
	
	public String get_nombre(){//getter
		return nombre;
	}
	
	public void set_seccion(String cambio_seccion){// setter
		seccion=cambio_seccion;
	}

	public String get_datos() {//getter
		return "Nombre = "+nombre+ " trabajador de la seccion = "+ seccion +" y su Id = "+Id;
	}
	
	public static String dameIdSiguiente() {
		return"El IdSiguiente es "+IdSiguiente; 
	}	
}



