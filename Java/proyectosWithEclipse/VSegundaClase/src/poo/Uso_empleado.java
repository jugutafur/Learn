package poo;
import java.util.*; //Date
import javax.swing.*;//JOptionPane

public class Uso_empleado {
	public static void main (String[] args) {	
		
		String cargo="";
		String vacio="";
		
		Jefatura Jefe_RRHH=new Jefatura("luis carlos",20000, 2000, 02, 19);
		
		Jefe_RRHH.EstableceIncentivo(8000);
		
		System.out.println("Jefe_RRHH tiene un nombre de " + Jefe_RRHH.dime_nombre());
		
		System.out.println("Este sueldo tiene incoporado el incentivo "+ Jefe_RRHH.dime_sueldo());
		
		/* Subir el sueldo de manera dinamica 
		for(int i=0; i<3; i++) {
			cargo=""+i;
			System.out.println("valor de i= "+ (cargo+1));
		}
		Jefatura vacio=new Jefatura("luis carlos",10000, 2000, 02, 19);
		*/
		
		//Un Array de tipos empleados
		Empleado[] misEmpleados =new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco gomez", 10000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana lopez", 10000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria martin", 10000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("luz dary");
		misEmpleados[4] = Jefe_RRHH;  //polimorfismo en accion.Principio de sustitucion SE PUEDE USAR UN OBJETO DE LA SUB-CLASE CUANDO EL PROGRAMA ESPERE UN OBJETO DE LA SUPER-CLASE
		misEmpleados[5] = new Jefatura("juan tafur", 10000, 1988, 10, 24); // EN ESTE CASO TAMBIEN ES LO MISMO QUE LA ANTERIOR LINEA...PERO EN ESTE CASO LLAMAMOS AL CONSTRUCTOR 
		
//Ahora usando CASTING o REFUNDICION PASAMOS un objeto de misEmpelados--->Jefatura
		
		//a modo de ejemplo 
		
		double num1=1.75;
		
		int num2=(int) num1;
		
		//^^^^^^^^ 
		
		Jefatura Jefe_Finanzas = (Jefatura) misEmpleados[5];
		
		//la siguiente linea SOLO ESPOSIBLE si se realiza la anterior linea ya que misEmpleado[5] es un 
		//objeto de tipo Jefe no puede usar metodos de Jefe esto es debido a que esta en un array de tipo
		//Empleado una refuncion o casting con la anterior linea
		
		//y lo anterior es posible debido a que se cumple la regla "ES UN..." por que si se intenta al 
		//revez el compilador da error de tal manera como se indica en la linea comentada
		
		//Jefatura Jefe_Comercial = (Jefatura) misEmpleados[1];
		
		Jefe_Finanzas.EstableceIncentivo(1000);
		
		System.out.println(Jefe_Finanzas.tomar_decisiones(" descanzo los martes "));
		
		//Usando el principio de sustitucion
		Empleado director_comercial = new Jefatura("sandra", 55000, 2012, 05, 05);
		
		//Comparable es una interfaz LAS INTERFACEZ NO SE PUEDEN INSTANCIAR la siguiente linea de codigo es posible
		//debido a que a la hora de llamar el constructor usamos el constructor de Empelado y no el Comparable
		//esto es por el principio de sustitucion 
		
		
		//Usando el principio de sustitucion
		Comparable ejemplo=new Empleado("Elisabeth", 95000, 2011, 06, 07);
		
		System.out.println("el Jefe " +Jefe_Finanzas.dime_nombre()+ " tiene un bono de "+Jefe_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[1].dime_nombre()+"tiene un bono de: "+misEmpleados[1].establece_bonus(500));

		//with this condicional we know determine is manager commercial is employee		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo jefatura");				
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("implementa la interfaz comparable");
		}
		
		for(int i=0; i<6; i++) {			
			misEmpleados[i].sube_sueldo(5);
		}

//podemos usar un foreach o tambien llamado foreAnsh un forMejorado para recorrer la matriz de 
//manera mas eficiente
//pero la comentamos para no incrementar 2 veces el sueldo	
		
		
		
//*************************************************************************************************		
//************************************ POLIMORFISMO***********************************
//*************************************************************************************************
		//El compilador en tiempo de ejecucion puede determinar a cual tipo de datos es, es decir 
		//dentro de este array misEmpleados hay objetos de dos clases diferentes la clase Empleado y Jefe
		
		
		/*	
		for(Empleado e: misEmpleados) {
			e.sube_sueldo(5);;
		}
		
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre()+ "sueldo: "+ e.dime_sueldo() + "Fecha alta: "
			+ e.dime_fecha_contrato());
		}
		
		*/
		
		
		//De que clase es 
		//variable cualquiera
		//nombre de Array


//*************************************************************************************************		
//************************************ POLIMORFISMO***********************************
//*************************************************************************************************
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("nombre "+e.dime_nombre()+ " sueldo = "+e.dime_sueldo()+" contrato "
					+ ""+ e.dime_fecha_contrato());				
		}
		
		System.out.println("Uno"+ Empleados.dameIdSiguiente());
			
		System.out.println("\n");
/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		for(int i=0; i<6; i++) {
			
			System.out.println("nombre "+misEmpleados[i].dime_nombre()+ " sueldo = "+misEmpleados[i].dime_sueldo()+" contrato "
					+ ""+ misEmpleados[i].dime_fecha_contrato());
		}	
		System.out.println("Dos" + Empleados.dameIdSiguiente());
		System.out.println(misEmpleados[0].get_datos());
		System.out.println(misEmpleados[1].get_datos());
		System.out.println(misEmpleados[2].get_datos());
		System.out.println(misEmpleados[3].get_datos());
/*----------------------------------------------------------------------------------------------------------------------		
		
	//instanciar la clase empleado
	//nombre de la clase. nombre de la instancia =new ""llamamos al constructor
	//y en los argumentosdel constructor pasamos los paramentros en el mismo
	//orden y el mismo tipo de dato
		
		Empleado empleado1 = new Empleado("Paco gomez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana lopez", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("Maria martin", 105000, 2002, 03, 15);
	// ahora vamos a aumentar elsueldo de los empleados
		
		empleado1.sube_sueldo(5);
		empleado2.sube_sueldo(8);
		empleado3.sube_sueldo(4);
		
	//sacamos por pantalla la informacion de los empleados
		System.out.println("1. Nombre "+empleado1.dime_nombre()+" sueldo = "+empleado1.dime_sueldo()+
		" fecha de contratacion "+empleado1.dime_fecha_contrato());
		System.out.println("2. Nombre "+empleado2.dime_nombre()+" sueldo = "+empleado2.dime_sueldo()+
		" fecha de contratacion " +empleado2.dime_fecha_contrato());
		System.out.println("3. Nombre "+empleado3.dime_nombre()+" sueldo = "+empleado3.dime_sueldo()+
		" fecha decontratacion "+empleado3.dime_fecha_contrato());*/
	}
}

class Empleado implements Comparable, Trabajadores{
	
	//declaracion de variables de clase

	//modificador de acceso para encapsular

	//la clase String no pertenece a los tipos de datos primitivos como lo son INT, LONG, BYTE....	
		private String nombre;
		private double sueldo;
	//tampoco Date pertenece a los tipos de datos primitivos	
	//la clase Date no pertenece al paquete java.lang
		private Date altaContrato;
		private int Id;
		private static int IdSiguiente=1;	

	//este es un metodo constructor
	public Empleado(String nom, double suel, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=suel;
//De esta manera construimos un objeto "calendario" con un CONSTRUCTOR de la clase GregorianCalendar	
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		//de estea manera utilizamos unos de los metodos de GregorianCalendar
		//Y este metodo devuelve la fecha
		altaContrato= calendario.getTime();
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	// este es otro metodo constructor
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01 );
	}
//---------------------------------------------------------------------------------------	
// declaracion de metodos getters	
	
	public String dime_nombre() {//getter
		return nombre;
	}
	
	public double dime_sueldo() {//getter
		return sueldo;
	}
	
	public Date dime_fecha_contrato() {//getter
		return altaContrato;
	}
	
//metodo setter para modificar el sueldo 
	
	public void sube_sueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public static String dameIdSiguiente() {
		return"El IdSiguiente es "+IdSiguiente; 
	}
	
	public String get_datos(){
		return "A. Elempleador de nombre = "+nombre+" tiene un sueldo de "+sueldo+" su Id es= "+Id;
	}

//this method we need create to use Arrays.sort that is organizaded our Array En este caso dedemos implementar 
	//Este metodo compareTo() que bien declarado por la interfaz Comparable
	//Compares this object with the specified object for order. Returns a negative integer, zero, 
	//or a positive integer as this object is less than, equal to, or greater than the specified object.
	
	public int compareTo(Object miObjeto){
		
		//se debe hacer un casting o refuncion para que el obejto ingresado en la zona de parametros sea de tipo 
		//Empleado 
		
		Empleado otroEmpleado= (Empleado)miObjeto;
		
		//los organiza por Id
		if(this.Id<otroEmpleado.Id) {
			return -1;  //if the object is less than
		}
		if(this.Id>otroEmpleado.Id) {
			return 1; //if the object is greater 
		}
		
		return 0; //if the object is equal
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
									  
	}
	
	
}

final class Jefatura extends Empleado implements Jefes {
	
	private double incentivo;	
	
	//Constructor
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {//metodo constructor
	super(nom, sue, agno,mes,dia);
	}
	
	public void EstableceIncentivo(double b) { //setter
		incentivo=b;
	}
	
	//vamos a sobreescribir el metodo dime_sueldo de la SuperClase
	//la sobre-escritura la podemos evidenciar por la flecha en verde que esta a la izquierda
	//y debe estar con la palabra reservada super para que no se llame a si mismo si no al de la 
	//clase padre y pasa de esta manera debido a que tanto en la subClase como en la SuperClase los 
	//Dos metodos se llaman de igual manera
	public double dime_sueldo() {//getter
		double sueldoJefe = super.dime_sueldo();
		return sueldoJefe + incentivo;
	}
	
	public String tomar_decisiones(String desicion) {
		return "un miembro de la direccion ha tomado una descion"+desicion;
	}
	
	public double establece_bonus(double gratifiacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratifiacion+prima;		
	}
	
}

//*************************************************************************************************		
//************************************ Clase Final ***********************************
//*************************************************************************************************


//lo siguiente es errado debido a que la clase JEfatura es final y ya con esto ninguna otra clase puede
//herredarla 
/*
class Director extends Jefatura {
	
	public Director(String nom, double sue, int agno, int mes, int dia) {//metodo constructor
		super(nom, sue, agno,mes,dia);
		}
}
*/

//*************************************************************************************************		
//************************************ Clase Final ***********************************
//*************************************************************************************************