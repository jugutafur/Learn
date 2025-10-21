package ExampleAbstractArchitecture;

public class Circulo extends FiguraGeometrica{

	@Override
	public double calcularArea(double... params) {
		return Math.PI*params[0]*params[0];
	}

	@Override
	public double calcularPerimetro(double... params) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String prueba(String mensaje) {
		return "Desde la clase Circulo le entra = "+ mensaje;
	}


}
