package eventos;

import vista.ContenedorPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
		contenedorPrincipal.refrescar();
	}
}
