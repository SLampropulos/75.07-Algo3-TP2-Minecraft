package vista;

import java.util.ArrayList;

import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import Personaje.Jugador;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import juego.Celda;
import juego.MineCraft;

public class VistaMapa {

	private ArrayList<VistaCelda> vistaCeldas;
	private GridPane pane;
	private int cantFilas;
	private int cantColumnas;
	private double anchoCelda;
	private double altoCelda;
	private MineCraft mineCraft;
	private VistaJugador vistaJugador;

	public VistaMapa(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal, GridPane pane) {
		cantFilas = 16;
		cantColumnas = 24;
		anchoCelda = 36;
		altoCelda = 36;

		this.mineCraft = mineCraft;
		this.pane = pane;

		vistaCeldas = new ArrayList<VistaCelda>();
		for (Celda celda : mineCraft.getMapa().getCeldas())
			vistaCeldas.add(new VistaCelda(celda.getMaterial(), pane, celda.getColumna(),
					celda.getFila(), anchoCelda, altoCelda));

		Jugador jugador = mineCraft.getJugador();
		vistaJugador = new VistaJugador(jugador, pane, mineCraft.getMapa().getColumna(jugador),
				mineCraft.getMapa().getFila(jugador), anchoCelda, altoCelda);

	}

	public void dibujar() {
		this.limpiar();
		for (VistaCelda vistaCelda : vistaCeldas)
			vistaCelda.dibujar();
		vistaJugador.dibujar();
	}

	private void limpiar() {
//		pane.setHgap(0);
//		pane.setVgap(0);

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
//		for (Celda celda : mineCraft.getMapa().getCeldas())
//			vistaCeldas.add(new VistaCelda(celda.getMaterial(), contenedorPrincipal, pane, 4, 5, anchoCelda, altoCelda));
		dibujar();
	}
}