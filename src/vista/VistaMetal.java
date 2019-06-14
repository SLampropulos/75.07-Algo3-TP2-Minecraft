package vista;

import javafx.scene.layout.GridPane;

public class VistaMetal extends VistaRectangulo {

	public VistaMetal(GridPane pane, int x, int y, double ancho, double alto) {
		super(pane, x, y, ancho, alto);
	}

	public static VistaMetal Instancia(GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaMetal(pane, x, y, ancho, alto);
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Metal.png");
		super.dibujar();
	}
}