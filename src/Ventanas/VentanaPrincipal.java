package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanelVentanaPrincipal contentPane;
	private final JButton btnEmpezar = new JButton("Empezar!");
	private final JButton btnAyuda = new JButton("Ayuda");
	
	private VentanaPrincipal vp;
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setResizable(false);
		
		//LANZA LA VENTANA Y EL CONTENT PANEL
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 421);
		contentPane = new JPanelVentanaPrincipal();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		//AÑADIMOS LOS BOTONES
		btnEmpezar.setBounds(335, 300, 150, 30);
		contentPane.add(btnEmpezar);
		btnAyuda.setBounds(335, 350, 150, 30);
		contentPane.add(btnAyuda);

		//AÑADIMOS LISTENER + EVENTO EN EL BOTON EMPEZAR
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SegundaVentana sv = new SegundaVentana();	
				sv.setVisible(true);
				vp.dispose();
			}
		});
		
		//AÑADIMOS LISTENER + EVENTO EN EL BOTON AYUDA
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaAyuda va = new VentanaAyuda();	
				va.setVisible(true);
			}
		});
		

		vp=this;
		
		
	}
}
