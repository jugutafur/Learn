package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


//En este Fichero podemos evidenciar el ejemplo de una clase interna

public class pruebaTemporizador2 {
	
	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj(3000, true);
		mireloj.EnMarcha();
		JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
		System.exit(0);
	}
}

class Reloj{

	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	
	public void EnMarcha() {
		ActionListener oyente= new DameHora2();
		Timer miTemporizador=new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
	
	private class DameHora2 implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			Date ahora=new Date();
			System.out.println("te pongo la hora cada 3 seg" + ahora);
			
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
}