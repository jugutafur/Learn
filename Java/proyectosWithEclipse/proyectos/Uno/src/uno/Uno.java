package uno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Uno {

    public static void main(String[] args) {

        int tamaño,i,var,var2,posicion,contador=0;
        boolean bandera=false;
        
        System.out.println("Programa para crear un arreglo y luego moverlo x posiciones");
        
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        Scanner entrada=new Scanner(System.in);
        
        int matrixA[]= new int[tamaño];
        
        System.out.println("Ingrese la cantidad de posiciones que desea mover los elementos");
        var2=entrada.nextInt();
        
           
        
        
        for(i=0; i<tamaño; i++){
            
            System.out.print("Ingrese el valor de la psocion "+i+ " de la matrix A ");
            var=entrada.nextInt();
            posicion=i+var2;  //var2=3
            
            if(bandera){
                posicion=0;
                contador++;//1
                posicion=contador;
            }
            
            
            if(posicion==tamaño){
                posicion=0;
                bandera=true;
            }
            matrixA[posicion]=var;
            
           // System.out.println("en la posicion "+posicion+" = "+var );
        }
        

        
        for(int e:matrixA){
            
            System.out.println("Matrix A "+e);
        }
    }
    
}
