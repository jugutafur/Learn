package Cien_ejercicios;

import javax.swing.JOptionPane;

public class SumaArreglo3 {
	
	public static void main(String[] args) {
		
		System.out.println("Suma de dos Arrays y visualizacion cada 3 items");
		
		int cantidad, i, j=0, var,z,contador=0;
		
		cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los Arrays"));
		
		int [] matrixA= new int [cantidad];
		int [] matrixB= new int [cantidad];
		int [] matrixC= new int [cantidad*2];
		
		System.out.println("tamaño de C "+matrixC.length);
		for(i=0; i<matrixA.length; i++) {
			
			var=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la matrixA posicion "+i));
			matrixA[i]=var;
			System.out.println("+"+var);
		}
		
		for(i=0; i<matrixB.length; i++) {
			
			var=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la matrixB posicion "+i));
			matrixB[i]=var;
			System.out.println("-"+var);
		}
		i=0;
		j=0;
		
		while(i<matrixA.length) {
			
			for(z=0; z<3; z++) {
				System.out.println("Jarriba ="+j);				//A=1	2	4	5
				if(j<=matrixC.length) {							//C=2	4	8	10			
					matrixC[j]=matrixA[i+z];
					System.out.println("matrizCC "+matrixC[j]);
					j++;
					System.out.println("J ="+j);
				}else {
					System.out.println("Se desbordo arriba");
				}
			}
			for(z=0; z<3; z++) {
				System.out.println("Jabajo ="+j);
				if(j<=matrixC.length) {
					matrixC[j]=matrixB[i+z];
					System.out.println("matrizCC "+matrixC[j]);
					j++;
					System.out.println("J ="+j);
				}else {
					System.out.println("Se desbordo abajo");
				}
			}
			i+=3;
			System.out.println("le sumo 3");
			
		}
		System.out.println(".");

		for (int e:matrixC) {
			System.out.println(" matrixC "+e);
		}		
	}
}
