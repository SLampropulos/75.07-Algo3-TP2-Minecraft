package vista;

import javafx.scene.layout.GridPane;

public class VistaHachaMetal extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_HACHA_METAL = "file:src/vista/images/HachaMetal.png";
	
	public VistaHachaMetal(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_HACHA_METAL);
	}
}
