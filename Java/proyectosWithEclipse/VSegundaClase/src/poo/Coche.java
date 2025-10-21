package poo;

import javax.swing.JOptionPane;

public class Coche {

//-------------------------------------------------------------------------------------------------------------------------------------	
// VARIABLES DE CLASE
	
	// agregando el modificador de acceso PRIVATE solo nos es posible modificar un atributo de la 
	// clase solo desde el CONSRUCTOR
	//hay varios modificadores de acceso PRIVATE, PUBLIC, PROTECTER Y EL MODIFICADOR POR DEFECTO
	
	//al encapsularlas con el modificador de acceso solo las podemos ver y modificar desde el 
	//constructor y no de otra clase.
	
	//variable de clase generales
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	//variables de clase particulares
	private String color="verde";
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	//Esto es un metodo constructor es decir quien le da un valor inicial a nuestro objeto
	//y debe tener el nombre de la clase Coche en este caso, esto lo distingue principalmente 
	//de cualquier otro metodo
//-------------------------------------------------------------------------------------------------------------------------------------	
	public Coche() {
		ruedas =4;
		largo =2000;//cm
		ancho = 300;//cm
		motor =1600;//centimetros cubicos
		peso_plataforma = 500;//kilos
	}
	
	//--------------------------------------------------------------------------------------------------------------------
	//		DESPUES DEL CONSTRUCTOR VAMOS A CREAR METODOS GETTERS Y SETTERS PARA QUE SEAN 
	//						LLAMADOS DESDE LAS DEMAS CLASES
	
	//METODO GETTER
	
	//El tipo de dato que devuelve es de tipo String porque va a ser parte de una cadena de 
	//caracteres 
	//AUNQUE tambien podria ser de tipo INT ya que 2000 del atributo largo es un numero
	
	public String get_Largo() {//getter
		return "El largo del coche es "+largo; 
	}
	
	//METODO SETTER
	//Hay dos formas de metodo SETTER una es donde modificamos la variable desde las lineas del 
	//codigo y la otra es indicandolo desde los argumentos del metodo 
	public void set_Color1() {//getter
		color="azul";
	}
	
	//Metodo Setter modificando la variable desde los argumentos 
	public void set_Color2(String coche_color) {
//variable de la clase =variable del argumento		
		color=coche_color;
	}
	
	//METODO GETTER
	public String get_Color() {
		return "El color del coche es "+ color; 
	}
	
	public String get_Datos_generales() {
		return "La plataforma tiene "+ruedas+ " ruedas, Mide " +largo/1000+ " metros, con un ancho de "+ancho+"cm"
				+ " un motor de "+ motor+ " cm/cubicos y un peso de plataforma de "+peso_plataforma+"kg";
	}

	public void set_Asientos(String asientos_cuero) {//Setter
	//variable de la clase= variable del argumento
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}	
	}
	public String get_Asientos() {//getter
		if(asientos_cuero==true) {
			return " el coche tiene asientos de cuero "; 
		}else {
			return"el coche tiene asientos de serie";
		}
	}
	
	public void set_Climatizador(String climatizador) { //setter
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String get_Climatizador() {//getter
		if (climatizador==true){
			return "el coche incorpora climatizador";
		}else {
			return "el coche lleva aire acondicionado";
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------
	//METODO QUE ES SETTER Y GETTER A LA VEZ PERO ES UNA PRACTICA POCO RECOMENDADA
	//										--------------------------------------
	
	public String get_peso_coche() {//Setter y getter a la vez
		
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true){
			peso_total=peso_total+50;
		}	
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
	return "el peso total del coche es "+peso_total;			
	}
	
	//devuelve el precio del coche
	
	public int get_precio_coche() {//getter
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true) {
			precio_final+=1500;
		}
	return precio_final;
	
	}
}
