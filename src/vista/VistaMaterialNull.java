package vista;

import Materiales.Material;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaMaterialNull extends VistaRectangulo {

    public VistaMaterialNull(Material material, GridPane pane, int x, int y, double ancho, double alto) {
        super(material, pane, x, y, ancho, alto);
    }

    public static VistaMaterialNull Instancia(Material material, GridPane pane, int x, int y, double ancho, double alto) {
        return new VistaMaterialNull(material, pane, x, y, ancho, alto);
    }

    public void dibujar() {
        super.dibujar();
    }
}
