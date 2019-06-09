package vista;

import java.lang.reflect.Method;

import Materiales.Material;
import javafx.scene.layout.GridPane;
//import modelo.AlgoPoly;

public class VistaCelda {
	private Dibujable dibujable;

	public VistaCelda(Material material, GridPane pane, int x, int y, double ancho, double alto) {

		@SuppressWarnings("rawtypes")
		Class[] param = new Class[6];
		param[0] = Material.class;
//		param[1] = ContenedorPrincipal.class;
		param[1] = GridPane.class;
		param[2] = int.class;
		param[3] = int.class;
		param[4] = double.class;
		param[5] = double.class;
		String nombreClase = "vista.Vista" + material.getClass().getSimpleName();

		try {
			Class<?> clase = Class.forName(nombreClase);
			Method metodo = clase.getDeclaredMethod("Instancia", param);
			dibujable = (Dibujable) metodo.invoke(null, material, pane, x, y, ancho, alto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dibujar() {
		dibujable.dibujar();
	}
}
