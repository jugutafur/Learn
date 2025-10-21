package Cien_ejercicios;

import java.util.Scanner;

public class factura_Azuquitar {
	
	public static void main(String []args) {
	Scanner entrada=new Scanner(System.in);	
	
	int var;
	boolean salir=false;
	
	do {
		
		factura compra1=new factura();
		
		System.out.println("gestion de facturas\nIngrese el codigo del producto");			//mostrar
		var=entrada.nextInt();																//capturar numero
		compra1.setter_Producto(var);														//metodo setter
		System.out.println("Ingrese la cantidad");											//mostrar
		
		compra1.setter_cantidad(entrada.nextInt());											//set metodo Y capturar numero	
		
		System.out.println(compra1.getter_general());								//metodo getter
		
		System.out.println("Desea ingresar mas compras\n1.Si  2.No");
		
		if((var=entrada.nextInt())==1) {
		salir=true;	
		}else {
			salir=false;
		}
	}while(salir);
	}

}

class factura{
	
	private int Id;
	private static int IdSiguiente=1;
	private int codigo, cantidad, total, precio ,punto;
	
	public factura() {
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void setter_Producto(int codigo2) {		//setter
		codigo=codigo2;
	}
	
	public String getter_general(){			//getter	
		precio=cantidad*mis_precios[codigo];
		return "factura # " +Id
				+ " El "+mis_productos[codigo]+ " cuesta "+ mis_precios[codigo]+" y compro " +cantidad+" = $ "+precio ;
	}
	
	public void setter_cantidad(int cantidad) {//setter
		this.cantidad=cantidad;
		
	}
	
	String [] mis_productos = {"Arroz", "Panela", "Cafe", "Leche", "Pan" };
	int [] mis_precios = 	  {  500, 	  450, 		300, 	1000,   200};
}