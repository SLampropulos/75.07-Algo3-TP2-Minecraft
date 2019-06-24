package eventos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import excepciones.NoHayHerramientaExcepcion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
		try {
			jugador.izquierda();
		} catch (NoHayHerramientaExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		URL url = getClass().getResource("/vista/sounds/SUCTION.WAV");
		AudioClip clip = Applet.newAudioClip(url);
		clip.play();

		this.vistaJugador.setImagen("file:src/vista/images/JugadorIzquierda.png");
		contenedorPrincipal.refrescar();
	}

}
