package Principal;
import java.util.*;
public class Manipula_cadena3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Metodo equals es usado para comparar cadenas de caracteres
		
		String alumno1="david", alumno2="david";
		
		//Devuelve true si son iguales y false si son diferentes
		
		System.out.println(alumno1.equals(alumno2));
		
		//Metodo equalsIgnoreCase compara Ignorando mayusculas o minisculas 
		
		String alumno3="luis", alumno4="Luis";
		
		System.out.println(alumno3.equalsIgnoreCase(alumno4));
		
	}

}
