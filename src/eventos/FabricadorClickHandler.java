package eventos;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import juego.MineCraft;
import vista.ContenedorPrincipal;

public class FabricadorClickHandler implements EventHandler<MouseEvent> {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;
	private int x;
	private int y;

	public FabricadorClickHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal, int x, int y) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
		this.x = x;
		this.y = y;
	}

	@Override
	public void handle(MouseEvent event) {
		mineCraft.getJugador().agregarMaterialSeleccionadoAlFabricador(x, y);
		contenedorPrincipal.refrescar();
	}
}