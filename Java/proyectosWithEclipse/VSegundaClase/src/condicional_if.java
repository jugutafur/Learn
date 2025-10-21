import java.util.*;

public class condicional_if {
	
	public static void main(String[] args){
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("ingresa tu edad ");
		
		int edad=entrada.nextInt();		
		
		if(edad<18){	
			System.out.print("eres un niño");
		}
		
		else if(edad<40){
			System.out.print("muy joven");
		}
		
		else if(edad<60){
			System.out.print("eres maduro");
		}
		
		else{
			System.out.print("adios");
		}
			
	}

}
