package Radiobutton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radiobutton extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtResu;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radiobutton frame = new Radiobutton();
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
	public Radiobutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa el primero numero: ");
		lblNewLabel.setBounds(6, 33, 182, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el segundo numero: ");
		lblNewLabel_1.setBounds(6, 61, 182, 16);
		contentPane.add(lblNewLabel_1);
		
		txtN1 = new JTextField();
		txtN1.setBounds(185, 28, 130, 26);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(185, 61, 130, 26);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JRadioButton RdbtnSuma = new JRadioButton("Suma");
		buttonGroup.add(RdbtnSuma);
		RdbtnSuma.setBounds(6, 114, 81, 23);
		contentPane.add(RdbtnSuma);
		
		JRadioButton rdbtnResta = new JRadioButton("Resta");
		buttonGroup.add(rdbtnResta);
		rdbtnResta.setBounds(99, 114, 86, 23);
		contentPane.add(rdbtnResta);
		
		JRadioButton rdbtnMultiplicacion = new JRadioButton("Multiplicacion");
		buttonGroup.add(rdbtnMultiplicacion);
		rdbtnMultiplicacion.setBounds(185, 114, 130, 23);
		contentPane.add(rdbtnMultiplicacion);
		
		JRadioButton rdbtnDivision = new JRadioButton("division");
		buttonGroup.add(rdbtnDivision);
		rdbtnDivision.setBounds(327, 114, 97, 23);
		contentPane.add(rdbtnDivision);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(117, 201, 71, 16);
		contentPane.add(lblNewLabel_2);
		
		txtResu = new JTextField();
		txtResu.setBounds(185, 196, 130, 26);
		contentPane.add(txtResu);
		txtResu.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar ");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2, resu= 0;
				n1= Integer.parseInt(txtN1.getText());
				n2= Integer.parseInt(txtN2.getText());
				
				if (RdbtnSuma.isSelected()){
					resu= n1+n2;
				}else if (rdbtnResta.isSelected()) {
					resu=n1-n2;
				}else if(rdbtnMultiplicacion.isSelected()) {
					resu=n1*n2;
				}else if (rdbtnDivision.isSelected()) {
					resu=n1/n2;
				}else {
					JOptionPane.showMessageDialog(null, "Selecione una opcion valida");
					}
				txtResu.setText(""+ resu);
			}
		});
		btnAceptar.setBounds(99, 160, 117, 29);
		contentPane.add(btnAceptar);
		
		JButton btnLimpiar = new JButton("Limpiar ");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtN1.setText("");
				txtN2.setText("");
				txtResu.setText("");
			}
		});
		btnLimpiar.setBounds(228, 160, 117, 29);
		contentPane.add(btnLimpiar);
	}
}
