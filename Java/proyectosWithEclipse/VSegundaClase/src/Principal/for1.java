package Principal;
//programa que imprime en consola 10 veces mi nombre

//Scanner
import java.util.Scanner;

import javax.swing.JOptionPane;

public class for1 {

	public static void main(String[] argrs) {
		//En esta sentencia tomara la infocaion del archivo indicado en el argumento
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingrese su nombre");
		String nombre = entrada.nextLine();
		System.out.println("Cuantas veces quiere visualizarlo");
		int veces = entrada.nextInt();

		for(int i=0; i<10; i++) {
			System.out.println(+i+". " +nombre);
		}

		int arroba=0;
		boolean punto=false;
		String mail= JOptionPane.showInputDialog("introduce mail");

		for( int i=0; i<mail.length(); i++) {

			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto=true;
			}
		}
		if(arroba==1 && punto) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}
	}
}
