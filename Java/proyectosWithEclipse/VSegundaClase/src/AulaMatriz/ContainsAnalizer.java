package AulaMatriz;

public class ContainsAnalizer implements AnalizerStringInterface{

	@Override
	public boolean ArrContaint(String sourceStr, String searchStr) {
		//Si el Array sourceStr entre sus datos SearchStr devuelva true sino false
		return sourceStr.contains(searchStr);
	}

}
