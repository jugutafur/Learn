package Principal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicios1 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicios1 frame = new ejercicios1();
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
	public ejercicios1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el nombre que quiere saludar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(44, 11, 347, 79);
		contentPane.add(lblNewLabel);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txt_Nombre.setBounds(61, 104, 287, 35);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JButton btn_Saludar = new JButton("Saludar!!");
		btn_Saludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "!! Hola " + txt_Nombre.getText().trim()+  " !!");
				
			}
		});
		btn_Saludar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn_Saludar.setBounds(95, 170, 216, 55);
		contentPane.add(btn_Saludar);
	}
}
