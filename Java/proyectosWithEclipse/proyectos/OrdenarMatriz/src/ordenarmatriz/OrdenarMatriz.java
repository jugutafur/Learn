package ordenarmatriz;

import java.util.Scanner;

public class OrdenarMatriz {

    public static void main(String[] args) {
        
        System.out.println("Programa que organiza los numeros ingresados por pantalla"
                + " y los ingresa en un matrix");
        
     int tamanio, i, var, adicional, tamanio2, tamanio3, j;   
             
    //------------------------------------------------------------------------------------
    // CARGAR
     
     System.out.print("Ingrese la cantidad de numeros que desea ingresar ");
     Scanner entrada=new Scanner(System.in);
     tamanio=entrada.nextInt();
     
     int ArrayA[] =new int[tamanio];
     
     for(i=0; i<tamanio; i++){
         
         System.out.print("Ingrese el numero # "+i+ " Matrix A ");
         var=entrada.nextInt();
         ArrayA[i]=var;         
     }
     
     System.out.print("Ingrese cuantos numeros desea Ingresar adicional ");
     var=entrada.nextInt();
     tamanio2=var;
    
     
      int ArrayB[]=new int[tamanio2];
    
     for(i=0; i<tamanio2; i++){
         
         System.out.print("Ingrese el numero # "+i+" Matrix B ");
         var=entrada.nextInt();
         ArrayB[i]=var;         
     }
     //----------------------------------------------------------------------
     // CREAR 3 MATRIX
    
     tamanio3 = tamanio + tamanio2;
     
     int ArrayC []=new int[tamanio3];
        
         for(i=0; i<tamanio; i++){
             ArrayC[i]=ArrayA[i];           
         }
         i=0;
         
         for(j=tamanio; j<tamanio3; i++){
             ArrayC[j]=ArrayB[i];  
              j++;
         }
         
 
            
     
     //-----------------------------------------------------------------------------------------
     // VISUALIZAR
      
     System.out.println("Array A");
     
     for(i=0; i<tamanio; i++){
         
         System.out.println("Array A posicion "+i+" = " + ArrayA[i]);
     }

      System.out.println("Array B");
     
     for(i=0; i<tamanio2; i++){
         
         System.out.println("Array B posicion "+i+" = " + ArrayB[i]);
     }
     
      System.out.println("Array C");
     
     for(i=0; i<tamanio3; i++){
         
         System.out.println("Array C posicion "+i+" = " + ArrayC[i]);
     } 
     
     for(int e:ArrayA)
         System.out.println("Array A "+e);
    }
    
}
