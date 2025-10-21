package Principal;

public class manipula_cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//clase string
		
		String frase=" hoy es un dia estupendo para aprender a programar en Java";
		
		int ultima_letra=frase.length();
		
		//String frase_resumen=frase.substring(3, frase.charAt(ultima_letra-1));
		
		//La siguiente linea de codigo es para concatenar mas caracteres al objeto subString
		
		String frase_resumen=frase.substring(3, 12)+ " irnos a la playa";
		
		System.out.println(" resumen "+frase+" y tiene "+ultima_letra+" letras" );
		
		System.out.println("la frase resumen es: "+frase_resumen);
		
		

	}

}
