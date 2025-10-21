package Principal;
import java.util.Scanner;

public class Par_o_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Programa para mostrar operacioneiiismm");
		
		int a=20, b=10, c=0;
		int num;
		int suma =a+b;
		int resta=a-b;
		int multiplicacion= a*b;
		//double division=(double)a/b;
		//int resto=a%b;
//-----------------------------------------------------------------------
		//SACAR CARACTERES DEL CODIGO ASCCI
		
		Scanner entrada=new Scanner(System.in);
		num=entrada.nextInt();		
		char caracter=(char) num;  //se realiza un CASTING o REFUNDICION
		
		System.out.println("El numero ingresado= "+num+" es el caracter = "+caracter);
		
		num=entrada.nextInt();
		
		if(num%2==0) {
			System.out.println("El numero"+num+ " ingresado es par");
		}else {
			System.out.println("El numero "+num+" ingresado es impar");
		}
	}
}