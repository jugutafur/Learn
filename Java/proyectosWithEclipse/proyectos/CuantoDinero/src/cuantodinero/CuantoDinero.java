
package cuantodinero;

import java.util.Scanner;

public class CuantoDinero {


    public static void main(String[] args) {
      
        System.out.println("cuanto dinero tiene Guillermo");
                
        float Guillermo,total, Luis, Juan;
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese cuento dienero tiene Guillermo");
        Guillermo=entrada.nextFloat();   
        
  
        Luis=(Guillermo)/2;
        Juan=(Guillermo+Luis)/2;
        total=Guillermo+Luis+Juan;

        System.out.println("El total de los tres es = "+total);
        System.out.println("Guillermo tiene $ "+Guillermo);
        System.out.println("Luis tiene $= "+Luis);
        System.out.println("Juan tiene $= "+Juan);
    }
    
}
