package vista;

import Materiales.Material;
import Personaje.Jugador;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class VistaJugador {
	private Jugador jugador;
	private int x;
	private int y;
	private double ancho;
	private double alto;
	private GridPane pane;

	public VistaJugador(Jugador jugador, GridPane pane, int x, int y, double ancho, double alto) {
//		super(material, pane, x, y, ancho, alto);
		this.jugador = jugador;
		this.pane = pane;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}

	public void dibujar() {
//		pintar(Color.BROWN);
		this.ponerImagen("file:src/vista/images/Jugador.png");
//		etiquetar("Madera", Color.BLACK);
//		super.dibujar();
//		this.ponerBotonInfo("xxx", "Accion");
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