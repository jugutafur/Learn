package Principal;
import javax.swing.*;//JOPtionPane

public class JOption {
	
	public static void main(String []args) {
		
		int desicion;
		
		System.out.println("ok2");
		JOptionPane.showInputDialog("prueba");							//string
		JOptionPane.showMessageDialog(null, "Trabajo con JOptionPane"); //void
		desicion=JOptionPane.showConfirmDialog(null, "¿Te encuentras bien?");		//int
		if(desicion==JOptionPane.YES_OPTION) {		
			JOptionPane.showMessageDialog(null, "esta bien");
		}if(desicion==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Esta mal");
		}if(desicion==JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "No responde");
		}
		
		
	}

}
