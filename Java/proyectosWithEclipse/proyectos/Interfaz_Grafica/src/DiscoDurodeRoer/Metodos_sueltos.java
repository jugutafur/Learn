package DiscoDurodeRoer;

public class Metodos_sueltos {
    
    
    
    

    public static int Numero_aleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (maximo - minimo + 1) + minimo);
        return num;
    }

    public static String textoPrueba() {
        return "mensaje de prueba 015";
    }

    public static void setOperaciones(String num1, String num2) {
        
        int nume1=Integer.parseInt(num1);
        int nume2=Integer.parseInt(num2);
                
        Suma = nume1 + nume2;
        Resta = nume1 - nume2;
        Multiplicacion = nume1 * nume2;
        Division = nume1 / nume2;
        raiz1 = Math.sqrt(nume1);
        raiz2 = Math.sqrt(nume2);
        residuo = nume1 % nume2;

        double[] Array_Resultado = new double[7];

        Array_Resultado[0] = Suma;
        Array_Resultado[1] = Resta;
        Array_Resultado[2] = Multiplicacion;
        Array_Resultado[3] = Division;
        Array_Resultado[4] = raiz1;
        Array_Resultado[5] = raiz2;
        Array_Resultado[6] = residuo;

        System.out.println(", " + Suma + ", " + Resta + ", " + Multiplicacion + ", " + Division
                + ",  " + raiz1 + ", " + raiz2 + ", " + residuo);

        for (double e : Array_Resultado) {
            System.out.println("\n" + e);
        }
    }
    
    public static String getOperarciones(){
          
        return "";
    }
    
    //tambien podermos pedir un array de nombre prueba
    
    public static void setArray(double [] Array_Resultado){
        
         for (double e : Array_Resultado) {
            System.out.println(e);
        }
    }
    
    
    
    
    private static double Suma, Resta, Multiplicacion, Division, raiz1, raiz2, residuo;
    
}
