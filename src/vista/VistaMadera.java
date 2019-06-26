package vista;

import javafx.scene.layout.GridPane;

public class VistaMadera extends VistaRectangulo {

	public VistaMadera(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Madera.png");
	}
}