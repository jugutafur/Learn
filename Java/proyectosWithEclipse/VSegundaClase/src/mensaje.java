public class mensaje {
	
	public static void main(String[] args){
		
		System.out.print("mensaje de prueba");
		
		//objeto perteneciente a la clase String donde se almacena el nombre
		//instanciar, ejemplarificar CREAR OBJETO 
		
		String nombre= "juan guillermo";
		
		// cantidad de letras
		//									 objeto/clase.metodo
		System.out.println("tu nombre tiene "+nombre.length()+ "letras");
		
		System.out.println("la primera letra de mi nombre es "+ nombre.charAt(0));
		
		int ultima_letra=nombre.length();
		
		System.out.println("la ultima letra de tu nombre es "+ nombre.charAt(ultima_letra-1));
		
		// extraccion de texto
		
		String frase= nombre.substring(1,7);
		
		System.out.println("resumen de frase = "+frase);
		
		// comparacion de objetos importando mayusculas o minusculas
		
		String alumno1="carlos",alumno2="Carlos";
		
		//                 objeto.metodo(objeto)
		System.out.println(alumno1.equals(alumno2));
		
		//comparacion de objetos sin importar mayusculas o minusculas
		
		String alumno3="miguel", alumno4="Miguel";
		
		System.out.println(alumno3.equalsIgnoreCase(alumno4));
		
		
	}

}
