package vista;

import javafx.scene.layout.GridPane;

public class VistaPicoMadera extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_PICO_MADERA = "file:src/vista/images/PicoMadera.png";
	
	public VistaPicoMadera(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_PICO_MADERA);
	}
}
