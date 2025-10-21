package AulaMatriz;

public class UsoLambdaAndPredicateWithInterface {

	public static void main(String[] args) {
		
		
		System.out.println("With this app we can show the same ussing una clase que implementa una interface");
		String[] StrList = {"tomorrow", "toto", "to", "timbukton", "hello", "heap"};
		//lo que se desea buscar
		String SearchStr = "to"; 
		
		System.out.println("Search for : "+SearchStr);
		
		//llamamos a la clase que implementa la Interfaz
		ContainsAnalizer containsAnalizer = new ContainsAnalizer();
		
		for(String currenStr :StrList) {
			if(containsAnalizer.ArrContaint(currenStr, SearchStr)) {				
				System.out.println("Match : " +currenStr);
			}
		}
		
		//Lo anterior se logra instanciando de un objeto donde la clase implementa la interfaz
		
		//ahora vamos a ralizar lo mismo PERO CON UNA 
		
		System.out.println("Ahora hacemos lo anterior pero por medio de una interfaz");
		UsoLambdaAndPredicateWithInterface.SearArray(StrList, SearchStr, containsAnalizer);
		//tambien lo podemos llamar sin necesidad de nombrar el nombre de la clase
		//SearArray(StrList, SearchStr, containsAnalizer);
		
		System.out.println("Es app lo podemos hacer de tres maneras diferentes");
		System.out.println("Ahora hacemos lo anterior pero por medio de una funcion Anonima");
		
		System.out.println("Con la funcion Anonima no necesitamos a una clase que implemente la interfaz sino "
				+ "que llamamos de manera directa la interfaz por medio de la clase anonima");
		
		UsoLambdaAndPredicateWithInterface.SearArray(StrList, SearchStr, new AnalizerStringInterface() {
			@Override
			public boolean ArrContaint(String sourceStr, String searchStr) {
				return sourceStr.contains(SearchStr);
			}
			
		});
		
		AnalizerStringInterface analizerStringInterface = (t,s) -> t.contains(s);
		
		System.out.println("Ahora vamos a implementar una EXPRESION LAMBDA");
		
		UsoLambdaAndPredicateWithInterface.SearArray(StrList, SearchStr, 
									//(String target, String search) -> target.contains(search)); //De manera larga
									//(t,s) -> t.contains(s)); 				//De manera corta
									analizerStringInterface); 			//de manera con un redicate
	}
	
	//(recibe una Array de String, un string que es el que se va a buscar, y una INTERFAZ)
	public static void SearArray(String[] StrList, String searchStr, AnalizerStringInterface analizerStringInterface) {
		for(String currenStr: StrList) {
			//llamamos a la interfaz.El unico metodo que tiene la intefaz y los argumentos que pide
			if(analizerStringInterface.ArrContaint(currenStr, searchStr)) {				
				System.out.println("Match :"+currenStr);
			}
		}
	}

}
