package EntremientoJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.List;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AveryBigSum {
	public static void main(String [] args) throws IOException {
		
		int cantidad;
		String[] arTemp;
		List<Long> myListLong = new ArrayList<>();
		
		//pasar de Array a list
		String[] num = {"Uno", "Dos", "Tres"};
		List<String> listaNumArray = Arrays.asList(num);
		
		String[] names = {"Juan", "Carlos", "Miguel"};
		List<String> listaNameArray = new ArrayList(Arrays.asList(num));
		
		System.out.println("This app you can use to Sum big data");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\proyectosWithEclipse\\VEstudioEnserio\\src\\EntremientoJava\\AveryBigSum.txt"));
		
		System.out.println("Please insert size of number");
		cantidad = Integer.parseInt(bufferedReader.readLine().trim());
		
		System.out.println("Please insert chain of number separed by space that you like to sum");
		arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		for(int i=0; i<cantidad; i++) {
			Long arItem = Long.parseLong(arTemp[i]);
			myListLong.add(arItem);
		}
		
		Long result = AveryBigSum.aVeryBigSum(myListLong);
		
		System.out.println("the result Sum is = "+result);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();
	}
	
	public static Long aVeryBigSum(List<Long> myListLong) {
		Long result = 0L; 
		int position =0;
		int cantidad =0; 
		
		for(Long e :myListLong) {
			cantidad++;
		}
		
		Long[] myLongs = new Long[cantidad];
		
		//Pasar de List<Long> a Long[] 
		for(Long e :myListLong) {
			myLongs[position]= e;
			position++;
		}
		
		//Ya con esta linea de codigo no nos es necesario pasar de la List<Long> a Long[] ya que podemos 
		//con iterator realizar operaciones dentro de List<Long>
		Iterator<Long> iterator = myListLong.iterator();
		
		while(iterator.hasNext()) {
			
			Long verificar = iterator.next();
			//por si requerimos elimar un elemento de la List
			if(verificar == 5) {
				iterator.remove();
			}else {
				//Sumar
				result += verificar;
			}
		}
		/*
		for(Long e :myLongs) {
			result+=e;
		}*/
		
		return result;
	}

}
