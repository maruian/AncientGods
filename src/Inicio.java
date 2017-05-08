import Ventanas.VentanaIntro;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Inicio {

	public static void main(String[] args) {
		VentanaIntro jImagen=new VentanaIntro();
		jImagen.setVisible(true);

		//LANZAMOS LA MUSICA
				try {
					FileInputStream fis;
					Player player;
					fis = new FileInputStream("./music/theme.mp3");
					BufferedInputStream bis = new BufferedInputStream(fis);
					player = new Player(bis); // Llamada a constructor de la clase Player
					player.play(); // Llamada al metodo play
				} catch (JavaLayerException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e){
					e.printStackTrace();
				}
	}

}
