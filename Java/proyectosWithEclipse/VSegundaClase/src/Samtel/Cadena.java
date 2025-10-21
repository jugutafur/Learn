package Samtel;

import javax.swing.*;

public class Cadena {

	 public static void main(String[] args) {
		String cadena = "";
		String modificada= "";
		int actividad = 0;
		int regresar1 =0;
		boolean regresar = false;
		
		cadena = JOptionPane.showInputDialog("Este programa le permitira trabajar con una cadena \n\n"
				+ "favor ingrese la cadena ");
		do {
		actividad = Integer.parseInt(JOptionPane.showInputDialog("Por favor Seleccione la actividad"
				+ " que desea realizar\n\n"
				+ "1. Pasar la cadena a minusculas \n\n"
				+ "2. Pasar la cadena a mayusculas \n\n"
				+ "3. Los 2 primeros caracteres \n\n"
				+ "4. Los 2 ultimos caracteres \n\n"
				+ "5. Numero de ocurrencias del ultimo caracter \n\n"
				+ "6. Cadena con 3 asteriscos al inicio y al final \n\n"
				+ "7. Cadena Invertida"));
		System.out.println("El valor ingresado es = "+ cadena);
		System.out.println("El valor ingresado es = "+ actividad);
		
		switch(actividad) {
		case 1:
			modificada=cadena.toLowerCase();
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("1. Pasar la cadena a minusculas \n\n"
					+ "Original= "+ cadena + "\n\nModificacion= "+ modificada +" \n\n ¿Desea realizar otra actividad?\n\n"
					+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);			
			break;
			
		case 2:
			modificada=cadena.toUpperCase();
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("2. Pasar la cadena a mayusculas \n\n"
					+ "Original= "+ cadena + "\n\nModificacion= "+ modificada +" \n\n ¿Desea realizar otra actividad?\n\n"
					+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			break;
			
		case 3:
			modificada=cadena.substring(0,2);
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("3. Los 2 primeros caracteres \n\n"
					+ "Original= "+ cadena + "\n\nModificacion= "+ modificada +" \n\n ¿Desea realizar otra actividad?\n\n"
					+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);
			break;
			
		case 4:
			int cantidad = cadena.length();
			modificada=cadena.substring(cantidad-2,cantidad);
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("4. Los 2 ultimos caracteres \n\n"
			+ "Original= "+ cadena + "\n\nModificacion= "+ modificada +"\n\n ¿Desea realizar otra actividad?\n\n"
			+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);
			break;
			
		case 5:
			int count=0;
			cantidad = cadena.length();
			char ultimoCaracter = cadena.charAt(cantidad-1);
			modificada = ""+ ultimoCaracter;
			
			for(int i=0; i<cantidad; i++) {
				if(cadena.charAt(i) == ultimoCaracter) {
					count++;
				}	
			}
			
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("5. Numero de ocurrencias del ultimo caracter \n\n"
			+ "Original= "+ cadena + "\n\nModificacion= "+ count +" \n\n ¿Desea realizar otra actividad?\n\n"
			+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);
			break;
			
		case 6:
			modificada="***"+ cadena +"***";
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("6. Cadena con 3 asteriscos al inicio y al final \n\n"
			+ "Original= "+ cadena + "\n\nModificacion= "+ modificada +"\n\n ¿Desea realizar otra actividad?\n\n"
			+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);
			break;
			
		case 7:
			StringBuilder invertString = new StringBuilder(cadena);
			modificada = invertString.reverse().toString();
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("7. Cadena Invertida \n\n"
			+ "Original= "+ cadena + "\n\nModificacion ="+ modificada +"\n\n ¿Desea realizar otra actividad?\n\n"
			+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);
			break;
			
		default:
			regresar1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccion invalida \n\n"
			+ "¿Desea realizar otra actividad?\n\n"
			+ "1. Si o 2.No"));
			
			regresar=(regresar1==1)?true:false;
			//regresar=(regresar1==1);
		}
			
		}while(regresar);
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion");
		
	 }
}
