import java.util.*;

public class Entada {
	
	
	public static void main(String[] args){

		Scanner entrada=new Scanner (System.in);
		
		System.out.println("ingresa tu nombre");
		
		String nombre_usuario= entrada.nextLine();
		
		System.out.println("ingresa edad");
		
		int edad=entrada.nextInt();
		
		System.out.print("hola "+nombre_usuario+ " el proximo año tendras "+(edad+1)+"años");
		
	}

}
