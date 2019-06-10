package eventos;

import Personaje.Jugador;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import vista.ContenedorPrincipal;

public class BotonAbajoHandler implements EventHandler<ActionEvent> {
	private Jugador jugador;
	private ContenedorPrincipal contenedorPrincipal;

	public BotonAbajoHandler(Jugador jugador, ContenedorPrincipal contenedorPrincipal) {
		this.jugador = jugador;
		this.contenedorPrincipal = contenedorPrincipal;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		jugador.irAbajo();
		
		URL url = getClass().getResource("/vista/sounds/SUCTION.WAV");
		AudioClip clip = Applet.newAudioClip(url);
		clip.play();

		contenedorPrincipal.refrescar();
	}
}
