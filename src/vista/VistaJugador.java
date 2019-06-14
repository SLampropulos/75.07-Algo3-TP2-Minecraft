package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class VistaJugador {
	private int x;
	private int y;
	private GridPane pane;

	public VistaJugador(GridPane pane, int x, int y, double ancho, double alto) {
		this.pane = pane;
		this.x = x;
		this.y = y;
	}

	public void dibujar() {
		this.ponerImagen("file:src/vista/images/Jugador.png");
	}
	
	public void ponerImagen(String sImagen) {
		Image image = new Image(sImagen);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		this.pane.add(imageView, x, y);
		imageView.setTranslateX(10);
		imageView.setTranslateY(0);
	}
}