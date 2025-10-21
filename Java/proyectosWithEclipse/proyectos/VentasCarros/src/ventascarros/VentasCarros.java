
package ventascarros;

import javax.swing.JOptionPane;

public class VentasCarros {

    public static void main(String[] args) {
        
        System.out.println("Programa que determina el salario de un vendedor de carros");
        
        int cantidad, salario=1000,comision, porcentaje_venta, venta, i;
        double incremento=0, salario_total;
        String nombre;
        
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del vendedor");
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de carros vendidos en el mes del vendedor "+nombre));
        comision= 150*cantidad;
        
        for(i=0; i<cantidad; i++){
            
            venta=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del "+(i+1)+ " carro vendido por el vendedor "+nombre));
            venta=venta*5/100;
            System.out.println("porcentaje de la venta "+i+" es = "+venta);
            incremento = incremento+venta;   
        }
        salario_total=salario+comision+incremento;
        
        System.out.println("El total a pagar a "+nombre+" es = "+salario_total);
    }
    
}
