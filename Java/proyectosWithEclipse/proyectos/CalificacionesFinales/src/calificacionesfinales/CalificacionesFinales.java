
package calificacionesfinales;

public class CalificacionesFinales {

    public static void main(String[] args) {
           
        System.out.println("Programa que determina la califiacion total del Semeste");
        
       Calificaciones Alumno1 =new Calificaciones("luis carlos",15,14,17,19); 
       
       
       System.out.println("el nombre es "+ Alumno1.getter_Nombre());
       Alumno1.setter_calificaiones(15,14,17,19);
        System.out.println("nota del Alumno "+Alumno1.getter_Nombre()+" es = "+Alumno1.getter_definitiva());
        
    }
    
}
