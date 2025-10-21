package Principal;
import java.util.Iterator;
import java.util.Scanner;//Scanner
import javax.swing.JOptionPane;

import Cien_ejercicios.Borrar;

public class Array30ventas {
	
	public static void main(String args[]) {
		
		System.out.println("Array de 30 ventas");
		
		
		System.out.println("El valor de la suma = "+ Borrar.sumar(5,6));
		
	//Se pone [] para indicar que es un arreglo y los arreglos en java son tratados como objetos 
	//es por esto que se crea o se instancia el arreglo o array
		
	//tipo de datos que lleva
	//nombre del arreglo
	//palabra reservada new
	//tipo de datos
	//el tamaño del arreglo		scope
		int cantidad = 0;
		int numero = 0 ;
		boolean repetir = true; 
		
		do {
		Scanner entrada=new Scanner (System.in);
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas"));
		double ventas[]=new double [cantidad];
		
		System.out.println("Ingrese la " +cantidad + " ventas del mes");
		
		for(int i=0; i<ventas.length; i++){
			numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de"
						+" la posicion " + (i+1) ));
			//System.out.println("numero "+(i+1));
			ventas[i]= numero;
			//ventas[i]=entrada.nextDouble();
		}	
		
		for(double e : ventas) {
			{			
				System.out.println("ventas "+ e);
			}
		}
		
		int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar nuevos valores 1.si 2.no"));
		//Scanner =entrada=new Scanner (System.in);
		
		if(respuesta == 1) {
			repetir = true;
		} else {
			repetir = false;
		}
		
		}while(repetir);
		System.out.println("gracias por su visita ");
		}
}
