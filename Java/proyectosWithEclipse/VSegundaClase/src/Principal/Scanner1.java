package Principal;
import java.util.*;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esto es un CONSTRUCTOR
		//Se pasa como argumento System.in y es de hay de donde vamos a sacar la informacion
		//construir un objeto de tipo scanner que nos va a proporcinar un valor procedente del archivo especificado
		
		//nuestro programa declAra una variable de tipo objeto de tipo Scanner y que esta variable debe eser igual a lo 
		//que se introduzca en consola
		
		Scanner entrada=new Scanner(System.in);
		
		//todo constructor requiere la palabra reservada new
		
		System.out.println("introduce tu nombre, por favor");
		
		//la consola del sistema "entrada" se queda a la espera por un valor de tipo String y lo almacena en la variable objeto
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("introduce tu edad por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("hola "+ nombre_usuario+ " el año que viene tendras "+(edad+1)+ " años ");

	}

}
