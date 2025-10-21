package Principal;

public class Array_Ejemplo_arrrya_2D {

	public static void main (String [] argrs) {		
		double acumulado, interes=0.10;		
		double [][] saldo= new double[6][5];
		
		for(int i=0; i<6; i++) {
			//esto es debido a que la primera fila todos los valores son inicialmente 10.000 
			saldo[i][0]=10000;
			acumulado=10000;
		//	System.out.println();
			for(int j=1; j<5;j++) {
				acumulado=acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
		//		System.out.printf("%1.2f",saldo [i][j]);
		//		System.out.print(" ");
			}
			interes=interes+0.01;
		}

//LO PODEMOS VISUALIZAR DE MANERA APARTE CON ESTOS 2 BUCLES FOR O DE MANERA COMPLETA COMO ESTA ANTES
//LAS LINEAS QUE ESTAN COMENTADAS 
		
		for(int z=0; z<6; z++) {
			System.out.println();
			for(int h=0; h<5; h++) {
				System.out.printf("%1.2f",saldo [z][h]);
				System.out.print(" ");
			}
		}
	}
}
