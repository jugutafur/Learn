package Principal;
import javax.swing.JOptionPane;

public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		int numero;
		double decimal;
		char letra;
		String cadena;
		float flotante;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cadena de numero"));
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero Double"));
		flotante=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dato de tipo float"));
		cadena=JOptionPane.showInputDialog("Ingrese la cedena de String");
		letra=JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Este es para sacar datos");;
		
		
		*/
		
		
		
		
		
		// uso del metodo Math.sqrt
		
		double raiz=Math.sqrt(64);
		
		System.out.println("la raiz de 9 es "+raiz);
		
		//Uso de metodo Math.round
		
		float num1=5.83F;
		
		int resultado=Math.round(num1);
		
		System.out.println("redondear num1 es "+ resultado);
		
		// Uso de refundicion
		
		double num2=5.38;
		
		//en este caso Math.round devuelve un dato de tipo LONG y no INT por eso es necesario la refundicion
		//int resultado2=Math.round(num2);
		
		int resultado2=(int)Math.round(num2);
		
		System.out.println("redondear num2 es "+resultado2);
		
		//uso del metodo Math.pow
		
		double base=5;
		double exponente=3;
		
		int resultado3=(int)Math.pow(base, exponente);
		
		System.out.println("La potencia de "+base+ " elevado a " +exponente+ " es"+resultado3);
		
		
		int num=(int)Math.floor(5);
		
		System.out.println("numero florr"+num);

	}

}
