package eventos;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import juego.MineCraft;
import materiales.Metal;
import vista.ContenedorPrincipal;

public class MetalClickHandler implements EventHandler<MouseEvent> {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;


	public MetalClickHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
	}
	
    @Override
    public void handle(MouseEvent event) {
		mineCraft.getJugador().seleccionarMaterial(Metal.class);;
		contenedorPrincipal.refrescar();
    }
}