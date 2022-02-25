package colores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colores extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores frame = new Colores();
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
	public Colores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Colores", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(16, 6, 283, 155);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JRadioButton optRojo = new JRadioButton("Rojo");
		buttonGroup.add(optRojo);
		optRojo.setBounds(43, 23, 60, 23);
		panel.add(optRojo);
		
		
		JRadioButton optVerde = new JRadioButton("Verde");
		buttonGroup.add(optVerde);
		optVerde.setBounds(43, 58, 67, 23);
		panel.add(optVerde);
		
		JRadioButton optAzul = new JRadioButton("Azul");
		buttonGroup.add(optAzul);
		optAzul.setBounds(43, 93, 60, 23);
		panel.add(optAzul);
		
		JEditorPane etiResultado = new JEditorPane();
		etiResultado.setBounds(16, 214, 283, 29);
		contentPane.add(etiResultado);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Color elegido: "; 
				if (optRojo.isSelected()) {
					mensaje=mensaje+"Rojo"; 
				} else if(optVerde.isSelected()) {
					mensaje=mensaje+"Verde";
				}else if (optAzul.isSelected()) {
					mensaje=mensaje+"Azul";
				}
				etiResultado.setText(mensaje); 
			}
		});
		btnAceptar.setBounds(6, 173, 117, 29);
		contentPane.add(btnAceptar);
		
		
		
		optRojo.setSelected(true);
	}
	
}
