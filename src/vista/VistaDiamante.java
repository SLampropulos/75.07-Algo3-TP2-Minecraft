package vista;

import Materiales.Material;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaDiamante extends VistaRectangulo {

	public VistaDiamante(Material material, ContenedorPrincipal contenedorPrincipal, GridPane pane,
			int x, int y, double ancho, double alto) {
		super(material, contenedorPrincipal, pane, x, y, ancho, alto);
	}

	public static VistaDiamante Instancia(Material material, ContenedorPrincipal contenedorPrincipal,
			GridPane pane, int x, int y, double ancho, double alto) {
		return new VistaDiamante(material, contenedorPrincipal, pane, x, y, ancho, alto);
	}

	public void dibujar() {
//		pintar(Color.GOLD);
		this.ponerImagen("file:src/vista/images/Diamante.png");
//		etiquetar("Diamante", Color.BLACK);
		super.dibujar();
//		this.ponerBotonInfo("xxxx", "Accion");
	}
}