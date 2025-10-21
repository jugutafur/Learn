package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

//it very important review this topic to understand well in the video pildorasinformaticas video 52 interfaces
//and internal class 


public class PruebaTemporizador {
	
	public static void main(String[] args) {
		
		
		//ActionListener oyente = new ActionListener(); // LAS INTERFACES NO SE PUEDEN INSTANCIAR
		//ActionListener oyente = new DameLaHora(); 	// LAS INTERFACES NO SE PUEDEN INSTANCIAR Se puede 
														// hacer esto usando el principio de sustitucion o
		
		DameLaHora oyente=new DameLaHora();	//por medio de una clase que tiene implementada la interfaz
		
		//constructor de Timer(int delay, ActionListener listener)
		Timer miTemporizador= new Timer(5000, oyente );
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para deterner");

//with this instruction we can stop of programme
		System.exit(0); 
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
//In the variable ahora let go rewrite with the time each 5 seconds 
		Date ahora=new Date();
		
		System.out.println("tepongo la hora cada 5 seg "+ahora);
		Toolkit.getDefaultToolkit().beep();
		
	}
}