package pildorasInformaticas.JSP;

import java.text.DecimalFormat;

public class Calculos {
	
	private static int resultado;
	public String edad="";
	
	public static int metodoAdd(int num1, int num2, int num3){
		resultado = num1 + num2 + num3;
		return resultado;
	}
	
	public static int metodoRest(int num1, int num2, int num3){
		resultado = num1 - num2 - num3;
		return resultado;
	}
	
	public static int metodoMultiplication(int num1, int num2, int num3){
		resultado = num1 * num2 * num3;
		return resultado;
	}
	
	
	
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public static void main(String[] args) {
		
		String prueba;
		int prueba2 = 56;
		
		System.out.println("prueba para String format");
		
		Calculos calculos1= new Calculos();
		
		calculos1.setEdad("45");
		
		prueba = calculos1.getEdad();
		
		String ProductMultiplierFactor = null;
		/*
		double newProductMultiplierFactor = Double.parseDouble(ProductMultiplierFactor);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(String.format("%s", ProductMultiplierFactor.substring(0, 5)));
		System.out.println("Esta es su edad "+ prueba );
		
		System.out.println(String.format("* Esta es su edad con String Format = %.4f", newProductMultiplierFactor));
		System.out.println("Este es el valor de Decimal format = "+ df.format(newProductMultiplierFactor));
		*/
		String condicion = (ProductMultiplierFactor == null)?"vacia":"llena";
				
		//System.out.println(String.format("la variable viene = %s", condicion));		
		System.out.println(String.format("%.4s ", ProductMultiplierFactor));     
		
		
	}

}
