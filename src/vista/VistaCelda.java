package vista;

import java.lang.reflect.Constructor;
import Materiales.Material;
import javafx.scene.layout.GridPane;

public class VistaCelda {
	private Dibujable dibujable;

	public VistaCelda(Material material, GridPane pane, int x, int y) {

		String nombreClase = "vista.Vista" + material.getClass().getSimpleName();

		try {
			Class<?> clase = Class.forName(nombreClase);
			Constructor<?> constructor = clase.getConstructor(GridPane.class, int.class, int.class);
			dibujable = (Dibujable) constructor.newInstance(pane, x, y);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dibujar() {
		dibujable.dibujar();
	}
}
