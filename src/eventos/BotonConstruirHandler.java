package eventos;

import vista.ContenedorPrincipal;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import juego.MineCraft;

public class BotonConstruirHandler implements EventHandler<ActionEvent> {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;

	public BotonConstruirHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		mineCraft.getJugador().fabricarHerramienta();
		MediaPlayer mediaPlayer = new MediaPlayer(
				new Media(new File("src/vista/sounds/construir2.wav").toURI().toString()));
		mediaPlayer.play();
		contenedorPrincipal.refrescar();
	}
}
