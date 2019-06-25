package eventos;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import juego.MineCraft;
import materiales.Madera;
import vista.ContenedorPrincipal;

public class MaderaClickHandler implements EventHandler<MouseEvent> {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;

	public MaderaClickHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
	}

	@Override
	public void handle(MouseEvent event) {
		mineCraft.getJugador().seleccionarMaterial(Madera.class);;
		contenedorPrincipal.refrescar();
	}
}