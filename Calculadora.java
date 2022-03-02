package Calculadora;
// Edgar Amauri reyes olivas

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	String Numero1;
	String signo;
	String Numero2;

	private JPanel contentPane;
	private JTextField txtResu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static String Calculadora (String dato1, String dato2, String signo){
		Double resutlatdo = 0.0;
		String respuesta;
		
		if(signo.equals("-")) {
			resutlatdo = Double.parseDouble(dato1)-Double.parseDouble(dato2);
		}
		if(signo.equals("+")) {
			resutlatdo = Double.parseDouble(dato1)+Double.parseDouble(dato2);
		}
		if(signo.equals("*")) {
			resutlatdo = Double.parseDouble(dato1)*Double.parseDouble(dato2);
		}
		if(signo.equals("/")) {
			resutlatdo = Double.parseDouble(dato1)/Double.parseDouble(dato2);
		}
		
		respuesta= resutlatdo.toString();
		return respuesta;
	}
	
	public static boolean Existepunto (String cadena) {
		boolean resultado;
		resultado = false;
		
		for (int i=0 ; i<cadena.length(); i++) {
			if(cadena.substring(i,i+1).equals(".")) {
				resultado= true;
				break;
			}
		}
		return resultado;
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("calculadora");
		lblNewLabel.setBounds(184, 6, 79, 16);
		contentPane.add(lblNewLabel);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "1");
			}
		});
		btn1.setBounds(6, 187, 98, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "2");
			}
		});
		btn2.setBounds(116, 187, 98, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "3");
			}
		});
		btn3.setBounds(226, 187, 98, 29);
		contentPane.add(btn3);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txtResu.getText().equals("")) {
					Numero1 = txtResu.getText();
					signo=("+");
					txtResu.setText("");
					
				}
			}
		});
		btnSuma.setBounds(336, 224, 98, 29);
		contentPane.add(btnSuma);
		
		JButton btnIgual = new JButton("equal");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado;
				String Dato2=txtResu.getText();
				
				if(!Dato2.equals("")) {
	
					resultado=Calculadora(Numero1,Dato2,signo);
					txtResu.setText(resultado);
				}
				
			}
		});
		btnIgual.setBounds(226, 224, 98, 29);
		contentPane.add(btnIgual);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "4");
			}
		});
		btn4.setBounds(6, 146, 98, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "5");
			}
		});
		btn5.setBounds(116, 146, 98, 29);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "6");
			}
		});
		btn6.setBounds(226, 146, 98, 29);
		contentPane.add(btn6);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "7");
			}
		});
		btn7.setBounds(6, 105, 98, 29);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "8");
			}
		});
		btn8.setBounds(116, 105, 98, 29);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "9");
			}
		});
		btn9.setBounds(226, 105, 98, 29);
		contentPane.add(btn9);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena;
				cadena=txtResu.getText();
				
				if(cadena.length()<=0){
					txtResu.setText("0.");
				}else {
					if(!Existepunto(txtResu.getText()));
					txtResu.setText(txtResu.getText()+".");
				}
			}

			
		});
		btnPunto.setBounds(116, 228, 98, 29);
		contentPane.add(btnPunto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText(txtResu.getText()+ "0");
			}
		});
		btn0.setBounds(6, 228, 98, 29);
		contentPane.add(btn0);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtResu.getText().equals("")) {
					 Numero1= txtResu.getText();
					 signo=("-");
					txtResu.setText("");
					
				}
			}
		});
		btnResta.setBounds(336, 187, 98, 29);
		contentPane.add(btnResta);
		
		JButton BtnDiv = new JButton("/");
		BtnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtResu.getText().equals("")) {
					Numero1 = txtResu.getText();
					signo=("/");
					txtResu.setText("");
					
				}
			}
		});
		BtnDiv.setBounds(336, 146, 98, 29);
		contentPane.add(BtnDiv);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtResu.getText().equals("")) {
					 Numero1 = txtResu.getText();
					 signo=("*");
					txtResu.setText("");
					
				}
			}
		});
		btnMulti.setBounds(336, 105, 98, 29);
		contentPane.add(btnMulti);
		
		txtResu = new JTextField();
		txtResu.setBounds(6, 23, 428, 36);
		contentPane.add(txtResu);
		txtResu.setColumns(10);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena;
				cadena=txtResu.getText();
				
				
					if(cadena.length()>0) {
						cadena=cadena.substring(0, cadena.length()-1);
						txtResu.setText(cadena);
					}
			}
		});
		btnC.setBounds(226, 71, 98, 29);
		contentPane.add(btnC);
		
		JButton btnCe = new JButton("ce");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResu.setText("");
			}
		});
		btnCe.setBounds(336, 71, 98, 29);
		contentPane.add(btnCe);
	}
	
}


