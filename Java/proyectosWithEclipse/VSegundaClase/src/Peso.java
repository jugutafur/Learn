import javax.swing.*;

public class Peso {

	public static void main(String[] args){
		
	    String genero=JOptionPane.showInputDialog("Ingrese si eres \n1.hombre  \n2.mujer");
		int genero1=Integer.parseInt(genero);
		
		switch(genero1){
		
		case 1:
			System.out.println("eres hombre");	
		break;
		
		case 2:
			System.out.println("eres mujer");
		break;
		
		default:
			System.out.println("valor invalido");
		}	
		
		
	}
}
