package eventos;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import personaje.Jugador;
import vista.ContenedorPrincipal;
import vista.VistaJugador;

public class BotonIzquierdaHandler implements EventHandler<ActionEvent> {

	private Jugador jugador;
	private ContenedorPrincipal contenedorPrincipal;
	private VistaJugador vistaJugador;

	public BotonIzquierdaHandler(Jugador jugador, ContenedorPrincipal contenedorPrincipal, VistaJugador vistaJugador) {
		this.jugador = jugador;
		this.contenedorPrincipal = contenedorPrincipal;
		this.vistaJugador = vistaJugador;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		jugador.izquierda();
		
		MediaPlayer mediaPlayer = new MediaPlayer(
				new Media(new File("src/vista/sounds/suction.wav").toURI().toString()));
		mediaPlayer.play();

		this.vistaJugador.setImagen("file:src/vista/images/JugadorIzquierda.png");
		
		contenedorPrincipal.refrescar();
	}
}
