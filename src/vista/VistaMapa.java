package vista;

import java.util.ArrayList;

import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VistaMapa {

	private ArrayList<VistaCelda> vistaCeldas;
	private GridPane pane;
	private int cantFilas;
	private int cantColumnas;
	private double anchoCelda;
	private double altoCelda;

	public VistaMapa(ContenedorPrincipal contenedorPrincipal, GridPane pane) {
		cantFilas = 16;
		cantColumnas = 24;
		anchoCelda = 36;
		altoCelda = 36;

		this.pane = pane;

		vistaCeldas = new ArrayList<VistaCelda>(); // TODO pedir al modelo

		for (int x = 3; x < 12; x++) {
			for (int y = 4; y < 9; y++) {
				Madera madera = new Madera();
				vistaCeldas.add(new VistaCelda(madera, contenedorPrincipal, pane, x, y, anchoCelda, altoCelda));
			}
		}

		for (int x = 8; x < 10; x++) {
			for (int y = 11; y < 14; y++) {
				Piedra piedra = new Piedra();
				vistaCeldas.add(new VistaCelda(piedra, contenedorPrincipal, pane, x, y, anchoCelda, altoCelda));
			}
		}

		for (int x = 20; x < 22; x++) {
			for (int y = 14; y < 16; y++) {
				Metal metal = new Metal();
				vistaCeldas.add(new VistaCelda(metal, contenedorPrincipal, pane, x, y, anchoCelda, altoCelda));
			}
		}

		for (int x = 20; x < 22; x++) {
			for (int y = 1; y < 3; y++) {
				Diamante diamante = new Diamante();
				vistaCeldas.add(new VistaCelda(diamante, contenedorPrincipal, pane, x, y, anchoCelda, altoCelda));
			}
		}
	}

	public void dibujar() {
		this.clean();
		for (VistaCelda vistaCelda : vistaCeldas)
			vistaCelda.dibujar();
	}

	public void clean() {
		pane.setHgap(0);
		pane.setVgap(0);

		for (int x = 0; x < cantColumnas; x++)
			pane.add(new Rectangle(0, 0, anchoCelda, altoCelda), x, 0);
		for (int y = 0; y < cantFilas; y++)
			pane.add(new Rectangle(0, 0, anchoCelda, altoCelda), 0, y);
		Rectangle fondo = new Rectangle(0, 0, cantColumnas * anchoCelda, cantFilas * altoCelda);
		fondo.setFill(Color.CHARTREUSE.desaturate());
		pane.add(fondo, 0, 0, cantColumnas, cantFilas);

		Image image = new Image("file:src/vista/images/Fondo.png");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		pane.add(imageView, 0, 0, cantColumnas, cantFilas);
		imageView.setTranslateX((cantColumnas * anchoCelda - image.getWidth()) / 2);

	}

	public void update() {
		dibujar();
	}
}