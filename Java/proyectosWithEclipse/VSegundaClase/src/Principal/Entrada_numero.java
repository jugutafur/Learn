package Principal;
import javax.swing.*;//para usar JOptionPane

public class Entrada_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=10000.0;
		
		//printf imprime con format tiene 2 argumentos = el formato que le tiene que aplicar al valor numero y el valor numero 
		// en este caso es darle 2 decimales al resultado del segundo argumento
		
		System.out.printf("%1.2f",x/3);
		
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		
		//como el valor almacenado en JOptionPane es un String debemos emplear Double.parseDouble
		
		double num2=Double.parseDouble(num1);
		
		System.out.print(" la raiz de "+ num2 + " es ");
		
		System.out.printf("%1.4f", Math.sqrt(num2));

	}

}
