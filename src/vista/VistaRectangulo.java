package vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class VistaRectangulo implements Dibujable {
	private int x;
	private int y;
	private GridPane pane;

	public VistaRectangulo(GridPane pane, int x, int y) {
		this.pane = pane;
		this.x = x;
		this.y = y;
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