package vista;

import javafx.scene.layout.GridPane;

public class VistaMadera extends VistaRectangulo {

	public VistaMadera(GridPane pane, int x, int y, double ancho, double alto) {
		super(pane, x, y, ancho, alto);
	}

	public static VistaMadera Instancia(GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaMadera(pane, x, y, ancho, alto);
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Madera.png");
		super.dibujar();
	}
}