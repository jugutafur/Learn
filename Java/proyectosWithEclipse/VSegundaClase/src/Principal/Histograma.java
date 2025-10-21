package Principal;
import java.util.HashMap;
import java.util.Random;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Collections;

public class Histograma {

	public static void main(String[] args) {
	    Random generator = new Random();
	    //genera números aleatorios entre 0 y 20
	    int[] nums = new int[generator.nextInt(20)];
	    int[] myArray = {1,2,1,3,3,1,2,1,5,1};
	    
	    for(int i=0; i< nums.length; i++){
	    //números aleatorios entre 0 y 10
	            nums[i] = generator.nextInt(10);
	    }
	    
	    //creamos una tabla que guarde el número y su cantidad de ocurrencias
        //no se pueden usar tipos primitivos en este tipo de estructuras
        HashMap<Integer, Integer> tabla = new HashMap<Integer, Integer>();
        
        System.out.printf("Números generados: \n %s\n", Arrays.toString(nums));
        System.out.println("Numeros de my Array = "+Arrays.toString(myArray));

        for(int num: nums){
            Integer index = new Integer(num);
            if(!tabla.containsKey(index))
                tabla.put(index, new Integer(1));
            else
                tabla.put(index, tabla.get(index)+1);
        }

        for(Entry<Integer, Integer> fila: tabla.entrySet()){
            System.out.printf("%s: %s\n",fila.getKey(), repeat("*", fila.getValue().intValue()));    
        } 
	}

	private static String repeat(String what, int howMany){
		StringBuilder buf = new StringBuilder();
		for(int i=0; i<howMany; i++){
			buf.append(what);
		}
		return buf.toString();
	}
}

