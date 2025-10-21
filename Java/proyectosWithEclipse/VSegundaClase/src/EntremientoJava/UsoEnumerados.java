package EntremientoJava;

import java.util.Scanner;
import EntremientoJava.Semana.Dias;

public class UsoEnumerados {
	
	//una forma de definir enum
	enum Colores2 {
		VERDE, AZUL, ROJO
	}
	//otra forma de definir enum
	enum Hermano {CARLOS, MIGUEL, JUAN};

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String dia;
		Dias elDia; //ENUM DECLARADO POR FUERA DE ESTA CLASE se debe importar la ubicacion de la clase
		Colores colores; //ENUM DECLARADO POR FUERA DE ESTA CLASE
		
		System.out.println("Esto viene de Enum Colores = "+ Colores.AZUL); //Declarados por afuera
		System.out.println("Esto viene de Enum Colores2 = "+ Colores2.ROJO); //Declarados por adentro
		System.out.println("Esto viene de Enum Hermano = "+ Hermano.CARLOS); //Declarados por adentro

		//Esto es necesario para trabajar con el enum que tiene el constructor
		System.out.println("Por favor ingrese El dia de la semana");
		dia = entrada.next().toUpperCase(); //variable referencia
		elDia = Enum.valueOf(Dias.class, dia); //Variable tipo enum
		System.out.println("Esto viene de Enum Dias = "+ elDia); //Declarados por afuera
		System.out.println("Esto viene de Enum Dias = "+ elDia.getAbreviatura()); //Declarados por afuera
	}
}