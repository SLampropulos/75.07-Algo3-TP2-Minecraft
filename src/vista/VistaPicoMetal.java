package vista;

import javafx.scene.layout.GridPane;

public class VistaPicoMetal extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_PICO_METAL = "file:src/vista/images/PicoMetal.png";
	
	public VistaPicoMetal(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_PICO_METAL);
	}
}
