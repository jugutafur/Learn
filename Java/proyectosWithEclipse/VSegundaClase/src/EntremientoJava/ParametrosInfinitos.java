package EntremientoJava;

import java.util.Arrays;

public class ParametrosInfinitos {
	
	public static void main(String[] args) {
		int result = Operaciones.sumDosValores(2, 8);
		//System.out.println("resultado = " + result );
		
		//int result2 = ParametrosInfinitos.sumDosValores2(2, 1,3);
		System.out.println("el resultado de la operacion " + sumDosValoresStream(2,5,5,2));
		
		ParametrosInfinitos parametrosInfinitos = new ParametrosInfinitos();
		
		int result3 = parametrosInfinitos.sumDosValores3(2, 1);
		//System.out.println("resultado3 = " + result3 );
		
	}
	
	public static int sumDosValores2 (int... valor) {
		int result = 0;
		for (int i = 0; i < valor.length; i++) {
			result += valor[i];
		}
		return result ;
	}
	
	public static int sumDosValoresStream (int... valor) {
		int result = Arrays.stream(valor).sum();
		
		return result ;
	}
	
	public int sumDosValores3 ( int valor11, int valor22) {
		return  valor11 + valor22;
	}

}

class Operaciones{
	
	private	 static double PoI =3.14;
	
	public double metodoX () {
		return PoI;
	}
	
	public static int sumDosValores ( int valor11, int valor22) {
		return  valor11 + valor22;
	}
}
