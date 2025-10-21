package Cien_ejercicios;

import java.util.*;//Scanner
import javax.swing.JOptionPane;

public class El_mayor_de_un_array {
	
	public static void main(String args[]) {
	
	//con [] se indica que ese trata de un array y los array en java se debe tratar como
	//un objeto es por ello que se debe instanciar
		
		//tipo de datos INT
		//nombre del array
		//[]
		//palabra reservada
		//constructor INT
		//tamaño del arraya
		
		//int familia[] = new int[5];
		
		int mayor=0;
		int [] familia = {15,80,7,9,92};
		boolean repetir = true;
		
		do {
        for(int e : familia) {
			System.out.println("numeros dentro del array familia " +e);
		}
		
        System.out.println("ingrese los nuevos valores del array familia");
		Scanner entrada=new Scanner (System.in); 
		
		for(int i=0; i<familia.length; i++){
			
			System.out.print("ingrese el item "+i+" valor = ");
			familia[i]= entrada.nextInt();
			if(familia[i]>mayor) {
				mayor=familia[i];
			}
		}
		
		for(int e:familia) {
			System.out.println("nuevos numeros de familia "+e);
		}
		System.out.println("el mayor valor es "+mayor);
		
		int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar nuevos valores 1.si 2.no"));
		if(respuesta == 1) {
			repetir = true;
		} else {
			repetir = false;
		}
	    } while(repetir);
		
		System.out.println("gracias. vuelva pronto");
	}
}
