/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class PruebaIncrementoDecremento {
    
    public static void main(String[] args) {
        System.out.println("Prueba de operador Incremento y Decremento");
        
        int i, j, k;
        
        i=5;
        j= ++i; //Altera las 2 
        k= j++; //Asigna y luego Altera 
        
        System.out.println("El valor de i = " +i); // 6
        System.out.println("El valor de j = " +j); // 7
        System.out.println("El valor de k = " +k); // 6
    }
    
}
