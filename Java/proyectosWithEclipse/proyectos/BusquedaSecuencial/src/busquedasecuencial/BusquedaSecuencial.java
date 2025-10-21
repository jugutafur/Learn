
package busquedasecuencial;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        System.out.println("Programa que recorre un arreglo y busca un elemento en especial");
        
        int tamaño,i,var,dato;
        String prueba="";
        boolean band=false;
        
        prueba+="casa";
        
        System.out.println("Esto es una prueba de String = "+prueba);
        
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo\n"));
        
        int Arreglo1[] =new int[tamaño];
        
        for(i=0; i<tamaño; i++){
            
            var=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion "+i));
            Arreglo1[i]=var;
        }
            for(int e: Arreglo1){
                System.out.println(" "+e);
            }
            
        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea buscar"));
        
        i=0;
        while(i<tamaño && band==false){
            if(Arreglo1[i]==dato){
                band=true;
            }
            i++;
        }
        
        if(band==false){
            JOptionPane.showMessageDialog(null,"El caracter ingresado NO esta dentro del Arreglo");
        }else{
            JOptionPane.showMessageDialog(null,"El caracter ingresado SI esta dentro del Arreglo en la psoicion "+(i-1));
        }
    }
    
}
