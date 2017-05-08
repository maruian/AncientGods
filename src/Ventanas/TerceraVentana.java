package Ventanas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class TerceraVentana extends JFrame {

	private JPanel contentPane;
	private JButton btnEnviarRespuesta;
	private JTextField textField;
	private JTextField textField2;


	/**
	 * Create the frame.
	 */
	public TerceraVentana() {
		setResizable(false);
		
		//LANZA LA VENTANA Y EL CONTENT PANEL
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Primera ronda de preguntas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblCulEsEl = new JLabel("Cu\u00E1l es el n\u00FAmero PI?");
		lblCulEsEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCulEsEl);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCndPiso = new JLabel("En que año piso el hombre la luna?");
		lblCndPiso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblCndPiso);
		
		textField2 = new JTextField();
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JButton btnEnviarRespuesta = new JButton("Enviar respuesta");
		contentPane.add(btnEnviarRespuesta);
		btnEnviarRespuesta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				testRespuesta(textField.getText());
			}
		});
		
		
	}
	
	public boolean testRespuesta(String respuesta){
		if (respuesta == "3.14") return true;
		else return false;
	}
	
	public boolean segundoTestRespuesta(String respuesta){
		if (respuesta == "1969") return true;
		else return false;
	}
}