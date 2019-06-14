package vista;

import javafx.scene.layout.GridPane;

public class VistaMaterialNull extends VistaRectangulo {

    public VistaMaterialNull(GridPane pane, int x, int y, double ancho, double alto) {
        super(pane, x, y, ancho, alto);
    }

    public static VistaMaterialNull Instancia(GridPane pane, int x, int y, double ancho, double alto) {
        return new VistaMaterialNull(pane, x, y, ancho, alto);
    }

    public void dibujar() {
//        super.dibujar();
    }
}
