package ExampleAbstractArchitecture;

public abstract class FiguraGeometrica {
	
	//Con tan solo tener una sola clase abstracta esta clase se debe declarar abstract 
	//Se puede tener una clase Abstract sin metodos abstract PERO NO TIENE SENTIDO 
	
	public abstract double calcularArea(double... params); //parametros infinitos (VARARGS)
	public abstract double calcularPerimetro(double...params);
	public abstract String prueba(String mensaje);

}
