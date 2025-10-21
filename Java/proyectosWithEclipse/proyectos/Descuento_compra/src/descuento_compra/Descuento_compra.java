package descuento_compra;

import javax.swing.JOptionPane;

public class Descuento_compra {

    public static void main(String[] args) {
        System.out.println("Programa para determinar el precio a pagar por compras superiores a 300");
        
        int compra, total, descuento=0;
        
        compra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la compra realizada"));
        
        if(compra >300){
            
            descuento= (compra*20)/100;
            total=compra-descuento;
            JOptionPane.showMessageDialog(null,"El valor a pagar es "+ total);
            
        }else{
            JOptionPane.showMessageDialog(null,"No aplica descuento\n\nEl valor a pagar es "+ compra);                        
        }
    }
    
}
