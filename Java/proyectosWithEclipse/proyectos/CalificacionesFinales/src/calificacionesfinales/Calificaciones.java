
package calificacionesfinales;

public class Calificaciones {
    
    public Calificaciones(String nombre, int participacion, int primerExam, int SegundoExam, int Examenfinal){
        this.nombre=nombre;
        this.participacion=participacion;
        this.primerExam=primerExam;
        this.SegundoExam=SegundoExam;
        this.Examenfinal=Examenfinal;
    }
    
    public String getter_Nombre(){
        return "es "+nombre;
    }
    
    public void setter_Nombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setter_calificaiones(double not_par, double not_primer, double not_segundo, double not_tercero ){
        not_par*=0.10f;
        not_primer*= 0.25f ;
        not_segundo*= 0.25f;
        not_tercero*= 0.40f;
        
        not_final=not_par+not_primer+not_segundo+not_tercero;
    }
    
    public String getter_definitiva(){
        return ""+not_final;
    }
    
    private double not_par, not_primer, not_segundo, not_tercero,not_final;
    private int participacion, primerExam, SegundoExam, Examenfinal;
    private String nombre;
     
}
