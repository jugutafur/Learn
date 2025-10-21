package Interfaz_Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lista_Pelis extends JFrame {

	private JPanel contentPane;
	private JTextField txt_pelis;
	private JComboBox cmbPelis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Pelis frame = new Lista_Pelis();
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
	public Lista_Pelis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbPelis = new JComboBox();
		cmbPelis.setBounds(64, 102, 311, 20);
		contentPane.add(cmbPelis);
		
		JButton btn_añadir = new JButton("A\u00F1adir");
		btn_añadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	NombrePelicula = txt_pelis.getText().trim();
				
				if(txt_pelis.getText().equalsIgnoreCase("")) {
					JOptionPane.showMessageDialog(null, "Ingreso invalido", "ERROR", JOptionPane.INFORMATION_MESSAGE);					
				}else {
				
				txt_pelis.setText("");
				cmbPelis.addItem(NombrePelicula);
				JOptionPane.showMessageDialog(null, "Pelicula ingresada con exito", "Correcto", JOptionPane.INFORMATION_MESSAGE);
			}}
		});
		btn_añadir.setBounds(302, 47, 89, 23);
		contentPane.add(btn_añadir);
		
		txt_pelis = new JTextField();
		txt_pelis.setBounds(50, 48, 182, 20);
		contentPane.add(txt_pelis);
		txt_pelis.setColumns(10);
	}
}
