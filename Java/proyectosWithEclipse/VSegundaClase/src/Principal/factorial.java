package Principal;
import javax.swing.*;// JOptionPane

public class factorial {

	public static void main(String[] args ) {
		
		
		
		
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
		
		
		
		
		
		
		
		
		
		int factorial=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero al cual desea determinar su factorial"));
		
		for(int i=(num-1); i>0; i--) {
			
			num= num*i;
			
			System.out.println("Elresultado es "+num);
		}
	}
}
