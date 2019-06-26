package vista;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class EscenaJuego extends Scene {

    private static int anchoVentana = 1160;
    private static int altoVentana = 680;

    public EscenaJuego(Pane pane) {
        super(pane, anchoVentana, altoVentana);
    }

}
