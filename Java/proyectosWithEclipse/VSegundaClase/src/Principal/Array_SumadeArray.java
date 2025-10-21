package Principal;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Array_SumadeArray {
	
	public static void main(String [] args) throws IOException {
		System.out.println("This is a applicaction that allow sum elemets of array ");
		
		boolean repetir = false;
		int entrada2 = 0;
		Scanner entrada = new Scanner(System.in);
		short a,b,c;
		int automaticPromotion=0;
		int sizeArr = 0;
		
		a=5;
		b=4;
		//La siguiente linea de codigo da error esto es debido a que el compilador cambia el tipo de dato de short a int
		//y guardar un resultado de valor integer en una variable short da ERROR
		//c=a+b;
		//ES POR ELLO QUE SE DEBE HACER UNA CASTING DE LA SIGUIENTE MANERA
		c=(short)(a+b);
		
	//With this object you can read leer numeros por consola, la linea entera 
	//separada por espacios
		
		//In the constructor class BufferedReader wait a Reader
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//Now we have a element bufferedReader
		
		//BufferedWriter wait in its constructor a Writer
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\proyectosWithEclipse\\VEstudioEnserio\\src\\EntremientoJava\\BufferedWriterDocumet.txt"));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		bufferedWriter.write("Esto es una prueba usando Buffered,,,,,");
		bufferedWriter.write("Seguimos usando Buffered");
        //Guardamos los cambios del fichero
		bufferedWriter.flush();
		
		do {
		System.out.println("Please inside size of Array");
		//Now we can catch amount Cantidad of data inside by System.in
		
		sizeArr = Integer.parseInt(bufferedReader.readLine().trim());
		
		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		List<Integer> ar = new ArrayList<>();
		
		for(int i = 0; i <sizeArr; i++) {
			int arItem = Integer.parseInt(arTemp[i]);
			ar.add(arItem);
		}
		
		int result = Result.SimpleArraySum(ar);
		
		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();
		
		
		//bufferedWriter.close();
		
		System.out.println("Do you like repeat code \n1.Yes 2.No");
		entrada2 = Integer.parseInt(JOptionPane.showInputDialog("Do you like repeat code \\n1.Yes 2.No"));
		//System.out.println("Do you like repeat code \n1.Yes 2.No");
		//entrada2 = entrada.nextInt();
		if(entrada2 == 1) {
			repetir = true;
			sizeArr =0;
		}else {
			repetir = false;
			bufferedReader.close();
		}
		}while(repetir);

		System.out.println("Thanks a lot for used this app");
	}
}


class Result {
	
	public Result(){}
	
	public static int SimpleArraySum(List<Integer> ar) {
		int sizeArray = 0;
		int positive = 0;
		int negative = 0;
		
		//This is necessary to know size of array
		for(Integer e : ar) {
			sizeArray++;
			//System.out.println("lo que tiene tamanio = "+e);
		}

		int newArray[] = new int[sizeArray];
		//otra forma de declarar e inicializar un array
		int[] miArray = new int[] {3, 1, 4};
		sizeArray = 0;
		for(Integer e : ar) {
			newArray[sizeArray] = e;
			sizeArray++;
			System.out.println("lo que tiene ar = "+e);
		}
		
		for(int i=0; i<sizeArray; i++ ) {
			System.out.println("The position " + i + " have a value = " + newArray[i]);
			
			if(newArray[i]> 0) {
				positive = positive+newArray[i];
			}else {
				negative = negative+newArray[i];
			}
		}
		
		System.out.println("the value positive = "+positive);
		System.out.println("the value negative = "+negative);		
		
		return 0 ;
	}
}