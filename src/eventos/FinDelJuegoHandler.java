package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FinDelJuegoHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.exit(0);
    }

}
