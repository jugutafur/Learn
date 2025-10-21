package EntremientoJava;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalDifference {

	public static void main(String [] args) throws IOException{
		
		
		int size;
		List<List<Integer>> majorArray = new ArrayList<>();
		String[] lines;
		int posicion=0;
		
		//pasar de Array a list
		String[] num = {"Uno", "Dos", "Tres"};
		List<String> listaNumArray = Arrays.asList(num);
		
		String[] names = {"Juan", "Carlos", "Miguel"};
		List<String> listaNameArray = new ArrayList(Arrays.asList(num));
		
		DiagonalDifference prueba = new DiagonalDifference();
		prueba.diagonalDifference(majorArray);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\VEstudioEnserio\\src\\EntremientoJava\\DiagonalDifference.txt"));
		System.out.println("With this app you can find difference between "
				+ "diaginal a array Dimensional");
		
		System.out.println("Please insert size to Array");
		size = Integer.parseInt(bufferedReader.readLine().trim());
		
		System.out.println("Please insert Lines to Array");
		lines = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		for(int i=0; i<size; i++) {
			List<Integer> lineArray = new ArrayList<>();
			for(int j=0; j<size; j++) {
			int item = Integer.parseInt(lines[posicion]);
			lineArray.add(item);
			posicion++;
			}
			majorArray.add(lineArray);
		}
		
		int result = DiagonalDifference.diagonalDifference(majorArray);
	
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();
	}
	
	public static int diagonalDifference(List<List<Integer>> listArrayMatriz) {
		int result =0;
		int size=0;
		
		for(List<Integer> e:listArrayMatriz) {
			System.out.println("The Items = "+e);
			size++;
		}
		
		int[] lines = new int[size];
		System.out.println("The size to Items = "+size);
		
		int position=0;
		int diagonalIzq=0;
		int diagonalDer=0;
		int acumuladorIzq=0;
		int acumuladorDer=size-1;

		int[] ArrayLineaMock = new int[size];
		List<Integer> listLineMock = new ArrayList<>();
		
		for(List<Integer> e:listArrayMatriz) {
			System.out.println("valor de e = "+e);
			listLineMock = e;
			for(int ee :listLineMock) {
				System.out.println("valor de ee = "+ee);
				ArrayLineaMock[position]= ee;
				position++;
			}
			//1ra Diagonal
			diagonalIzq+= ArrayLineaMock[acumuladorIzq];
			System.out.println("valor de diagonalIzq = "+diagonalIzq);
			acumuladorIzq++;
			
			//2ra Diagonal
			diagonalDer+= ArrayLineaMock[acumuladorDer];
			System.out.println("valor de diagonalDer = "+diagonalDer);
			acumuladorDer--;
			
			position=0;
		}
		
		result = diagonalIzq - diagonalDer;
		result = Math.abs(result);
		System.out.println("This is result = "+ result);
		
		return result;
	}
}
