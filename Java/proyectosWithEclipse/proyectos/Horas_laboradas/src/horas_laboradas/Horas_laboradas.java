
package horas_laboradas;

import javax.swing.JOptionPane;

public class Horas_laboradas {

    public static void main(String[] args) {
        System.out.println("Programa que determina semanas, dias y horas dependiendo de las horas ingresadas");
        
        int cantidad, semana, dias, horas;
        
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));
        
        semana=cantidad/168;
        dias=cantidad%168/24;
        horas=cantidad%24;
        
        System.out.println("La cantidad de Semanas es = "+semana);
        System.out.println("La cantidad de Dias es = "+dias);
        System.out.println("La cantidad de Horas es = "+horas);
    }
    
}
