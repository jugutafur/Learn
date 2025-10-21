package Interfaz_Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Saludar extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludar frame = new Saludar();
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
	public Saludar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el nombre de la persona a al que quiere saludar");
		lblNewLabel.setBounds(111, 37, 220, 33);
		contentPane.add(lblNewLabel);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(111, 111, 234, 20);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JButton btn_Saludar = new JButton("Saludar");
		btn_Saludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "!! HOlA " +txt_Nombre.getText().trim()+ "!!");
				
			}
		});
		btn_Saludar.setBounds(177, 183, 89, 23);
		contentPane.add(btn_Saludar);
	}

}
