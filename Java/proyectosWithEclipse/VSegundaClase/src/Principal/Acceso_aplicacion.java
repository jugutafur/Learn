package Principal;
import javax.swing.*;// JOptionpane

public class Acceso_aplicacion {

	public static void main(String args[]) {
		
		System.out.println("hola mundo");
		
		String clave="juan", pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("ingrese el nombre de usuario");	
			
			if(clave.equals(pass)==false) {
				
			System.out.println("usuario invalido");
			}
		}
		
		System.out.println("usuario valido. Acceso permitido");
		
	}
}
