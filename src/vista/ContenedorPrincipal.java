package vista;

import eventos.*;
import excepciones.GameOverException;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import juego.MineCraft;
import materiales.Diamante;
import materiales.Madera;
import materiales.Material;
import materiales.MaterialNull;
import materiales.Metal;
import materiales.Piedra;
import personaje.FabricadorHerramientas;
import personaje.InventarioHerramientas;
import personaje.Jugador;

public class ContenedorPrincipal extends BorderPane {

	private MineCraft mineCraft;
	private Stage stage;
	private VistaMapa vistaMapa;
	private GridPane paneIzquierdo;
	private GridPane paneDerecho;
	private FlowPane paneInferior;
	private Jugador jugador;

	public ContenedorPrincipal(MineCraft mineCraft, Stage stage) {
		this.mineCraft = mineCraft;
		this.stage = stage;

		jugador = mineCraft.getJugador();

		paneIzquierdo = new GridPane();
		paneDerecho = new GridPane();
		paneInferior = new FlowPane();
		setCenter(paneDerecho);
		setBottom(paneInferior);

		vistaMapa = new VistaMapa(mineCraft, this, paneIzquierdo);

		setBorder(paneIzquierdo);
		setBorder(paneDerecho);
		setBorder(paneInferior);

		setPaneIzquierdo();
		setPaneDerecho();
		setPaneInferior();

		Image fondo = new Image("file:src/vista/images/Mono2.jpg");
		BackgroundImage imagenDeFondo = new BackgroundImage(fondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1, 1, true, true, false, false));
		setBackground(new Background(imagenDeFondo));
	}

	private void setPaneIzquierdo() {
		vistaMapa.dibujar();
		paneIzquierdo.setAlignment(Pos.CENTER);
		setLeft(paneIzquierdo);
	}

	private void setPaneDerecho() {
		paneDerecho.getChildren().clear();
		paneDerecho.setAlignment(Pos.CENTER);

		dibujarMaterialesDisponibles();

		dibujarFabricadorHerramientas();

		dibujarBotones();

//		paneDerecho.setGridLinesVisible(true);
		paneDerecho.setHgap(6);
		paneDerecho.setVgap(8);

	}

	private void setPaneInferior() {
		ImageView imageView;
		InventarioHerramientas inventario = jugador.getInventarioHerramientas();

		paneInferior.getChildren().clear();

		for (int i = 0; i < inventario.cantidadDeHerramientas(); i++) {
			imageView = new ImageView();
			imageView.setImage(new Image(
					"file:src/vista/images/" + inventario.obtenerHerramienta(i).getClass().getSimpleName() + ".png"));
			if (inventario.obtenerHerramienta(i) == jugador.getEquipado())
				imageView.setEffect(new DropShadow(10, Color.RED));
			paneInferior.getChildren().add(imageView);
			imageView.setOnMouseClicked(new HerramientaClickHandler(mineCraft, this, i));
		}
	}

	private void etiquetarMaterial(int cantidad, int columna, int fila) {
		Text etiqueta = new Text("x" + cantidad);
		etiqueta.setFill(Color.BLACK);
		etiqueta.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(etiqueta, columna, fila);
	}

	private void resaltarMaterialSeleccionado() {
		Rectangle fondo = new Rectangle(0, 0, 52, 36);
		fondo.setFill(Color.RED);

		if (jugador.materialSeleccionado() == Madera.class)
			paneDerecho.add(fondo, 0, 0);
		if (jugador.materialSeleccionado() == Piedra.class)
			paneDerecho.add(fondo, 0, 1);
		if (jugador.materialSeleccionado() == Metal.class)
			paneDerecho.add(fondo, 0, 2);
		if (jugador.materialSeleccionado() == Diamante.class)
			paneDerecho.add(fondo, 0, 3);
		GridPane.setHalignment(fondo, HPos.CENTER);
	}

	private ImageView dibujarIconoMaterial(String nombreMaterial, int columna, int fila) {
		
		ImageView imageView;
		imageView = new ImageView();

		imageView.setImage(new Image("file:src/vista/images/" + nombreMaterial + ".png"));
		paneDerecho.add(imageView, columna, fila);
		GridPane.setHalignment(imageView, HPos.CENTER);

		return imageView;
	}

	private void dibujarMaterialesDisponibles() {
		
		resaltarMaterialSeleccionado();

		ImageView imageView;

		imageView = dibujarIconoMaterial("Madera", 0, 0);
		imageView.setOnMouseClicked(new MaderaClickHandler(mineCraft, this));
		etiquetarMaterial(jugador.cantidadDeMadera(), 1, 0);

		imageView = dibujarIconoMaterial("Piedra", 0, 1);
		imageView.setOnMouseClicked(new PiedraClickHandler(mineCraft, this));
		etiquetarMaterial(jugador.cantidadDePiedra(), 1, 1);

		imageView = dibujarIconoMaterial("Metal", 0, 2);
		imageView.setOnMouseClicked(new MetalClickHandler(mineCraft, this));
		etiquetarMaterial(jugador.cantidadDeMetal(), 1, 2);

		imageView = dibujarIconoMaterial("Diamante", 0, 3);
		imageView.setOnMouseClicked(new DiamanteClickHandler(mineCraft, this));
		etiquetarMaterial(jugador.cantidadDeDiamante(), 1, 3);
	}

	private void dibujarFondoFabricador(int columna, int fila) {
		Rectangle fondo = new Rectangle(0, 0, 68, 40);
		fondo.setFill(Color.GREEN);
		paneDerecho.add(fondo, columna, fila);
	}

	private void dibujarFabricadorHerramientas() {
		
		FabricadorHerramientas fabricador = jugador.getFabricadorHerramientas();

		ImageView imageView;

		Material material;
		for (int columna = 0; columna < 3; columna++)
			for (int fila = 0; fila < 3; fila++) {

				dibujarFondoFabricador(columna, fila + 5);
				material = fabricador.obtener(columna, fila);
				imageView = dibujarIconoMaterial(material.getClass().getSimpleName(), columna, fila + 5);

				if (fabricador.obtener(columna, fila).getClass() == MaterialNull.class) {
					imageView.setOnMouseClicked(new FabricadorClickHandler(mineCraft, this, columna, fila));
				}
			}
	}

	private void dibujarBotones() {

		BotonConstruirHandler construirHandler = new BotonConstruirHandler(mineCraft, this);
		new Boton(construirHandler, paneDerecho, 0, 8);

		BotonCancelarHandler cancelarHandler = new BotonCancelarHandler(mineCraft, this);
		new Boton(cancelarHandler, paneDerecho, 2, 8);

		BotonArribaHandler arribaHandler = new BotonArribaHandler(jugador, this, vistaMapa.getVistaJugador());
		new Boton(arribaHandler, paneDerecho, 1, 14);

		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(jugador, this, vistaMapa.getVistaJugador());
		new Boton(izquierdaHandler, paneDerecho, 0, 15);

		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(jugador, this, vistaMapa.getVistaJugador());
		new Boton(derechaHandler, paneDerecho, 2, 15);

		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(jugador, this, vistaMapa.getVistaJugador());
		new Boton(abajoHandler, paneDerecho, 1, 16);
	}

	private void setBorder(Pane pane) {
		pane.setStyle("-fx-padding: 2;-fx-border-style: solid inside;-fx-border-width: 5;"
				+ "-fx-border-insets: 2;-fx-border-radius: 1;-fx-border-color:DARKBLUE;");
	}

	public void refrescar() {
		try {
			mineCraft.actualizar();
		} catch (GameOverException e) {
			PantallaGameOver pantallaGameOver = new PantallaGameOver();
			stage.setScene(new EscenaJuego(pantallaGameOver));
		}
		jugador = mineCraft.getJugador();
		setPaneIzquierdo();
		setPaneDerecho();
		setPaneInferior();
	}
}