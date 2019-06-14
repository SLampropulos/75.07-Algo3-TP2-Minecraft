package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class VistaRectangulo implements Dibujable {
	private int x;
	private int y;
	private double ancho;
	private double alto;
	private GridPane pane;

	public VistaRectangulo(GridPane pane, int x, int y, double ancho, double alto) {
		this.pane = pane;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}

	public void pintar(Color color) {
		Rectangle fondo = new Rectangle(0, 0, ancho, alto);
		fondo.setFill(color);
		pane.add(fondo, x, y);
	}

	public void ponerImagen(String sImagen) {
		Image image = new Image(sImagen);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		this.pane.add(imageView, x, y);
		imageView.setTranslateX(10);
		imageView.setTranslateY(0);
	}


	public void dibujar() {
	}

}