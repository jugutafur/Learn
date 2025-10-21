package poo;

public class Enumerados {
	
	//instanciamos talla de tipo enum talla es una variable de tipo enum 
	
	//ENUM permite la construccion de metodos GETTERS y SETTER o CONSTRUCTORES
	
	//Debe ser por fuera del metodo main
	
	enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE }
	
	public static void main(String []args) {
		
//se requiere crear una variable que contenga valores que no se puedan MODIFICAR NI ADICIONAR 
		
		//ENUMERADO es una variable objeto de tipo ENUM en la cual se puede almacenar un grupo de valores
		//y solo se puede almacenar ese grupo de valores y ningun otro
		
		//enum NO PUEDE ESTAR DECLARADO DENTRO DE LA CLASE PRINCIPAL DEBE ESTAR AFUERA YA SEA EN OTRA CLASE
		
		Talla s= Talla.MINI;
		Talla m= Talla.MEDIANO;
		Talla l= Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;
		
		//en este punto podriamos pedir por consola o por medio de JOptionPane que el usuario ingrese una talla
		//y por medio de un if evaluar que talla es si es mini, mediana grande o muy grande 
		//AHORA	vamos a crear ENUMERADOS2 para ver otra forma de ahacerlo.
	}
}
