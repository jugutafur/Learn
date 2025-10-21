package Sena;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hilos2 extends JFrame {

	private JPanel contentPane;
	private JTextArea txt1;
	private JButton btn1;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hilos2 frame = new Hilos2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hilos2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txt1 = new JTextArea();
			txt1.setBounds(95, 69, 183, 22);
			contentPane.add(txt1);
		}
		{
			btn1 = new JButton("Boton 1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					txt1.setBackground(getForeground());
				}
			});
			btn1.setBounds(61, 169, 89, 23);
			contentPane.add(btn1);
		}
		{
			btn2 = new JButton("Boton 2");
			btn2.setBounds(284, 169, 89, 23);
			contentPane.add(btn2);
		}
	}
}
