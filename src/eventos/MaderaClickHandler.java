package eventos;

import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

public class MaderaClickHandler implements EventHandler<MouseEvent> {

	public MaderaClickHandler() {
		
	}
	
    @Override
    public void handle(MouseEvent event) {
		Alert dialogoAlerta = new Alert(AlertType.INFORMATION);
		dialogoAlerta.setTitle("");
		dialogoAlerta.setHeaderText(null);
		dialogoAlerta.setContentText("Click Madera");
		dialogoAlerta.initStyle(StageStyle.UTILITY);
		dialogoAlerta.showAndWait();
    }
}