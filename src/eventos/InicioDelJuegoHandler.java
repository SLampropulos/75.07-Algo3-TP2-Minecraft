package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import juego.MineCraft;
import vista.ContenedorPrincipal;

public class InicioDelJuegoHandler implements EventHandler<ActionEvent> {

    MineCraft juego;
    Stage stage;

    public InicioDelJuegoHandler(MineCraft juego, Stage stage) {
        this.juego = juego;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Scene scene = new Scene(new ContenedorPrincipal(juego, stage), 1160, 640);
        stage.setScene(scene);
    }
}
