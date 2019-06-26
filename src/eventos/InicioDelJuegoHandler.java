package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import juego.MineCraft;
import vista.ContenedorPrincipal;
import vista.EscenaJuego;

public class InicioDelJuegoHandler implements EventHandler<ActionEvent> {

	private MineCraft mineCraft;
	private Stage stage;

	public InicioDelJuegoHandler(MineCraft mineCraft, Stage stage) {
		this.mineCraft = mineCraft;
		this.stage = stage;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		EscenaJuego escenaJuego = new EscenaJuego(new ContenedorPrincipal(mineCraft, stage));
		stage.setScene(escenaJuego);
	}

}
