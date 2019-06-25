package vista;

import javafx.scene.Scene;

public class EscenaJuego extends Scene {

    private static int anchoVentana = 1160;
    private static int altoVentana = 640;

    public EscenaJuego(PantallaJuego pantallaJuego) {
        super(pantallaJuego, anchoVentana, altoVentana);
    }

}
