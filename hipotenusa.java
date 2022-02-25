package Hipotenusa;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hipotenusa extends JFrame {

	CalculoHip hip = new CalculoHip();
	
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hipotenusa frame = new hipotenusa();
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
	public hipotenusa() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtA = new JTextField();
		txtA.setToolTipText("Ingresa el cateto adyacente ");
		txtA.setBounds(118, 90, 93, 26);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtO = new JTextField();
		txtO.setColumns(10);
		txtO.setBounds(317, 90, 93, 26);
		contentPane.add(txtO);
		
		JLabel lblNewLabel = new JLabel("Ingresa el cateto adyacente: 👇");
		lblNewLabel.setBounds(6, 72, 205, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ingresa el cateto opuesto: 👇");
		lblNewLabel_1.setBounds(223, 72, 187, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("La hipotenusa es: 👉");
		lblNewLabel_2.setBounds(20, 191, 142, 16);
		contentPane.add(lblNewLabel_2);
		
		JEditorPane etiResultado = new JEditorPane();
		etiResultado.setBounds(160, 191, 150, 16);
		contentPane.add(etiResultado);
		
		JButton btnhip = new JButton("Calcular hipotenusa ");
		btnhip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double C1 = Double.parseDouble(txtA.getText());
			double C2 = Double.parseDouble(txtO.getText());
			
			
			hip.hip(C1, C2);
			
			etiResultado.setText(String.valueOf(hip.result));
			}
		});
		btnhip.setBounds(150, 145, 160, 29);
		contentPane.add(btnhip);
		
		
	}
}
