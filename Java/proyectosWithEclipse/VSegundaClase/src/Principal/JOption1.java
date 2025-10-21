package Principal;
import javax.swing.*;

public class JOption1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//el valor ingresado en la ventana se almacenara en la variable objeto nombre_usuario
		
		String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre, por favor");

		//debido a que esto devuelve String como retorno debemos refundir 
		
		//para esto debemos usar parseInt pasar a entero lo que este en el argumento
		//parseInt(edad) este metodo pertenece a la clase Integer 
		
		String edad=JOptionPane.showInputDialog("ingerese su edad");
		
		//debido a que parseInt es static debemos nombrar la clase a la que pertenece antes y esto quedara en la 
		//variable de tipo entero edad_usuario
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("hola "+ nombre_usuario+ " tienes "+ edad_usuario+ " y el proximo año tendras " +(edad_usuario+1) + " años");
	}

}
