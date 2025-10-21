package Principal;
import javax.swing.*;// JOptionPane

public class ArraysII {

	public static void main(String [] args ){
		
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
		
		
		
		
		
		
		
		//String [] paises = {"España", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		int contador=0;
		
		String [] paises=new String[8];
		
		paises[0]="España   ";
		paises[1]="Mexico	";
		paises[2]="Colombia	";
		paises[3]="Peru     ";
		paises[4]="Chile	";
		paises[5]="Argentina";
		paises[6]="Ecuador	";
		paises[7]="Venezuela";
		
		//Con este buclefor podemos recorrer la matriz 
		
		for(int i=0; i<paises.length; i++ ) {
			
			System.out.println("paises dentro de la matriz son "+ paises[i]+ " en el indice "+i);
	
		}
		
		//PERO CON ESTE BUCLE MEJORADO PODEMOS RECORRERLA DE UNA MANERAMAS SENCILLA
		
		for(String elemento:paises) {
			
			System.out.println("pais: "+elemento);
			
		}
		
		//ahorra vamos a rellenar una matriz desde la ventana de JOptionPane
		
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de valores que desea para la matriz PAISES2\n\n" ));
		
		String [] paises2 = new String[cantidad];
		
		for( int j=0; j<cantidad; j++) {
			
			String entrada= JOptionPane.showInputDialog("Ingrese el pais del item "+j);
			
			paises2[j]= entrada;
		}
		
		//Ahora vamos a visualizar los valores de la matriz paises2
		
		//1.String el tipo de datos que forman la matriz
		//2.asignamosun nombre cualquiera 
		//3.seguido del nombre de la matriz que deseamos visualizar
		//como es una matriz con String debemos indicar que es String
		
		for(String elemento:paises2) {
			
			System.out.println("paises2: "+elemento);
		}
		
		//Ahora vamos a crear una matriz con numeros aleatorios
		
		cantidad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de valores aleatorios que sea para la matriz_ale \n\n"));
		
		int [] matriz_ale =new int[cantidad];
		
		for(int z=0; z<cantidad; z++ ) {
			
			matriz_ale[z]= (int)(Math.random()*100);
		}
		
		//Ahora vamos a visualizar con for each
		
		//int elemento es una variable que podemos llamar de cualquier manera
		//seguido del nombre de la matriz que deseamos visualizar
		//como es una matriz con numeros debemos indicar que es INT
		for(int elemento:matriz_ale) {
			
			contador++;
			
			System.out.println("Aleatorio "+contador+" = "+ elemento);
		}
	}
	
}
