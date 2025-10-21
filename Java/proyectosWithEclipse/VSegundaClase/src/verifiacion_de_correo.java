import javax.swing.*;

public class verifiacion_de_correo {
	
	public static void main (String[] args){
		
		int arroba = 0;
		boolean punto= false;
		
		String correo= JOptionPane.showInputDialog("Ingresar correo");
				
		for(int i=0; i<correo.length(); i++){
			
			if(correo.charAt(i)== '@'){
			
				arroba++;
			}		
			if(correo.charAt(i)=='.'){
				punto=true;
			}
		}
		if(arroba==1 && punto==true){
				System.out.println("es correcto");
			}
			else{
				System.out.println("es incorecto");
			}
	}

}
