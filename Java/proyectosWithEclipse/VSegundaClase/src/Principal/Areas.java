package Principal;
import java.util.*;		//para trabajar Scanner
import javax.swing.*;	//para trabajar JoptionPane

public class Areas {
	
	public static void main (String args[]){
		
		int numero;
		double decimal;
		char letra;
		String cadena;
		float flotante;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero Double"));
		flotante=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dato de tipo float"));
		cadena=JOptionPane.showInputDialog("Ingrese la cedena de String");
		letra=JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Este es para sacar datos");
		
		double base, altura, rectangulo;
		int regresar=0, radio, menu=1;
		
		//programa para mostrar areas de diferentes figuras
		
		while(menu==1){
		
		String seleccion=JOptionPane.showInputDialog("seleccione el Area que desea determinar \n\n1. Cuadrado"
				+ "\n2. Rectangulo \n3. Triangulo \n4. Circulo \n\n" );
		
		int seleccion2=Integer.parseInt(seleccion);
		
		switch(seleccion2) {
		
		case 1:
		
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Selecciono Cuadrado \n\nIngrese el valor del "
					+ "lado \n\n"));
			regresar=Integer.parseInt(JOptionPane.showInputDialog("el lador del Cuadrado es "+Math.pow(lado, 2)+" \n\n¿Desea regresar al "
					+ "menu principal? \n\n1.Si \n2.No\n\n"));
			
			if(regresar==1){
				
				menu=1;
			break;	
			}
			
			else if(regresar==2) {
				menu=2;
			}
			
		
		break;
		
		case 2:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Selecciono Rectangulo \n\nIngrese el valor de la base\n\n"));
			altura=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el valor de la altura\n "));
			
			rectangulo=base*altura;
			
			regresar=Integer.parseInt(JOptionPane.showInputDialog("El valor del area del Rectangulo es " +rectangulo+"\n\n¿Desea"
					+"regresar al menu principal?\n\n1.Si \n2.No\n\n"));
			
			if(regresar==1){
				
				menu=1;
			break;	
			}
			
			else if(regresar==2) {
				menu=2;
			}
					
			
		break;
		
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Selecciono Triangulo \n\nIngrese el valor de la base\n\n"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura\n\n"));
			
			double Triangulo=(base* altura)/2;
			
			regresar=Integer.parseInt(JOptionPane.showInputDialog("El valor del area del triangulo es "+Triangulo+ "\n\n ¿Desea"
					+ "regresar al menu principal?\n\n1.Si\n2.No\n\n"));
			
			if(regresar==1){
				
				menu=1;
			break;	
			}
			
			else if(regresar==2) {
				menu=2;
			}
		break;
		
		case 4:
			
			radio=Integer.parseInt(JOptionPane.showInputDialog("Selecciono Circulo\n\nIngrese el valor del radio\n\n"));
			
			regresar=Integer.parseInt(JOptionPane.showInputDialog("El valor del Circulo es "+ Math.PI*Math.pow(radio, 2)+" \n\n"
					+ "¿Desea regresar al menu principal?\n\n1.Si\n2.No\n\n"));
			
			if(regresar==1){
				
				menu=1;
			break;	
			}
			
			else if(regresar==2) {
				menu=2;
			}
			
		
		break;
		
		default:
		
			System.out.println("Opcion invalida");
		break;
		
		}
	}}

}
