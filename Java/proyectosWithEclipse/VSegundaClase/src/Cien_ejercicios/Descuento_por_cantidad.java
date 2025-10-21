package Cien_ejercicios;
import javax.swing.*;//JOptionPane

public class Descuento_por_cantidad {
	
	public static void main(String [] args) {

	
//programa que determinara descuento por la cantidad de producto adquirido
		
		boolean otravez=false;
		String repetir;
		
		do {
			double cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad "
					+ "de panes adquiridos\n\n\nCantidad<50 = $5 pesos c/u\nCantidad<100 = $4.5 pesos c/u\n"
					+"Cantidad>100 = $4 pesos c/u"));
			double total=0;
			
			if(cantidad<=50) {
				total=5*cantidad;
			}else if(cantidad<=99) {
				total=4.5*cantidad;
			}else if(cantidad>=100) {
				total=4*cantidad;
			}
				System.out.println("el cliente compro "+cantidad+ " panes y el valor a cancelar es= $"+total+" pesos");
		
			
			repetir=JOptionPane.showInputDialog("¿Desea ingresar nuevo valor?\n");
			
			if(repetir.equalsIgnoreCase("si")) {
				otravez=true;
			}else {
				otravez=false;
			}
		}
		while(otravez);
		
		System.out.println("gracias por su visita");
	}

}
