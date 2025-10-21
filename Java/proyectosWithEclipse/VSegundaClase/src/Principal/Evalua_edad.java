package Principal;
import java.util.*;

import javax.swing.JOptionPane;

public class Evalua_edad {

	public static void main(String args[]) {
		
		
		
		int numero;
		double decimal;
		char letra;
		String cadena;
		float flotante;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cadena de String"));
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero Double"));
		flotante=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dato de tipo float"));
		cadena=JOptionPane.showInputDialog("Ingrese la cedena de String");
		letra=JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Este es para sacar datos");;
		
		
		
		
		
		
		//como vamos a tomar informacion de consola debemos crear un objeto conun metodo constructor
		//este siempre debe llevar la palabra reservada new y es System.in el archivo indicado donde 
		//se tomara la informacion 
		
		//se pasa como argumento System.in
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu edad, por favor");
		
		//En este caso el valor ingresado por consola lo almacenamos en edad_usuario como INT 
		
		int edad_usuario=entrada.nextInt();
		
		System.out.println("la edad ingresada es "+(edad_usuario+2));
		
		if(edad_usuario>0 && edad_usuario<100)
		{
		//else if(edad_usuario<40)
		if(edad_usuario>=18 && edad_usuario<=40) {
			
			System.out.println("eres Joven");
		}
		//else if(edad_usuario<60)
		else if(edad_usuario>=41 && edad_usuario<=60){
		
			System.out.println("eres maduro");
		}
		//else if(edad_usuario<61)
		else if(edad_usuario>=61) {
				
			System.out.println("debes cuidarte");
		}
		
		else {
			System.out.println("eres menor de edad");
		}
		}
		else {
			System.out.println("Ingrese una edad valida");
		}
	}
}
