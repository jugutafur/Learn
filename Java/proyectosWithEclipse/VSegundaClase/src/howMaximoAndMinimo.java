
public class howMaximoAndMinimo {
	
	public static void main(String args[]) {
		System.out.println("With this App you can determinate how is the Mayor and menor of Array");
		
		int[] enteros= {4, 9, -9, 0, 76, -2};
		
		int otroEntero[] = {5, 8,-2,0 };
		
		int maximo=0, minimo = enteros[0];
		
		for(int i=0; i<enteros.length-1; i++) {
			if(enteros[i]>maximo) maximo=enteros[i];
			if(enteros[i]<minimo) minimo=enteros[i];
		}
		System.out.println("The maximo value of array = "+maximo);
		System.out.println("The minimo value of array = "+minimo);
		
		System.out.println("This other way that you find maximo and minimo");
		
		minimo = maximo = enteros[0];
		for(int iterador : enteros) {
			if(iterador> maximo) maximo = iterador;
			if(iterador< minimo) minimo = iterador;
		}
		System.out.println("The maximo2 value of array = "+maximo);
		System.out.println("The minimo2 value of array = "+minimo);
	}

}
