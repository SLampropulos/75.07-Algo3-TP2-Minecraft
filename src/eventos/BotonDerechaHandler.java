package eventos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import personaje.Jugador;
import vista.ContenedorPrincipal;
import vista.VistaJugador;

public class BotonDerechaHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private ContenedorPrincipal contenedorPrincipal;
	private VistaJugador vistaJugador;

	public BotonDerechaHandler(Jugador jugador, ContenedorPrincipal contenedorPrincipal, VistaJugador vistaJugador) {
		this.jugador = jugador;
		this.contenedorPrincipal = contenedorPrincipal;
		this.vistaJugador = vistaJugador;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		jugador.derecha();

		MediaPlayer mediaPlayer = new MediaPlayer(
				new Media(new File("src/vista/sounds/SUCTION.WAV").toURI().toString()));
		mediaPlayer.play();

		this.vistaJugador.setImagen("file:src/vista/images/JugadorDerecha.png");

		contenedorPrincipal.refrescar();
	}
}
