import javax.swing.*;

public class Entrada2 {
	
	static public void main(String[] args){
		
		
		//                          clase.metodo
		String nombre_usuario=JOptionPane.showInputDialog("ingresa el nombre");
		
		String edad=JOptionPane.showInputDialog("ingresa edad");
		
		//se debe cambiar de string a int por medio del metodo parseInt de la clase integer 
		//el cual esta ubicado en el paquete java.lang
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.print("hola "+nombre_usuario+" tienes "+ (edad_usuario+1)+" años");
	} 

}
