package Cien_ejercicios;

import javax.swing.JOptionPane;

public class Ingresar_numeros {
	
	public static void main(String args[]) {
		
	//programa que pide numeros por JOptionPane y los sumara hasta que el usuario ingrese o en 
	//la caja
		
		System.out.println("prueba");
		int numero=0, total=0;
		String repetir;
		boolean otravez=false;
		
	do {	
	do {
		 numero =Integer.parseInt(JOptionPane.showInputDialog("ingerese numeros"));
		 total=total+numero;
		 
		 System.out.println("la suma es "+total);
	
	}while(numero!=0);
	
		repetir=JOptionPane.showInputDialog("¿Desea ingresar nuevos numeros\n");
		if(repetir.equalsIgnoreCase("si")) {
			otravez=true;
		}else {
			otravez=false;
		}
	}while (otravez);
		
	}
}
