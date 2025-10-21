package Cien_ejercicios;

import javax.swing.JOptionPane;
import java.util.*;

public class Factura_azucar {
	
	public static void main(String []args) {
		
		int codigo = 0;
		int kilos = 0;
		int total = 0;
		int precio = 0;
		int punto = 0;
		boolean salir=false;

		String [] mis_productos = {"Arroz", "Panela", "Cafe", "Leche", "Pan" };
		int [] mis_precios = 	  {  500, 	  450, 		300, 	1000,   200};

			Scanner entrada=new Scanner(System.in);
		
		do {
			System.out.println("gestion de facturas");
			System.out.println("Ingrese el codigo del producto \n0. Arroz. \n1. Panela. \n2. Café. \n3. Leche.\n4. Pan");
			codigo=entrada.nextInt();
			if(codigo > mis_productos.length) {
				System.out.println("Ingreso un valor invalido");
			}else {
				System.out.println("producto "+ mis_productos[codigo]);
				System.out.println("Ingrese cantidad");
				kilos=entrada.nextInt();
				precio=mis_precios[codigo];
				total=kilos*precio;
				}
			System.out.println("¿Desea ingresar otro producto\1.si	2.No");
			punto=entrada.nextInt();
					
			if(punto==1) {
				salir=true;
			}else {
				salir=false;
			}
		}
		while(salir);
		if (kilos>0) {
			System.out.println("El producto "+mis_productos[codigo]+" x Cantidad= "+kilos+ " valor= "+total );					
		}
		System.out.println("Gracias por su visita");
	}
}
