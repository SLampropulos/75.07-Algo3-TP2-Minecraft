package vista;

import java.lang.reflect.Constructor;
import herramientas.Herramienta;
import javafx.scene.layout.GridPane;

//TODO sacar vistas herramientas?

public class VistaCeldaHerramienta {
	private Dibujable dibujable;

	public VistaCeldaHerramienta(Herramienta herramienta, GridPane pane, int x, int y) {

		String nombreClase = "vista.Vista" + herramienta.getClass().getSimpleName();

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
