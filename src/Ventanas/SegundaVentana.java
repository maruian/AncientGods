package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SegundaVentana extends JFrame {

	private JPanelSegundaVentana contentPane;
	private final JButton btnNext = new JButton("Vamos!");

	private SegundaVentana sv;

	/**
	 * Create the frame.
	 */
	public SegundaVentana() {
		setResizable(false);
		
		//LANZA LA VENTANA Y EL CONTENT PANEL
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 375);
		contentPane = new JPanelSegundaVentana();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		//AÑADIMOS LOS BOTONES
		btnNext.setBounds(335, 320, 150, 30);
		contentPane.add(btnNext);
		
		//AÑADIMOS LISTENER + EVENTO EN EL BOTON AYUDA
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TerceraVentana tv = new TerceraVentana();	
				tv.setVisible(true);
				sv.dispose();
			}
		});
		
		sv=this;
		
	}
}