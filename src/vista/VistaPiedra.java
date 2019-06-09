package vista;

import Materiales.Material;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaPiedra extends VistaRectangulo {

	public VistaPiedra(Material material, GridPane pane, int x, int y, double ancho, double alto) {
		super(material, pane, x, y, ancho, alto);
	}

	public static VistaPiedra Instancia(Material material, GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaPiedra(material, pane, x, y, ancho, alto);
	}

	public void dibujar() {
//		this.pintar(Color.GRAY);
		this.ponerImagen("file:src/vista/images/Piedra.png");
//		this.etiquetar("Piedra", Color.BLACK);
		super.dibujar();
//		this.ponerBotonInfo("xxx", "Accion");
	}
}