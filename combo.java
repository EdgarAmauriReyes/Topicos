package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class combo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combo frame = new combo();
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
	public combo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿De donde eres?");
		lblNewLabel.setBounds(33, 30, 127, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] {"Mexico", "Colombia", "Argentina ", "Peru"}));
		combo.setBounds(228, 26, 108, 27);
		contentPane.add(combo);
		
		JButton btnSaludo = new JButton("Saludar!");
		btnSaludo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Item;
				Item = combo.getSelectedItem().toString();
				
				String sal;
				
				if(Item.equalsIgnoreCase("Mexico")){	
				JOptionPane.showMessageDialog(null, "Hola, un saludo hasta Mexico :)");
				} else 
				 	if (Item.equalsIgnoreCase("Colombia")) {
				JOptionPane.showMessageDialog(null, "Hola, un saludo hasta Colombia  :)");
				} else 
				 	if (Item.equalsIgnoreCase("Argentina")) {
				JOptionPane.showMessageDialog(null, "Hola, un saludo hasta Argentina  :)");	
				} else 
				 	if (Item.equalsIgnoreCase("Peru")) {
				JOptionPane.showMessageDialog(null, "Hola, un saludo hasta Peru  :)");	
				}
			}
		});
		btnSaludo.setBounds(33, 131, 117, 29);
		contentPane.add(btnSaludo);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(280, 131, 117, 29);
		contentPane.add(btnSalir);
	}
}
