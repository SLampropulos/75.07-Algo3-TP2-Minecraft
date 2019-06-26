package vista;

import javafx.scene.layout.GridPane;

public class VistaPiedra extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_PIEDRA = "file:src/vista/images/Piedra.png";
	public VistaPiedra(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		this.ponerImagen(DIRECCION_IMAGEN_PIEDRA);
	}
}
