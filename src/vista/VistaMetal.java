package vista;

import javafx.scene.layout.GridPane;

public class VistaMetal extends VistaRectangulo {

	public VistaMetal(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Metal.png");
	}
}