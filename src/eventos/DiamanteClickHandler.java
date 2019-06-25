package eventos;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

public class DiamanteClickHandler implements EventHandler<MouseEvent> {

	public DiamanteClickHandler() {
		
	}
	
    @Override
    public void handle(MouseEvent event) {
		Alert dialogoAlerta = new Alert(AlertType.INFORMATION);
		dialogoAlerta.setTitle("");
		dialogoAlerta.setHeaderText(null);
		dialogoAlerta.setContentText("Click Diamante");
		dialogoAlerta.initStyle(StageStyle.UTILITY);
		dialogoAlerta.showAndWait();
    }
}