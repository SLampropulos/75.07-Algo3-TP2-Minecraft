package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import juego.MineCraft;
import vista.ContenedorPrincipal;

public class InicioDelJuegoHandler implements EventHandler<ActionEvent> {

	MineCraft mineCraft;
	Stage stage;
	int anchoPantalla;
	int altoPantalla;

	public InicioDelJuegoHandler(MineCraft mineCraft, Stage stage, int anchoPantalla, int altoPantalla) {
		this.mineCraft = mineCraft;
		this.stage = stage;
		this.anchoPantalla = anchoPantalla;
		this.altoPantalla = altoPantalla;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		Scene scene = new Scene(new ContenedorPrincipal(mineCraft, stage), anchoPantalla, altoPantalla);
		stage.setScene(scene);
	}
}
