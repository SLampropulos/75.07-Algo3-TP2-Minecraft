package vista;

import javafx.scene.layout.GridPane;

public class VistaMadera extends VistaRectangulo {

	static final String DIRECCION_IMAGEN_MADERA = "file:src/vista/images/Madera.png";
	
	public VistaMadera(GridPane pane, int x, int y) {
		super(pane, x, y);
	}

	public void dibujar() {
		this.ponerImagen(DIRECCION_IMAGEN_MADERA);
	}
}
