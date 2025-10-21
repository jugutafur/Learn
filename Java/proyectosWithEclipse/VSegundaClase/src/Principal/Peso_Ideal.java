package Principal;
import javax.swing.*;// JoptionPane
import java.util.List;
import java.util.ArrayList;

public class Peso_Ideal {

	public static void main (String []args ) {		
		String genero="";
		List<String> _prueba = new ArrayList<>();
		
		do {
			genero= JOptionPane.showInputDialog("Ingresa tu genero (H/M)");
		}
		
		while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);{	
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm"));
			int peso_ideal=0;
			
			if(genero.equalsIgnoreCase("H")) {				
				peso_ideal=altura-110;
			}
			else if(genero.equalsIgnoreCase("M")) {
				peso_ideal=altura-120;
			}		
			
			System.out.println("tu Peso ideal es "+peso_ideal);
		}
	}
}