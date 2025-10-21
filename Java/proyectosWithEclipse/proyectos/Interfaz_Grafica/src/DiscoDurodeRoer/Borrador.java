
package DiscoDurodeRoer;

public class Borrador {


    public static void main(String[] args) {
        
        double num1=5, num2=3;
        
        double Suma= num1+num2;
        double Resta= num1-num2;
        double Multiplicacion= num1*num2; 
        double Division = num1/num2;
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        double residuo= num1%num2;
        
        double [] Matriz_Resultado = new double[7];
        
        Matriz_Resultado[0]= Suma;
        Matriz_Resultado[1]= Resta;
        Matriz_Resultado[2]= Multiplicacion;
        Matriz_Resultado[3]= Division;
        Matriz_Resultado[4]= raiz1;
        Matriz_Resultado[5]= raiz2;
        Matriz_Resultado[6]= residuo;
        
        
        System.out.println(", "+Suma+", "+Resta+", "+Multiplicacion+", "+Division+
                ",  "+raiz1+", "+raiz2+", "+residuo);
        
        for(double e:Matriz_Resultado){
            
            System.out.println("\n"+e);
        }
        Metodos_sueltos.setArray(Array_Resultado);
    }
}
