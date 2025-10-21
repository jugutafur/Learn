/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ExerciseString {
    
        public static void main(String[] args) {
            
        String animal = "Elefante";    
        StringBuilder stringBuilder = new StringBuilder(animal);
        
        System.out.println("valor 2 = " +animal.concat("azul")); //concat concatena pero no crea un nuevo string 
       
        stringBuilder.append(animal);
        System.out.println("valor de stringBuilder = " +stringBuilder);
        System.out.println("valor de animal substring = " + animal.substring(0, 4));
        
        System.out.println("El resultado es 1 = "+ animal);
        System.out.println("El resultado es 2 = "+ animal.substring(1));
        
    }
        
    
}
