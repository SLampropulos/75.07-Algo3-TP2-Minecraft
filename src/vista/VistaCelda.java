package vista;

import java.lang.reflect.Method;

import Materiales.Material;
import javafx.scene.layout.GridPane;

public class VistaCelda {
	private Dibujable dibujable;

	public VistaCelda(Material material, GridPane pane, int x, int y, double ancho, double alto) {

		@SuppressWarnings("rawtypes")
		Class[] param = new Class[5];
		param[0] = GridPane.class;
		param[1] = int.class;
		param[2] = int.class;
		param[3] = double.class;
		param[4] = double.class;
		String nombreClase = "vista.Vista" + material.getClass().getSimpleName();

		try {
			Class<?> clase = Class.forName(nombreClase);
			Method metodo = clase.getDeclaredMethod("Instancia", param);
			dibujable = (Dibujable) metodo.invoke(null, pane, x, y, ancho, alto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dibujar() {
		dibujable.dibujar();
	}
}
