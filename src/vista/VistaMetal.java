package vista;

import Materiales.Material;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaMetal extends VistaRectangulo {

	public VistaMetal(Material material, GridPane pane, int x, int y, double ancho, double alto) {
		super(material, pane, x, y, ancho, alto);
	}

	public static VistaMetal Instancia(Material material, GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaMetal(material, pane, x, y, ancho, alto);
	}

	public void dibujar() {
//		pintar(Color.GAINSBORO);
		this.ponerImagen("file:src/vista/images/Metal.png");
//		etiquetar("Metal", Color.BLACK);
		super.dibujar();
//		this.ponerBotonInfo("xxxx", "Accion");
	}
}