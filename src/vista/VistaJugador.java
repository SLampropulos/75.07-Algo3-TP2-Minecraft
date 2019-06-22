package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class VistaJugador {
	private int x;
	private int y;
	private GridPane pane;

	private String imagen;

	public VistaJugador(GridPane pane, int x, int y, double ancho, double alto) {
		this.pane = pane;
		this.x = x;
		this.y = y;
		this.imagen = "file:src/vista/images/JugadorArriba.png";
	}

	public void setImagen(String nuevaImagen) {
		this.imagen = nuevaImagen;
	}

	public void dibujar(int x, int y) {
		this.x = x;
		this.y = y;
		this.ponerImagen(this.imagen);
	}
	
	public void ponerImagen(String sImagen) {
		Image image = new Image(sImagen);
		ImageView imageView = new ImageView();
		imageView.setFitHeight(32);
		imageView.setFitWidth(32);
		imageView.setImage(image);
		this.pane.add(imageView, x, y);
		imageView.setTranslateX(10);
		imageView.setTranslateY(0);
	}
}