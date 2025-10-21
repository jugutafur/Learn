package Cien_ejercicios;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class radiosNumeros {
	
	public static void main (String[] args) throws IOException {
		
		double [] ar = {4,5,7,3,20};
		System.out.println("Esta es un prueba");
		
		for(double e : ar) {
			System.out.println("Numero = "+ e);
		}
		
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }
		for(double e : arr) {
			System.out.println("Lo que trae fuera del for = " + e);
		}
        Solution.plusMinus(arr);
        bufferedReader.close();
	}
}

class Solution {
	
	public static void plusMinus(List<Integer> arr) {
		
		int count = 0;
		
		for(double e : arr) {
			count++;
			System.out.println("Lo que trae = " + e);
		}
		/*
		System.out.println("La cantidad de item de la lista = "+ count);
		for(int i=0; i<count; i++) {
			int y = arr[i];
		}*/
	}
	

}
