package Cien_ejercicios;

import javax.swing.JOptionPane;

public class SumadeArreglos {
	
	public static void main(String []args) {
		System.out.println("suma de dos arreaglos en un tercero");
		
		int cantidad,var,i,j=0;
		cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los 2 arreglos"));
		
		int matriz1 []=new int [cantidad];
		int matriz2 []=new int [cantidad];
		int matriz3 []=new int [cantidad*2];
		
		for(i=0; i<matriz1.length; i++) {
			var=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion "+i+ "\n\nmatriz1" ));
			matriz1[i]=var; 
			//matriz3[i]=var;
			System.out.println(" + "+var);
		}
		
		for(i=0; i<matriz2.length; i++) {
			var=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion "+i+ "\n\nmatriz2" ));
			matriz2[i]=var;
			//matriz3[i+10]=var;
			System.out.println(" - "+var);
		}
		
		for(i=0; i<matriz2.length; i++) {
			matriz3[j]=matriz1[i];
			System.out.println("matriz C "+matriz3[j]);
			j++;
			matriz3[j]=matriz2[i];
			System.out.println("matriz C "+matriz3[j]);
			j++;
		}
		
		for(int e:matriz3) {
			System.out.println(" "+e);
		}
	}

}
