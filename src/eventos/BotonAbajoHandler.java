package eventos;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import personaje.Jugador;
import vista.ContenedorPrincipal;
import vista.VistaJugador;

public class BotonAbajoHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private ContenedorPrincipal contenedorPrincipal;
	private VistaJugador vistaJugador;

	public BotonAbajoHandler(Jugador jugador, ContenedorPrincipal contenedorPrincipal, VistaJugador vistaJugador) {
		this.jugador = jugador;
		this.contenedorPrincipal = contenedorPrincipal;
		this.vistaJugador = vistaJugador;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		jugador.abajo();
		
		MediaPlayer mediaPlayer = new MediaPlayer(
				new Media(new File("src/vista/sounds/suction.wav").toURI().toString()));
		mediaPlayer.play();
		
		vistaJugador.setImagen("file:src/vista/images/JugadorAbajo.png");

		contenedorPrincipal.refrescar();
	}
}
