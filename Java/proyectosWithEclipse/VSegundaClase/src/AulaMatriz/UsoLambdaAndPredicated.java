package AulaMatriz;

public class UsoLambdaAndPredicated {
	public static void main(String [] args) {
		System.out.println("With this app you can show to used the predicated an lambda functions");
		
		String[] StrList = {"tomorrow", "toto", "to", "timbukton", "hello", "heap"};
		//lo que se desea buscar
		String SearchStr = "to"; 
		
		System.out.println("Search for : "+SearchStr);
		
		//creamos el objeto
		
		AnalizerString myAnlizerTool = new AnalizerString();
		
		for(String currenStr: StrList) {
			//(variableInteradora , to)
			if(myAnlizerTool.ArrContaint(currenStr, SearchStr)) {
				System.out.println("Match: " +currenStr);
			}
			
		}
	}

}
