package Principal;

public class Arrays {
	
	public static void main (String args[]) {
		//O tambien es posible definir una matriz de la siguiente manera
		//Se pone [] para indicar que es un arreglo y los arreglos en java son tratados como objetos 
		//es por esto que se crea o se instancia el arreglo o array
		
		// int [] mi_matriz ={15,25,8,-7,92}
		
		//tipo de datos que lleva
		//nombre del arreglo
		//palabra reservada new
		//tipo de datos
		//el tamaño del arreglo

		int [] mi_matriz = new int[5]; 
		
		//defifinicion de valores de la matriz
		mi_matriz[0]= 57;
		mi_matriz[1]= 38;
		mi_matriz[2]= -15;
		mi_matriz[3]= 92;	
		mi_matriz[4]= 71;
		
		//Visualizacion de valores por consola
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		System.out.println(mi_matriz[0]+mi_matriz[1]+mi_matriz[2]+mi_matriz[3]+mi_matriz[4]);
	
		for(int i=0; i<mi_matriz.length; i++) {
			System.out.println("mi_matriz ["+i+ "] es = "+mi_matriz [i] );
		}	
	}
}
