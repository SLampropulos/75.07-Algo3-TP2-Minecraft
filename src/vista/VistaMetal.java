package vista;

import javafx.scene.layout.GridPane;

public class VistaMetal extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_METAL = "file:src/vista/images/Metal.png";
	public VistaMetal(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		this.ponerImagen(DIRECCION_IMAGEN_METAL);
	}
}
