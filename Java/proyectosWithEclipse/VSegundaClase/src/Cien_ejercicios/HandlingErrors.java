package Cien_ejercicios;

import java.util.Scanner;

public class HandlingErrors {
	
	public static void main(String [] args) {
		
		int select=0;
		int num1;
		int num2;
		int result=0;
		int repetir=0;
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("With ths app you can show Handling Error");
		System.out.println("Sum to numnbers");
		
		do {
			do {
				Scanner entrada2 = new Scanner(System.in);
				try {
					System.out.println("Please, select what do you want to do\n1.Sum 2.Div");
					select = entrada2.nextInt();
					repetir=1;
				}catch(Exception e) {
					System.out.println("Error to Select Operations = "+e);
					repetir=2;
				}
			}while(repetir==2);
		
		
		switch(select) {
		case 1:
			System.out.println("You Select is Sum");
			do {
				Scanner entrada = new Scanner(System.in);
				try {
					System.out.println("Please Insert num1");
					num1 = entrada.nextInt();
					System.out.println("Please Insert num2");
					num2 = entrada.nextInt();
					result=num1+num2;
					repetir=1;
				}catch(Exception e) {
					System.out.println("Se ha presentado un error = "+e);
					repetir=2;
				}
			}while(repetir==2);
			break;
		case 2:
			System.out.println("You Select is Div");
			do {
				Scanner entrada = new Scanner(System.in);
			try {
				System.out.println("Please Insert num1");
				num1 = entrada.nextInt();
				System.out.println("Please Insert num2");
				num2 = entrada.nextInt();
				result=num1/num2;
				repetir =1;
			}catch(Exception e) {
				System.out.println("Se ha presentado un error = "+e);
				repetir =2;
			}
			}while(repetir ==2);
			break;
		default:
			System.out.println("Wrong, Select invalid");
			break;
		}
		System.out.println("The result of operations = " + result);
		System.out.println("Do you like insert other operations? \n1.Yes 2.No");
		select = entrada1.nextInt();
		
		}while(select ==1);
		
		System.out.println("Thanks, for used this app");
		
	}

}
