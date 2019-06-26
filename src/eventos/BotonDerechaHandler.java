package eventos;

import java.io.File;
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
				new Media(new File("src/vista/sounds/suction.wav").toURI().toString()));
		mediaPlayer.play();

		this.vistaJugador.setImagen("file:src/vista/images/JugadorDerecha.png");

		contenedorPrincipal.refrescar();
	}
}
