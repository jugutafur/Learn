package Principal;
import javax.swing.JOptionPane;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Comentarios
		 */
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

		byte edad=50;
		
		// este es un metodo del objeto System "consola"
		System.out.println("mi edad es "+edad);
	}
}
