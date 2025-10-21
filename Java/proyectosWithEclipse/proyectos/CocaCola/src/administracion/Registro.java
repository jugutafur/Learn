package administracion;
import javax.swing.*;

public class Registro {

    public static void main(String[] args) {
       
        Persona trabajador1 = new Persona("miguel angel" , 31);
        trabajador1.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula ")));
        trabajador1.setGenero(JOptionPane.showInputDialog("Ingrese el genero"));
        trabajador1.setLocalidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de localidad")));
        System.out.println(trabajador1.getDatosPersonales());
        
        Empleados trabajador2 = new Empleados("Sistemas",3 );
        System.out.println("area "+trabajador2.getArea()+" y antiguedad es = "+trabajador2.getAntiguedad());
        
        
        
    }
    
}
