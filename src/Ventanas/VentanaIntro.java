package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaIntro extends JFrame {

	private JPanel contentPane;
	private VentanaIntro vi;

	public VentanaIntro() {
		vi=this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//ANADO LA IMAGEN COMO LABEL PARA PODER ACTUAR SOBRE ELLA CON UN LISTENER
		JLabel lblPortada = new JLabel("");
		lblPortada.setIcon(new ImageIcon("./imgs/menuprincipal.jpg"));
		contentPane.add(lblPortada, BorderLayout.CENTER);
		
		//ANADO EL LISTENER SOBRE EL LABEL
		lblPortada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VentanaPrincipal vp = new VentanaPrincipal();
				vp.setVisible(true);
				vi.dispose();
			}
		});
		
		
		
		
	}

}
