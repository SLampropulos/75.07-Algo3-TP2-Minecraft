package eventos;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import juego.MineCraft;
import materiales.Diamante;
import vista.ContenedorPrincipal;

public class DiamanteClickHandler implements EventHandler<MouseEvent>  {
	private MineCraft mineCraft;
	private ContenedorPrincipal contenedorPrincipal;


	public DiamanteClickHandler(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal) {
		this.mineCraft = mineCraft;
		this.contenedorPrincipal = contenedorPrincipal;
	}
	
    @Override
    public void handle(MouseEvent event) {
		mineCraft.getJugador().seleccionarMaterial(Diamante.class);;
		contenedorPrincipal.refrescar();
    }
}