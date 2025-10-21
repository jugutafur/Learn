package AulaMatriz;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class OperacionesArray {

	
	public static void main(String args[]) {
		
		int size = 0;

		int j = 0;
		String letraArray = "";
		int data = 0 ;
		int operacion = 0;
		int prueba = 0;
		boolean repetir = false;
		int repetir2 =0;
		
		Scanner entrada = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "This is an app that you cand operate Array");
		
		do {
		size= Integer.parseInt(JOptionPane.showInputDialog("Insert size to Array"));
		
		int[] arrayA= new int[size];
		int[] arrayB= new int[size];
		int[] arrayC= new int[size];
		
		
		for(int i=1; i<=2;i++) {
			letraArray = (i == 1)?"A":"B";
			for(j=0; j<size; j++) {		
				if(i == 1) {
					System.out.print("Please Insert posicion "+ j + " of Array"+ letraArray+" = " );
					data = entrada.nextInt();
					entrada.close();
					arrayA[j]=data;
				}else {
					System.out.print("Please Insert posicion "+ j + " of Array"+ letraArray+" = ");
					data = entrada.nextInt();
					entrada.close();
					arrayB[j]=data;
				}
				
			}
		}
		
		operacion = Integer.parseInt(JOptionPane.showInputDialog("Select please, the operation that do you want do \n1. Suma\n2. Resta\n3. Multiplicacion"));
	
		arrayC = OPeraciones.oMatematica(operacion, arrayA, arrayB, arrayC, size);
		
		System.out.println("ArrayA");
		for(int e: arrayA) {
			System.out.print(e+"-");
		}
		System.out.println("");
		System.out.println("ArrayB");
		for(int e: arrayB) {
			System.out.print(e+"-");
		}
		
		System.out.println("");
		System.out.println("ArrayC");
		for(int e: arrayC) {
			System.out.print(e+"-");
		}
		
		repetir2 = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar nuevos valores? \n1.Si  2.No"));
		
		repetir = (repetir2==1)?true:false;
		
		}while(repetir);
		
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion");
		
		entrada.close();
	}

}

class OPeraciones{
	
	static int pp =99;
	
	public static int[] oMatematica(int operacion, int[] arrayA, int[] arrayB, int[] arrayC, int size) {
		int i=0;
		switch(operacion) {
		case 1:
			System.out.println("Suma");
			for(i=0; i<size; i++) {
				arrayC[i]=arrayA[i]+arrayB[i];
			}
			break;
		case 2:
			System.out.println("Resta");
			for(i=0; i<size; i++) {
				arrayC[i]=arrayA[i]-arrayB[i];
			}
			break;
		case 3:
			System.out.println("Multiplicacion");
			for(i=0; i<size; i++) {
				arrayC[i]=arrayA[i]*arrayB[i];
			}
			break;
		}
		return arrayC;
	}
}
