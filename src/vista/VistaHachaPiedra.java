package vista;

import javafx.scene.layout.GridPane;

public class VistaHachaPiedra extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_HACHA_PIEDRA = "file:src/vista/images/HachaPiedra.png";
	
	public VistaHachaPiedra(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_HACHA_PIEDRA);
	}
}
