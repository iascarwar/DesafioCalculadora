package calculadora.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class View_calculadora extends JFrame {

	private JPanel contentPane;
	public JTextField Valor_Propaganda;
	/**
	 * @wbp.nonvisual location=162,9
	 */
	private final JTextField txtCalculadora = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_calculadora frame = new View_calculadora();
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
	public View_calculadora() {
		txtCalculadora.setText("Calculadora");
		txtCalculadora.setColumns(10);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnCalcular_Alcance = new JButton("Calcular alcance");
		btnCalcular_Alcance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Auxiliar que chama o texto (valor da propaganda) digitado 
				String Aux1 = Valor_Propaganda.getText();
				
				//Auxiliar que transforma o texto String (valor da propaganda) em um número double
				double Aux_ValorP = Double.parseDouble(Aux1); 					
				
				//Variavel que recebe o calculo
				int alcance;
				
				alcance = (int) Aux_ValorP*30;
				
				JOptionPane.showMessageDialog(null, "O alcance da publicidade é de " +alcance + " pessoas");
			
				}
		});
		
		
		btnCalcular_Alcance.setBounds(148, 155, 140, 23);
		contentPane.add(btnCalcular_Alcance);
		
		Valor_Propaganda = new JTextField();
		Valor_Propaganda.setBounds(148, 105, 140, 20);
		contentPane.add(Valor_Propaganda);
		Valor_Propaganda.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite o valor da propaganda");
		lblNewLabel.setBounds(136, 79, 245, 14);
		contentPane.add(lblNewLabel);
	}
}