package administracion;

public class Empleados extends Persona{

    private int Antiguedad, Talla;
    private double Sueldo;
    private String Area;
    private static int ID = 1;

    public Empleados(String nombre, int edad ){
        super(nombre, edad);
        ID++;
    }
    public void set_Antiguedad(int Antiguedad){
        this.Antiguedad=Antiguedad;
    }
    
    public void set_Talla(int Talla){
        this.Talla=Talla;
    }
    
    public void set_Sueldo(double Sueldo){
        this.Sueldo=Sueldo;
    }
    
    public void set_Area(String Area){
        this.Area=Area;
    }
    
    public int getAntiguedad() {
        return Antiguedad;
    }
     
    public int getTalla(){
        return Talla;
    }
    
    public double get_Sueldo(){
        return Sueldo;
    }

    public String getArea() {
        return Area;
    }
    

}
