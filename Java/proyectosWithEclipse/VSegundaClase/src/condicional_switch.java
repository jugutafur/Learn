import java.util.*;

import javax.swing.*;

public class condicional_switch {

	public static void main(String [] args){
		
		final double pi=3.1416;
		
		System.out.println("programa para resolver areas de figuras");
		
		System.out.println("seleccionar que area desea resolver: ");
		
		System.out.println("1. Cuadrado \n2. Rectangulo \n3. Triangulo \n4. Circulo");
		
		Scanner entrada=new Scanner(System.in);

		int figura= entrada.nextInt();
		
		switch(figura){
		
		case 1://cuadrado
			System.out.print("escogio cuadrado \nIngrese valores:");
			String entrada2=JOptionPane.showInputDialog("Ingrese el valor de lado en cm");
			int lado1=Integer.parseInt(entrada2);
			System.out.println("lado "+lado1+ "cm");
			int cuadrado=lado1*lado1;
			System.out.print("Area del cuadrado es = "+cuadrado+ "cm\n¿Desea Seleccionar otra operacion??\n1.SI\n2.NO");
			
			break;
		
		case 2://rectangulo
			System.out.print("escogio rectangulo\nIngrese valores:");
			String base=JOptionPane.showInputDialog("Ingrese el valor de la base en cm");
			int base2= Integer.parseInt(base);
			String altura=JOptionPane.showInputDialog("Ingrese el valor de la altura en cm");
			int altura2=Integer.parseInt(altura);
			System.out.println("Base = "+base2+ "cm Altura "+altura2+ "cm");
			int resultado_Rec= base2*altura2;
			System.out.print("el area del Rectangulo es "+ resultado_Rec+ " cm\n¿Desea Seleccionar otra operacion??\n1.SI\n2.NO");
			break;
			
		case 3://triangulo
			System.out.println("escogio triangulo\nIngrese valores");
			String base3=JOptionPane.showInputDialog("Ingrese el valor de la base en cm");
			int base4= Integer.parseInt(base3);
			String altura3=JOptionPane.showInputDialog("Ingrese el valor de la altura en cm");
			int altura4=Integer.parseInt(altura3);
			System.out.println("Base = "+base4+ "cm Altura "+altura4+ "cm");
			int resultado_Trian= (base4*altura4)/2;
			System.out.print("el area del Rectangulo es "+ resultado_Trian+ " cm\n¿Desea Seleccionar otra operacion??\n1.SI\n2.NO");
			break;
			
		case 4://circulo
			System.out.println("escogio circulo\nIngrese valores");
			String radio=JOptionPane.showInputDialog("Ingrese el valor del radio en cm");
			int radio1= Integer.parseInt(radio);
			System.out.println("radio = "+radio1+ "cm ");
			double resultado_Circ= Math.PI*(Math.pow(radio1, 2));
			System.out.print("el area del Rectangulo es ");
			System.out.printf("%1.2f" ,resultado_Circ);
			System.out.print(" cm\n¿Desea Seleccionar otra operacion??\n1.SI\n2.NO");
			break;			
			
		default:
			System.out.print("no escogio ninguno ");
			
		
			
		
		}		
	}
}
