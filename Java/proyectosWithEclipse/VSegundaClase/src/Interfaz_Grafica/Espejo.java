/*
package Interfaz_Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Espejo extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Original;
	private JTextField txt_Imitador;
	private ButtonGroup bg1= new ButtonGroup();
	private ButtonGroup bg2= new ButtonGroup();
	
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Espejo frame = new Espejo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public Espejo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdb_2Original = new JRadioButton("Option 2");
		rdb_2Original.setBounds(38, 55, 109, 23);
		contentPane.add(rdb_2Original);
		
		JRadioButton rdb_1Original = new JRadioButton("Option 1");
		rdb_1Original.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdb_2Imitador.setSelected(rdb_1Original.isSelected());
			}
		});
		rdb_1Original.setBounds(38, 18, 109, 23);
		contentPane.add(rdb_1Original);
		
		JRadioButton rdb_3Original = new JRadioButton("Opcion 3");
		rdb_3Original.setBounds(38, 90, 109, 23);
		contentPane.add(rdb_3Original);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(10, 189, 549, 43);
		contentPane.add(separator);
		
		JRadioButton rdb_2Imitador = new JRadioButton("Option 2");
		rdb_2Imitador.setEnabled(false);
		rdb_2Imitador.setBounds(38, 304, 109, 23);
		contentPane.add(rdb_2Imitador);
		
		JRadioButton rdb_1Imitador = new JRadioButton("Option 1");
		rdb_1Imitador.setEnabled(false);
		rdb_1Imitador.setBounds(38, 267, 109, 23);
		contentPane.add(rdb_1Imitador);
		
		JRadioButton rdb_3Imitador = new JRadioButton("Opcion 3");
		rdb_3Imitador.setEnabled(false);
		rdb_3Imitador.setBounds(38, 339, 109, 23);
		contentPane.add(rdb_3Imitador);
		
		JCheckBox ckb_1Original = new JCheckBox("Option 1");
		ckb_1Original.setBounds(215, 18, 97, 23);
		contentPane.add(ckb_1Original);
		
		JCheckBox ckb_2Original = new JCheckBox("Option 2");
		ckb_2Original.setBounds(215, 55, 97, 23);
		contentPane.add(ckb_2Original);
		
		JCheckBox ckb_3Original = new JCheckBox("Opcion 3");
		ckb_3Original.setBounds(215, 90, 97, 23);
		contentPane.add(ckb_3Original);
		
		JCheckBox ckb_1Imitador = new JCheckBox("Option 1");
		ckb_1Imitador.setEnabled(false);
		ckb_1Imitador.setBounds(215, 267, 97, 23);
		contentPane.add(ckb_1Imitador);
		
		JCheckBox ckb_2Imitador = new JCheckBox("Option 2");
		ckb_2Imitador.setEnabled(false);
		ckb_2Imitador.setBounds(215, 304, 97, 23);
		contentPane.add(ckb_2Imitador);
		
		JCheckBox ckb_3Imitador = new JCheckBox("Opcion 3");
		ckb_3Imitador.setEnabled(false);
		ckb_3Imitador.setBounds(215, 339, 97, 23);
		contentPane.add(ckb_3Imitador);
		
		JSpinner spn_Original = new JSpinner();
		spn_Original.setBounds(393, 91, 146, 20);
		contentPane.add(spn_Original);
		
		JComboBox cmb_Original = new JComboBox();
		cmb_Original.setBounds(393, 56, 145, 20);
		contentPane.add(cmb_Original);
		
		txt_Original = new JTextField();
		txt_Original.setBounds(393, 19, 156, 20);
		contentPane.add(txt_Original);
		txt_Original.setColumns(10);
		
		txt_Imitador = new JTextField();
		txt_Imitador.setEnabled(false);
		txt_Imitador.setColumns(10);
		txt_Imitador.setBounds(393, 270, 156, 20);
		contentPane.add(txt_Imitador);
		
		JComboBox cmb_Imitador = new JComboBox();
		cmb_Imitador.setEnabled(false);
		cmb_Imitador.setBounds(393, 307, 145, 20);
		contentPane.add(cmb_Imitador);
		
		JSpinner spn_Imitador = new JSpinner();
		spn_Imitador.setEnabled(false);
		spn_Imitador.setBounds(393, 342, 146, 20);
		contentPane.add(spn_Imitador);
		
		bg1.add(rdb_1Original);
		bg1.add(rdb_2Original);
		bg1.add(rdb_3Original);
		
		bg2.add(rdb_1Imitador);
		bg2.add(rdb_2Imitador);
		bg2.add(rdb_3Imitador);
	}
}
*/