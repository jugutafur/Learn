package Principal;

import javax.swing.JOptionPane;


public class Arreglo_Inv {
	
	public static void main(String[] args) {
		
		System.out.println("Programa que pide varios valores por JOptionPane");
		
		
		int numero2;
		double decimal;
		char letra;
		String cadena;
		float flotante;
		
		numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero Double"));
		flotante=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el dato de tipo float"));
		cadena=JOptionPane.showInputDialog("Ingrese la cedena de String");
		letra=JOptionPane.showInputDialog("Ingrese el caracter").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Este es para sacar datos");
		
		
		int cantidad;
		int var;
		int i;
		int k;
		Integer numero=null;
		String palabra=null;
		//Date fecha =null;
		char caracter='a';
		//caracteres.charAt(1 );
		
		
		cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantos numeros desea almacenar"));
		
		int matriz[] =new int [cantidad];
		
		for(i=0; i<matriz.length; i++) {
			var=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # "+(i+1)));
			matriz[i]=var;
		}
		
		for(int e : matriz) {
			System.out.println("matriz "+e);
		}
		
		System.out.println(".");
		
		for(i=(matriz.length-1); i>=0; i--) {
			System.out.println("matrix "+matriz[i]);
		}
		
	///tambien es posible recorrer una matriz con un while	
		
		k=(matriz.length)-1;
		System.out.println("esta es la cantidad de items "+k);
		while(k>=0) {
			System.out.println("matrix "+matriz[k]);
			k--;
		}

	//impresion intercalada
		
		System.out.println("Ahora vamos a imprimir de otra manera");
		for(i=0; i<matriz.length; i++) {
			System.out.println("Posicion "+ i +" valor = "+matriz[i]);	
		}	
	}
}
