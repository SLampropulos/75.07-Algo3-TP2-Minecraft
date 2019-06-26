package vista;

import javafx.scene.layout.GridPane;

public class VistaDiamante extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_DIAMANTE = "file:src/vista/images/Diamante.png";
	
	public VistaDiamante(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		ponerImagen(DIRECCION_IMAGEN_DIAMANTE);
	}
}
