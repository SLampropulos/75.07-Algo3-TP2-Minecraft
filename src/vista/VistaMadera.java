package vista;

import Materiales.Material;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaMadera extends VistaRectangulo {

	public VistaMadera(Material material, GridPane pane, int x, int y, double ancho, double alto) {
		super(material, pane, x, y, ancho, alto);
	}

	public static VistaMadera Instancia(Material material, GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaMadera(material, pane, x, y, ancho, alto);
	}

	public void dibujar() {
//		pintar(Color.BROWN);
		this.ponerImagen("file:src/vista/images/Madera.png");
//		etiquetar("Madera", Color.BLACK);
		super.dibujar();
//		this.ponerBotonInfo("xxx", "Accion");
	}
}