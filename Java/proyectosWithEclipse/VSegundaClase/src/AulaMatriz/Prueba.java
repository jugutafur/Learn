package AulaMatriz;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Esta el valor = "+Prueba.ArrContaint("Colombia","bi")+"?");
	}
	
	static boolean ArrContaint(String sourceStr, String SearchStr) {
		//Si el Array sourceStr entre sus datos SearchStr devuelva true sino false
		return sourceStr.contains(SearchStr);
	}

}
