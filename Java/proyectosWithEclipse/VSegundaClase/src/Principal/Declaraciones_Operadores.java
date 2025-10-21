package Principal;
import javax.swing.JOptionPane;

public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
		
		
		
		
		
		
		
		
		
		
		//declacion de constante
		
		final int a=5;
		int b;
		
		b=7;
		
		int c=b+a;
		c+=6;
		
		System.out.println();
		System.out.println("el valor de c es "+c);
		
		final double a_pulgadas=2.54;
		double cm=6;
		double resultado = cm/a_pulgadas;
		
		System.out.println("En "+cm+ "cm hay "+ resultado+ " pulgadas");
		
		int operador1=60,operador2=50, operador3=4, resultado2;
		
		resultado2= operador1+operador2+operador3;
		
		System.out.println(resultado2);
		

	}

}
