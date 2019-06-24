package vista;

import javafx.scene.layout.GridPane;

public class VistaDiamante extends VistaRectangulo {

	public VistaDiamante(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen("file:src/vista/images/Diamante.png");
	}
}