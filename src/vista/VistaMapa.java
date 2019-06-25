package vista;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import juego.Celda;
import juego.MineCraft;
import materiales.Material;
import materiales.MaterialNull;


public class VistaMapa {

	private ArrayList<VistaCelda> vistaCeldas;
	private GridPane pane;
	private int cantFilas;
	private int cantColumnas;
	private double anchoCelda;
	private double altoCelda;
	private Celda[][] grilla;
	private VistaJugador vistaJugador;
	private MineCraft mineCraft;

	public VistaMapa(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal, GridPane pane) {
		cantFilas = 16;
		cantColumnas = 24;
		anchoCelda = 36;
		altoCelda = 36;

		this.pane = pane;

		vistaCeldas = new ArrayList<VistaCelda>();
		grilla = mineCraft.getMapa().getCeldas();

		this.actualizarVistaCeldas();

		vistaJugador = new VistaJugador(pane, mineCraft.getMapa().getColumnaJugador(),
				mineCraft.getMapa().getFilaJugador(), anchoCelda, altoCelda);
		this.mineCraft = mineCraft;
	}

	public VistaJugador getVistaJugador() {
		return vistaJugador;
	}

	public void dibujar() {
		this.actualizarVistaCeldas();
		this.limpiar();
		for (VistaCelda vistaCelda : vistaCeldas)
			vistaCelda.dibujar();
		vistaJugador.dibujar(mineCraft.getMapa().getColumnaJugador(), mineCraft.getMapa().getFilaJugador());
	}

	private void actualizarVistaCeldas() {
		Material material;
		ArrayList<VistaCelda> nuevas = new ArrayList<>();
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 24; j++) {
				material = grilla[i][j].getMaterial();
//				if (material.getClass() != MaterialNull.class) //TODO dejar?
					nuevas.add(new VistaCelda(material, pane, j, i));
			}
		}
		this.vistaCeldas = nuevas;
	}

	private void limpiar() {
		pane.getChildren().clear();
		for (int x = 0; x < cantColumnas; x++)  //TODO fijar sin estos inventos
			pane.add(new Rectangle(0, 0, anchoCelda, altoCelda), x, 0);
		for (int y = 0; y < cantFilas; y++)
			pane.add(new Rectangle(0, 0, anchoCelda, altoCelda), 0, y);
//		Rectangle fondo = new Rectangle(0, 0, cantColumnas * anchoCelda, cantFilas * altoCelda);
//		fondo.setFill(Color.CHARTREUSE.desaturate());
//		pane.add(fondo, 0, 0, cantColumnas, cantFilas);

		Image image = new Image("file:src/vista/images/Fondo.png");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		pane.add(imageView, 0, 0, cantColumnas, cantFilas);
		imageView.setTranslateX((cantColumnas * anchoCelda - image.getWidth()) / 2);
	}
}