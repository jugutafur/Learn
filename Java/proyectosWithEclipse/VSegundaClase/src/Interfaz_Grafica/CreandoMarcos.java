package Interfaz_Grafica;

import javax.swing.*;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

public class CreandoMarcos {
	
	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class miMarco extends JFrame{
	
	public miMarco() {
		//hacer visible
		setVisible(true);
		//ajustar medidas
		setSize(500,300);
		//ajustar
		setLocation(500,300);
		//con el siguiente ajustamos la posicion y las medidas a la vez
		//setBounds(500,300,250,250);
		setResizable(false);
		//maximizar el alto y ancho al maximo del marco 
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mi marco");
		//para conocer las dimensiones de la pantalla
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalla = miPantalla.getScreenSize(); 
		
		int alturaPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		Image miIcono = miPantalla.getImage("src/Interfaz_Grafica/pruebaIconoSwing.gif");
		
		setIconImage(miIcono);
	}
}