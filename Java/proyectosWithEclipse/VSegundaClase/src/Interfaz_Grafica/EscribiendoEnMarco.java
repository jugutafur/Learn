package Interfaz_Grafica;

import javax.swing.*;
import java.awt.Frame;
import java.awt.*;
import java.time.LocalDateTime;  //da la fecha con la hora
import java.time.LocalDate;  //solo la fecha

public class EscribiendoEnMarco {
	
	public static void main (String[] args) {
		//En este caso tenememo nuestro marco pero vamos a ponerle un lamina por encima
		
		Marco miMarco = new Marco();
		miMarco.setVisible(true);
		miMarco.setLocation(500,300);
		miMarco.setSize(500,300);
		miMarco.setResizable(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Mi Nueva Ventana");
	}
}

class Marco extends JFrame{
	
	public Marco() {
		setVisible(false);
		setSize(0,0);
		setLocation(0,0);
		setTitle("");
		setResizable(false);
		//despues de declarar la lamina debemos ponerla por encima del marco 
		Lamina miLamina = new Lamina();
		add(miLamina);		
	}
}

//declaramos nuestra lamina
class Lamina extends JPanel {
	
	public void paintComponent(Graphics g) {
		LocalDateTime mydate = LocalDateTime.now();
		
		super.paintComponent(g);
		g.drawString("estamos aprendiendo Swing "+ mydate, 10 ,10);
	}
}