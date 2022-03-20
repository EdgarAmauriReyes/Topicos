package hilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame implements Runnable{

	ArrayList<Datos> registro = new ArrayList<>();
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(53, 72, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad:");
		lblNewLabel_1.setBounds(53, 115, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(126, 67, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(126, 110, 130, 26);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JButton btnNombre = new JButton("Registrar ");
		btnNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos dt=new Datos();
				dt.setNombre(txtNombre.getText());
				dt.setCiudad(txtCiudad.getText());
				
				registro.add(dt);
				txtNombre.setText("");
				txtCiudad.setText("");
			}
		});
		btnNombre.setBounds(53, 196, 117, 29);
		contentPane.add(btnNombre);
		
		JButton btnMostrar = new JButton("Mostrar ");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread hilo= new Thread();
				hilo.start();
			}
		});
		btnMostrar.setBounds(215, 196, 117, 29);
		contentPane.add(btnMostrar);
	}

	public void run(){
		for(int i=0; i<registro.size(); i++) {
			txtNombre.setText(registro.get(i).getNombre());
			txtCiudad.setText(registro.get(i).getCiudad());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
