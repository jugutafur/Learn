package poo;

import java.util.Scanner;

public class Enumerados2 {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE }
	
	
	//este tipo enum permite crear metodo CONSTRUCTOR y metodos GETTERS y SETTERS
	
	enum talla{
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private String abreviatura;

		//Constructor debe ser privado ya que a un emn no lo pueden ejemplarizar o instanciar un objeto 
		private talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		public String getAbreviatura(){
			return abreviatura;
		}
		
	}
	
	public static void main(String [] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla \nS: MINI\nM: MEDIANO \nL: GRANDE\nXL: MUY GRANDE ");
		String entrada_datos=entrada.next().toUpperCase();
		
		//video 48 enumerados
		//con el metodo static value of es detectar a que tipo pertenece ese texto o string que el usario
		//a ingresado por consola y que tenemos almacenados en la variable entrada_datos y eso lo hace 
		//gracias al primer argumento valueOf devulve el nombre de la constante enumerada ademas es static
		talla la_talla=Enum.valueOf(talla.class, entrada_datos);
		
		System.out.println("la talla es = "+ la_talla);
		System.out.println("Abreviatura = "+ la_talla.getAbreviatura());
		
	}

}
