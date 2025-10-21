package Principal;

public class Manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String es una CLASE 
		
		//tipo		variable	Objeto 
		//Objeto	Objeto
		String nombre="Juan tafur";
		
		//Con la anterior linea instanciamos o ejemplarizamos el objeto String		
		
		System.out.println(" Mi nombre es "+nombre);
		
		//Metodo length para determinar cuantas letras tiene el objeto 
		
		System.out.println("Mi nombre tiene "+nombre.length()+" letras");
		
		//metodo charAt devuelve el valor de una posicion
		
		System.out.println("la primera letra de " + nombre+ " es "+ nombre.charAt(0));
		
		//para que me indique la ultima letra
		
		int ultima_letra=nombre.length();
		
		System.out.println("la ultima letra es "+nombre.charAt(ultima_letra-1));
		
		
	}

}
