package Principal;
import java.util.*;// Scanner

public class Adivina_Numero {
	
	public static void main(String [] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		System.out.println("el numero generado es "+ aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0, intentos =0;
		
		//Con el bucle Do-While garantizamos que por al menos 1 vez el codigo se ejecuta por si 
		//de manera aleatorio da un 0 
		
			do{
			
			intentos++;
			
			System.out.println("programa que determina el mayor valor dentro dentro de un array ");
			
			int[] myArray = {65,2,4,35,1};
			int mayor =0;
			
			for(int i=0; i<myArray.length; i++){
				  if(myArray[i]> mayor) 
					  mayor = myArray[i];
				  }
			System.out.println("El numero mayor del array es "+ mayor);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("programa que grafica un histograma ");
			
			int[] myArray2 = {1,2,1,3,3,1,2,1,5,1};
			
			System.out.println("El histograma generado es = ");
			
			for(int e :myArray2) {
				System.out.println("valores = " +e);
			}
			
			int count=0 , numeroX =0;
		    int [] myArrayHist = new int [myArray2.length];


		    for (int i=0; i<myArray2.length; i++) {
		    	numeroX = myArray2[i];
		    	myArrayHist[numeroX]= count++;
		    }
		 
			for(int e :myArrayHist) {
				System.out.println("valores del histograma = " +e);
			}
			
			
			
			
			
			
			
			
			System.out.println("introduce un numero, por favor");
			
			//que el numero ingresa por consola sera almacenado a al variable numero
			
			numero= entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Mas bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("Mas alto");
			}
		}while(numero!=aleatorio);
		
		System.out.println("correcto numero de intentos = " +intentos);
	}
}
