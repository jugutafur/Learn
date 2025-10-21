package ExampleAbstractArchitecture;

public class TestFiguraGeometrica {
	public static void main(String[] args) {
		System.out.println("App para determinar areas y perimetros de figuras geometricas ");
		
		FiguraGeometrica figuraGeometrica;
		
		figuraGeometrica = new Circulo();
		
		double resultado = figuraGeometrica.calcularArea(4);
		
		System.out.println("El resultado del area del Ciculo es = "+ resultado);
		
		//la accion del polimorfismo Usando la misma varaible de referencia
		//En este caso al usar la misma varaible sobre-escribimos su valor de refenrencia 
		//El Circulo creado anteriormente ya vive en la Memory heap y no va a dejar de existir
		//Ahora la varaible figuraGeometrica esta apuntado a otro objeto Triangulo 
		
		figuraGeometrica = new Triangulo();
		
		//Dicho lo anterior si yo vuelvo a declarar la siguiente linea
		figuraGeometrica = new Circulo();
		//Esto objeto seria un objeto totalmente diferente al primero es decir que no se puede usar el primer 
		//objeto Circulo ya que la direccion donde vive en la memory heap no esta guardado en ningun lugar
		
		//UNA VARAIBLE SOLO PUEDE REDIRECCIONAR UN OBJETO A LA VEZ NO DOS MAS AL MISMO TIEMPO 
		
		System.out.println("Mensaje desde main = " +figuraGeometrica.prueba("juan"));
	}

}
