
public class clase_conMath {

	
	public static void main (String[] args){
		
		
	/*raiz, redondeo, potencia*/
		
	// tipo_de_constante nombre=refundicion  clase.metodo(parametros/argumentos);
		//clase predefinida
		
		double raiz=Math.sqrt(9);
		double num1=5.42;
		double base,exponente;
		
		base=3;
		exponente=4; 
		
		
		int resultado=(int)Math.round(num1);
		
		int resultado2=(int)Math.pow(base,exponente);
		
		System.out.println("redondeo es "+resultado);
		
		System.out.println("la raiz del numero es " +raiz);
		
		System.out.print("la potencia de la base "+base+" y el exponente " +exponente+ " es igual " +resultado2);
	}
}
