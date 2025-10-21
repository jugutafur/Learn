package ExampleAbstractArchitecture;

public class Triangulo extends FiguraGeometrica{

	@Override
	public double calcularArea(double... params) {
		return (params[0]*params[1])/2;
	}

	@Override
	public double calcularPerimetro(double... params) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String prueba(String mensaje) {
		return "Desde la clase Triangulo le entra = "+ mensaje;
	}

}
