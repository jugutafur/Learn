package administracion;

public class Jefes extends Empleados{

    private double Incentivo;
    
    public Jefes(String nombre,int edad){
        super(nombre,edad);
    }
    
    public void set_Incentivo(double b){
        Incentivo =b;
    }
    
    @Override
    public double get_Sueldo(){
        double sueldo_Jefe=super.get_Sueldo();
        return sueldo_Jefe+Incentivo; 
    }
}
