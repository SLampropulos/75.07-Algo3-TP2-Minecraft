package eventos;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;
import juego.MineCraft;
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
		mineCraft.getJugador();
		contenedorPrincipal.refrescar();
		
		Alert dialogoAlerta = new Alert(AlertType.INFORMATION);
		dialogoAlerta.setTitle("");
		dialogoAlerta.setHeaderText(null);
		dialogoAlerta.setContentText("Click Madera");
		dialogoAlerta.initStyle(StageStyle.UTILITY);
		dialogoAlerta.showAndWait();
	}
}