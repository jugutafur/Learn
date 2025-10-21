package AulaMatriz;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Histograma {
	public static void main (String [] args) throws IOException {
		
		System.out.println("Este es un histograma");
		int tamanio = 0;
		int repetir2 =0;
		boolean repetir = false;
		String mensaje = "";
		Scanner entrada = new Scanner(System.in);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\VEstudioEnserio\\src\\AulaMatriz\\FileHistograma.txt"));
		
		do {
		tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del Array"));

		int[] myArray = new int[tamanio];
		JOptionPane.showMessageDialog(null, "Insert please to cadena data");
		
		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");
		
		repetir = arTemp.length == tamanio? true: false;
		
		mensaje = repetir? "valor valido":"valor invalido";
		System.out.println(mensaje);
		
		if(repetir) {			
			for(int i=0; i<tamanio; i++) {
				myArray[i] = Integer.parseInt(arTemp[i]);
			}
			
			for(int e: myArray) {
				System.out.println("valor = "+e);
			}
		}
		System.out.println("Do you like insert new values?\n\n1. Yes 2.No");
		repetir2 = entrada.nextInt();
		
		repetir = repetir2 ==1? false: true;
		}while(!repetir);
		System.out.println("Thanks for used this app");
	}
}
