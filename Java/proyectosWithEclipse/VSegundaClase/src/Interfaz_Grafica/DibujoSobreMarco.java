package Interfaz_Grafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.*;
import java.awt.Color;

public class DibujoSobreMarco {
	
	public static void main(String[] args) {
		System.out.println("With this app we can draw on Frame");
		Marco2 miMarco = new Marco2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco2 extends JFrame{
	
	public Marco2() {
		setVisible(true);
		setSize(500,300);
		setLocation(500,300);
		setTitle("new draw on JPanel");
		setResizable(true);
		//despues de declarar la lamina debemos ponerla por encima del marco 
		Lamina2 miLamina = new Lamina2();
		add(miLamina);		
	}
}

//declaramos nuestra lamina
class Lamina2 extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//put text in one position 
		g.drawString("From of new Lamina",10,10);
		g.drawRect(50,50,200,200);
		g.drawLine(50,50,200,200);
		g.drawOval(50,50,100,200);
		g.drawArc(50,100,100,200,120,150);
		
		//esto es una refundicion es posible ya que una contiene la otra
		//clase variableObjeto = (Esta clase contiene a ) esta clase; Y NO AL REVEZ
		Graphics2D graphics2d = (Graphics2D) g;
		
		//Rectangle2D es una clase abstracta la cual no se puede instanciar 
		//la siguiente linea de codigo es posible usando el polimorfismo ya que 
		//Rectangle2D.Double si se puede
		//PRINCIPIO DE SUSTITUCION ES UN ..
		Rectangle2D rectangle2d = new Rectangle2D.Double(100,100,200,150);
		//Graphics2D.draw(Shape s) y Rectangle2D implements Shape //'interfaz"
		graphics2d.draw(rectangle2d);
		
		//Ahora vamos a dibujar una elpse dentro de nuestro rectangulo
		
		Ellipse2D ellipse2D = new Ellipse2D.Double();
		ellipse2D.setFrame(rectangle2d);
		graphics2d.draw(ellipse2D);
		
		graphics2d.draw(new Line2D.Double(100,100,300,250));
		
		//Ahora vamos a dibujar un circulo que tenga adentro nuestro cuadrado
		
		double centroX = rectangle2d.getCenterX();
		double centroY = rectangle2d.getCenterY();
		
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		
		graphics2d.setPaint(Color.BLUE);
		//para rellenar toda la figura
		//graphics2d.fill(circulo);
		graphics2d.draw(circulo);
	}
}