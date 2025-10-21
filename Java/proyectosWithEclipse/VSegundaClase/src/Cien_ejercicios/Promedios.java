package Cien_ejercicios;

import javax.swing.JOptionPane;

public class Promedios {
	
	//programa que pide 10 numeros enteros y dara promedios de los negativos y positivos por aparte
	//ademas al final inidicara cuantos 0 fueron ingresados 

	public static void main (String [] args) {
		
		System.out.println("ok");
		
		String cantidad;
		int num=0,contador=1, positivo=0, negativo=0, cero=0, k=0;
		int contadorP=0, contadorN=0, contadorcero=0;
		double Promedio_Positivo=0,Promedio_Negativo=0;
		
		cantidad=JOptionPane.showInputDialog("Ingrese la cantidad de numeros ");
		int cantidad_num=Integer.parseInt(cantidad);
	
		
		while(k < cantidad_num)	{
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero \n\n# "+contador));
			contador++;
			
			 if(num > 0) {
				System.out.println("Ingresaste un Positivo");	
				positivo=positivo+num;
				contadorP++;
					
			 }else if(num < 0) {
				System.out.println("Ingresaste un Negativo");
				negativo=negativo+num;
				contadorN++;
			 }else if(num == 0) {
				 
				k = cantidad_num + 1; 
				cero = cero + num;
				contadorcero++;
			 }
			k++; 
		}		
		
		if(contadorP == 0) {
			System.out.println("Como no ingresaste numeros Positivos no hay valor a mostrar");
		}else if(contadorN == 0){
			System.out.println("Como no ingresaste numeros Negativos no hay valor a mostar ");
		}else{
		
		Promedio_Positivo=positivo/contadorP;
		Promedio_Negativo=negativo/contadorN;
		
		System.out.println("Promedio Posotivos "+Promedio_Positivo);
		System.out.println("Promedio Negativos "+Promedio_Negativo);	
		System.out.println("Cantidad de Ceros "+contadorcero);
		}
	}		
}

