package Cien_ejercicios;

import javax.swing.*;//JOptionPane
import java.util.*;//Scanner

public class Captura_Positivos {
	
	public static void main(String []args) {
		
		System.out.println("Programa para captura numeros Positivos y calcular su media\nAl ingresar"
				+ "un numero negativo el programa finaliza\n");
		
		int num= 0;
		int num1= 0;
		int suma= 0;
		int contador=1;
		boolean bandera=true;
		
		do {
			num=Integer.parseInt((JOptionPane.showInputDialog("Ingrese numeros el # "+contador)));
		
			if(num>0) {		
				System.out.println("Ingresaste un numero positivo");
				suma=suma+num;
				contador++;
			}else {
				bandera=false;
				System.out.println("Ingresaste un negativo");	
			}
		}
		while(bandera);
		
		if(contador==0) {
			System.out.println("El promedio no se puede indicar");
		}else {
			System.out.println("la suma total es "+suma);
			System.out.println("la cantidad de numeros es "+contador);
			System.out.println("el promedio de lo ingresado es "+suma/contador);
			}
	
	//instanciar una variable objeto de la clase Scanner
	//y en los parametros o argumentos le indicamos que tomara datos de System.in
	
	Scanner entrada=new Scanner(System.in);
	
	num1=entrada.nextInt();
	
	}
}
