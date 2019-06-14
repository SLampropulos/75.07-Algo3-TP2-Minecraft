package vista;

import javafx.scene.layout.GridPane;

public class VistaPiedra extends VistaRectangulo {

	public VistaPiedra(GridPane pane, int x, int y, double ancho, double alto) {
		super(pane, x, y, ancho, alto);
	}

	public static VistaPiedra Instancia(GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaPiedra(pane, x, y, ancho, alto);
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Piedra.png");
		super.dibujar();
	}
}