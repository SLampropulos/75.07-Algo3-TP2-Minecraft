package vista;

import javafx.scene.layout.GridPane;

public class VistaHachaMadera extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_HACHA_MADERA = "file:src/vista/images/HachaMadera.png";
	
	public VistaHachaMadera(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_HACHA_MADERA);
	}
}
