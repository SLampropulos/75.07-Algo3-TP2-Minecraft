package vista;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import juego.Celda;
import juego.MineCraft;
import personaje.Jugador;

public class VistaMapa {

	//Definicion de constantes
	static final String DIRECCION_FONDO_JUEGO = "file:src/vista/images/Fondo.png";
	
	//Declaración de variables
	private ArrayList<VistaCelda> vistaCeldas;
	private GridPane panel;
	private int cantFilas;
	private int cantColumnas;
	private double anchoCelda;
	private double altoCelda;
	private Celda[][] grilla;
	private VistaJugador vistaJugador;
	private MineCraft mineCraft;

	public VistaMapa(MineCraft mineCraft, ContenedorPrincipal contenedorPrincipal, GridPane panel) {
		cantFilas = 16;
		cantColumnas = 24;
		anchoCelda = 36;
		altoCelda = 36;

		this.panel = panel;

		vistaCeldas = new ArrayList<VistaCelda>();
		grilla = mineCraft.obtenerMapa().obtenerCeldas();

		this.actualizarVistaCeldas();

//		Jugador jugador = mineCraft.obtenerJugador();
		vistaJugador = new VistaJugador(panel, mineCraft.obtenerMapa().obtenerColumnaJugador(),
				mineCraft.obtenerMapa().obtenerFilaJugador(), anchoCelda, altoCelda);
		this.mineCraft = mineCraft;
	}

	public VistaJugador obtenerVistaJugador() {
		return vistaJugador;
	}
	
	public void dibujar() {
		this.actualizarVistaCeldas();
		this.limpiar();
		for (VistaCelda vistaCelda : vistaCeldas)
			vistaCelda.dibujar();
		vistaJugador.dibujar(mineCraft.obtenerMapa().obtenerColumnaJugador(), mineCraft.obtenerMapa().obtenerFilaJugador());
	}
	
	private void actualizarVistaCeldas() {
		ArrayList<VistaCelda> nuevas = new ArrayList<>();
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 24; j++) {
				nuevas.add(new VistaCelda(grilla[i][j].obtenerMaterial(), panel, j, i));
			}
		}
		this.vistaCeldas = nuevas;
}

	private void limpiar() {
		for (int x = 0; x < cantColumnas; x++)
			panel.add(new Rectangle(0, 0, anchoCelda, altoCelda), x, 0);
		for (int y = 0; y < cantFilas; y++)
			panel.add(new Rectangle(0, 0, anchoCelda, altoCelda), 0, y);
		Rectangle fondo = new Rectangle(0, 0, cantColumnas * anchoCelda, cantFilas * altoCelda);
		fondo.setFill(Color.CHARTREUSE.desaturate());
		panel.add(fondo, 0, 0, cantColumnas, cantFilas);

		Image image = new Image(DIRECCION_FONDO_JUEGO);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		panel.add(imageView, 0, 0, cantColumnas, cantFilas);
		imageView.setTranslateX((cantColumnas * anchoCelda - image.getWidth()) / 2);

	}
}
