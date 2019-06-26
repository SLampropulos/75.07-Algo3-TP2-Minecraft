package eventos;

import java.io.File;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import juego.MineCraft;
import vista.ContenedorPrincipal;

public class HerramientaClickHandler implements EventHandler<MouseEvent> {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;
	private int numeroHerramienta;

	public HerramientaClickHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal, int numeroHerramienta) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
		this.numeroHerramienta = numeroHerramienta;
	}

	@Override
	public void handle(MouseEvent event) {
		mineCraft.getJugador().setEquipable(numeroHerramienta);
		MediaPlayer mediaPlayer = new MediaPlayer(
				new Media(new File("src/vista/sounds/coin.wav").toURI().toString()));
		mediaPlayer.play();

		contenedorPrincipal.refrescar();
	}
}