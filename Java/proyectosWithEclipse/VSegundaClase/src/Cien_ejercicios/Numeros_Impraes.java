package Cien_ejercicios;

import javax.swing.*;//JOptionPane

public class Numeros_Impraes {
	
	public static void main(String []args) {
		
		System.out.println("Programa que muestra los primeros 10 numeros impares en pantalla");
		
		int contador=0;
		String cantidad;
		
		cantidad=JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea visualizar");
		int cantidad2=Integer.parseInt(cantidad);			
		
		long ProductoImpares=1;
		
		for(int i=1; i<cantidad2; i+=2) {
			contador ++;
			ProductoImpares=ProductoImpares*i;
			System.out.println("posicion # "+contador+" es = "+ProductoImpares);		
		}
	}
}
