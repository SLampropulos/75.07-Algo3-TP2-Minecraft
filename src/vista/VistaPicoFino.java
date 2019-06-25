package vista;

import javafx.scene.layout.GridPane;

public class VistaPicoFino extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_PICO_FINO = "file:src/vista/images/PicoFino.png";
	
	public VistaPicoFino(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_PICO_FINO);
	}
}
