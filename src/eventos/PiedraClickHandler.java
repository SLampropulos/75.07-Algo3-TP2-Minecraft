package eventos;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import juego.MineCraft;
import materiales.Piedra;
import vista.ContenedorPrincipal;

public class PiedraClickHandler implements EventHandler<MouseEvent> {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;


	public PiedraClickHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
	}
	
    @Override
    public void handle(MouseEvent event) {
		mineCraft.getJugador().seleccionarMaterial(Piedra.class);;
		contenedorPrincipal.refrescar();
    }
}