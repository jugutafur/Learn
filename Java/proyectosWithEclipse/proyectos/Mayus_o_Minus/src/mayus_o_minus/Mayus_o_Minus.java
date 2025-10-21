package mayus_o_minus;

import javax.swing.JOptionPane;

public class Mayus_o_Minus {

    public static void main(String[] args) {
        System.out.println("Programa para determinar si el caracer ingresado en JOptionPane es mayuscula o minuscula");
        
        char letra;
        
        letra=JOptionPane.showInputDialog("Ingrese una letra ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            System.out.println("El caracert ingresado es Mayuscula");
            JOptionPane.showMessageDialog(null,"Mayuscula");
        }else{
            System.out.println("El caracter ingresado es Minuscula");
            JOptionPane.showMessageDialog(null,"Minuscula");
        }
    }
    
}
