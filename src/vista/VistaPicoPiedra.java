package vista;

import javafx.scene.layout.GridPane;

public class VistaPicoPiedra extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_PICO_PIEDRA = "file:src/vista/images/PicoPiedra.png";
	
	public VistaPicoPiedra(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_PICO_PIEDRA);
	}
}
