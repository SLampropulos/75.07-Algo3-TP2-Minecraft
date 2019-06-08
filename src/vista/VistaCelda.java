package vista;

import java.lang.reflect.Method;

import Materiales.Material;
import javafx.scene.layout.GridPane;
//import modelo.AlgoPoly;

public class VistaCelda {
	private Dibujable dibujable;

	public VistaCelda(Material material, ContenedorPrincipal contenedorPrincipal,
			GridPane pane, int x, int y, double ancho, double alto) {

		@SuppressWarnings("rawtypes")
		Class[] param = new Class[7];
		param[0] = Material.class;
		param[1] = ContenedorPrincipal.class;
//		param[2] = Casillero.class;
		param[2] = GridPane.class;
		param[3] = int.class;
		param[4] = int.class;
		param[5] = double.class;
		param[6] = double.class;
		String nombreClase = "vista.Vista" + material.getClass().getSimpleName();

		try {
			Class<?> clase = Class.forName(nombreClase);
			Method metodo = clase.getDeclaredMethod("Instancia", param);
			dibujable = (Dibujable) metodo.invoke(null, material, contenedorPrincipal, pane, x, y, ancho,
					alto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dibujar() {
		dibujable.dibujar();
	}
}
