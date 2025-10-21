import java.util.*;
import javax.swing.*;

public class Adivina_Numero {
	
	public static void main(String[] args){				
		
		boolean regresar = true;
		Scanner entrada= new Scanner(System.in);
		
		while(regresar) {
			int aleatorio=(int)(Math.random()*100);
			int numero=0, intento=0;
			while (numero!=aleatorio){
				intento++;
				System.out.println("Intento # "+ intento +", introduce un numero");
				numero = entrada.nextInt();
				
				if(aleatorio<numero){	
					System.out.println("numero mas bajo");						
				}			
				else if(aleatorio>numero){
					System.out.println("numero mas alto");
				}		
			}			
			System.out.println("felicidades, lo lograste en el intento # "+ intento);
			
			System.out.println("Deseas volver a intentar? 1. SI 2. No");
			regresar = (entrada.nextInt()==1) ? true: false;
		}
		entrada.close();
		System.out.println("Gracias por usar el Software");
	}
}
