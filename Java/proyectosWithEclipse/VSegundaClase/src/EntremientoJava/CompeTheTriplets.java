package EntremientoJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

public class CompeTheTriplets {
	
	public static void main (String [] args) throws IOException {
		
		int sizeArray = 0;
		int num1=5;
		int num2=6;
		int resultado=0;
	
		System.out.println("Funciona");
		
		//pasar de Array a list
		String[] num = {"Uno", "Dos", "Tres"};
		List<String> listaNumArray = Arrays.asList(num);
		
		String[] names = {"Juan", "Carlos", "Miguel"};
		List<String> listaNameArray = new ArrayList(Arrays.asList(num));
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\juanTafur\\jugutafur\\proyectosJava\\VEstudioEnserio\\src\\EntremientoJava\\CompeTheTriplets.txt"));
		
		System.out.println("Insert size of Array");
		
		sizeArray = Integer.parseInt(bufferedReader.readLine().trim());
		System.out.println("Please, Insert the "+ sizeArray+ " data of Array a");
		String[] arATemp = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");		
		List<Integer> a = new ArrayList<>();
		
		for(int i = 0; i<sizeArray; i++) {
			int aTemp = Integer.parseInt(arATemp[i]);
			a.add(aTemp);
		}
		
		System.out.println("Please, Insert the "+ sizeArray+ " data of Array b");
		String[] arBTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> b = new ArrayList<>();
		
		for(int i =0; i<sizeArray; i++) {
			int bTemp = Integer.parseInt(arBTemp[i]);
			b.add(bTemp);
		}
		
		//Estas llamando un metodo static que NOOOOO pertence a esta clase
		List<Integer> result = Solution.compareTriplets(a, b);
		
		bufferedReader.close();	
		
		//Estas llamado un metodo static dentro que pertenece a esta clase
		resultado= Sum(num1,num2);
		System.out.println("Este es el valor del metodo "+ resultado);
		
		//Igual estas llamando un metodo static que pertence a esta clase
		Prueba22();
		
		//Estas llamando una variable static que NOO pertence a esta clase
		System.out.println("Esto viene de afuera = "+ Solution.PRUEBA);
	}
	
	public static int Sum(int num1, int num2) {
		return (num1+num2);
	}
	
	public static void Prueba22() {
		System.out.println("Este es un msm de prueba desde un metodo fuera del main");
	}
}

class Solution{
	
	//ahora vamos hacer una prueba, tenenmos tres variables una constante otra static y otra normal
	//va en mayuscula por que es una constante
	public final static String PRUEBA = "variable static final";
	//una variable que puede cambiar
	public static String pruebaQueCambia = "varaible que cambia";
	
	public String pruebaNormal = "variable que es normal";
	
	
	//con lo anterior vamos a verificar si el siguiente metodo static puede acceder a las variables anteriores
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		//No puede modificar una constante
		//PRUEBA = "cambia";
		
		//SOLO PUEDE ACCEDER A LA VARAIBLE STATIC 
		System.out.println("msm1 = "+ pruebaQueCambia);
		pruebaQueCambia = "va a cambiar";
		System.out.println("msm2 = "+ pruebaQueCambia);
		
		//No puede acceder a las varaibles normales 
		//pruebaNormal = "de normal pasa a cambiar";
		
		int sizeArray = 0;
		int ArrayUno = 0;
		int ArrayDos = 0;
		List<Integer> c = new ArrayList<Integer>();
		
		//to know size of Array
		for(Integer e: a) {
			sizeArray++;
		}
		
		int[] miArrayA = new int[sizeArray];
		int[] miArrayB = new int[sizeArray];
		int[] miArrayC = new int[sizeArray];
		
		//This for to show content of List a and b
		int position = 0;
		for(Integer e: a) {
			int contentOfA = e;
			miArrayA[position] = e;
			position++;
			System.out.println("The position = "+ position + "List<Integer>a hava a value = "+ contentOfA);
		}
		
		position = 0;
		for(Integer e: b) {
			int contentOfb = e;
			miArrayB[position] = e;
			position++;
			System.out.println("The position = "+ position + "List<Integer>b hava a value = "+ contentOfb);
		}

		//Now we go to Sum the each position of Arrays
		
		for(int i=0; i<sizeArray; i++) {
			if(miArrayA[i] > miArrayB[i]) {
				ArrayUno++;
			}else if(miArrayA[i] < miArrayB[i]){
				ArrayDos++;
			}
		}
		
		System.out.println("the value of Array One = " +ArrayUno);
		System.out.println("the value of Array Dos = " +ArrayDos);
		
		List<Integer> result = new ArrayList<>();
		
		result.add(ArrayUno);
		result.add(ArrayDos);
		
		return result;
    }
}



