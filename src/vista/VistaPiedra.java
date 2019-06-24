package vista;

import javafx.scene.layout.GridPane;

public class VistaPiedra extends VistaRectangulo {

	public VistaPiedra(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Piedra.png");
	}
}