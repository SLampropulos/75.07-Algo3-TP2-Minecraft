package vista;

import javafx.scene.layout.GridPane;

public class VistaDiamante extends VistaRectangulo {

	public VistaDiamante(GridPane pane, int x, int y, double ancho, double alto) {
		super(pane, x, y, ancho, alto);
	}

	public static VistaDiamante Instancia(GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaDiamante(pane, x, y, ancho, alto);
	}

	public void dibujar() {
		ponerImagen("file:src/vista/images/Diamante.png");
		super.dibujar();
	}
}