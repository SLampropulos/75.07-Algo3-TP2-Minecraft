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

public class ContenedorPrincipal extends BorderPane {

	private MineCraft mineCraft;
	private Stage stage;
	private VistaMapa vistaMapa;
	private GridPane paneIzquierdo;
	private GridPane paneDerecho;
	private FlowPane paneInferior;

	public ContenedorPrincipal(MineCraft mineCraft, Stage stage) {
		this.mineCraft = mineCraft;
		this.stage = stage;
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

		ponerMateriales();

		ponerFabricadorHerramientas();

		ponerBotones();

//		paneDerecho.setGridLinesVisible(true);
		paneDerecho.setHgap(6);
		paneDerecho.setVgap(8);

	}

	private void setPaneInferior() {
		ImageView imageView;
		InventarioHerramientas inventario = mineCraft.getJugador().getInventarioHerramientas();
		Rectangle fondo = new Rectangle(0, 0, 52, 36);
		fondo.setFill(Color.BLUE);


		paneInferior.getChildren().clear();

		for (int i = 0; i < inventario.cantidadDeHerramientas(); i++) {
			imageView = new ImageView();
			imageView.setImage(new Image(
					"file:src/vista/images/" + inventario.obtenerHerramienta(i).getClass().getSimpleName() + ".png"));
			if(inventario.obtenerHerramienta(i) == mineCraft.getJugador().getEquipado())
				imageView.setEffect(new DropShadow(10,Color.BLUE));
			paneInferior.getChildren().add(imageView);
			imageView.setOnMouseClicked(new HerramientaClickHandler(mineCraft, this, i));
		}
	}

	private void ponerMateriales() {
		ImageView imageView;
		Rectangle fondo = new Rectangle(0, 0, 52, 36);
		fondo.setFill(Color.RED);

		if (mineCraft.getJugador().materialSeleccionado() == Madera.class)
			paneDerecho.add(fondo, 0, 0);
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Madera.png"));
		paneDerecho.add(imageView, 0, 0);
		GridPane.setHalignment(imageView, HPos.CENTER);
		imageView.setOnMouseClicked(new MaderaClickHandler(mineCraft, this));

		Text lblMaderas = new Text("x" + mineCraft.getJugador().cantidadDeMadera());
		lblMaderas.setFill(Color.BLACK);
		lblMaderas.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblMaderas, 1, 0);

		if (mineCraft.getJugador().materialSeleccionado() == Piedra.class)
			paneDerecho.add(fondo, 0, 1);
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Piedra.png"));
		paneDerecho.add(imageView, 0, 1);
		GridPane.setHalignment(imageView, HPos.CENTER);
		imageView.setOnMouseClicked(new PiedraClickHandler(mineCraft, this));

		Text lblPiedras = new Text("x" + mineCraft.getJugador().cantidadDePiedra());
		lblPiedras.setFill(Color.BLACK);
		lblPiedras.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblPiedras, 1, 1);

		if (mineCraft.getJugador().materialSeleccionado() == Metal.class)
			paneDerecho.add(fondo, 0, 2);
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Metal.png"));
		paneDerecho.add(imageView, 0, 2);
		GridPane.setHalignment(imageView, HPos.CENTER);
		imageView.setOnMouseClicked(new MetalClickHandler(mineCraft, this));

		Text lblMetales = new Text("x" + mineCraft.getJugador().cantidadDeMetal());
		lblMetales.setFill(Color.BLACK);
		lblMetales.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblMetales, 1, 2);

		if (mineCraft.getJugador().materialSeleccionado() == Diamante.class)
			paneDerecho.add(fondo, 0, 3);
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Diamante.png"));
		paneDerecho.add(imageView, 0, 3);
		GridPane.setHalignment(imageView, HPos.CENTER);
		imageView.setOnMouseClicked(new DiamanteClickHandler(mineCraft, this));

		Text lblDiamantes = new Text("x" + mineCraft.getJugador().cantidadDeDiamante());
		lblDiamantes.setFill(Color.BLACK);
		lblDiamantes.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblDiamantes, 1, 3);

		
		GridPane.setHalignment(fondo, HPos.CENTER);
	}

	private void ponerFabricadorHerramientas() {
		FabricadorHerramientas fabricador = mineCraft.getJugador().getFabricadorHerramientas();

		Rectangle fondo;
		ImageView imageView;

		Material material;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				fondo = new Rectangle(0, 0, 68, 40); // TODO ajustar
				fondo.setFill(Color.GREEN);
				paneDerecho.add(fondo, i, j + 5);
				imageView = new ImageView();

				if (fabricador.obtener(i, j).getClass() == MaterialNull.class) {
					imageView.setImage(new Image("file:src/vista/images/question.png"));
					paneDerecho.add(imageView, i, j + 5);
					imageView.setOnMouseClicked(new FabricadorClickHandler(mineCraft, this, i, j));
				} else {
					material = fabricador.obtener(i, j);
					imageView.setImage(
							new Image("file:src/vista/images/" + material.getClass().getSimpleName() + ".png"));
					paneDerecho.add(imageView, i, j + 5);
				}
				GridPane.setHalignment(imageView, HPos.CENTER);
			}
	}

	
	private void ponerBotones() {

		BotonConstruirHandler construirHandler = new BotonConstruirHandler(mineCraft, this);
		Boton btnConstruir = new Boton(construirHandler);
		paneDerecho.add(btnConstruir, 0, 8);
		GridPane.setHalignment(btnConstruir, HPos.CENTER);


		BotonCancelarHandler cancelarHandler = new BotonCancelarHandler(mineCraft, this);
		Boton btnCancelar = new Boton(cancelarHandler);
		paneDerecho.add(btnCancelar, 2, 8);
		GridPane.setHalignment(btnCancelar, HPos.CENTER);

		
		
		BotonArribaHandler arribaHandler = new BotonArribaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		Boton btnArriba = new Boton(arribaHandler);
		paneDerecho.add(btnArriba, 1, 14);
		GridPane.setHalignment(btnArriba, HPos.CENTER);

		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		Boton btnIzquierda = new Boton(izquierdaHandler);
		paneDerecho.add(btnIzquierda, 0, 15);
		GridPane.setHalignment(btnIzquierda, HPos.CENTER);

		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		Boton btnDerecha = new Boton(derechaHandler);
		paneDerecho.add(btnDerecha, 2, 15);
		GridPane.setHalignment(btnDerecha, HPos.CENTER);

		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		Boton btnAbajo = new Boton(abajoHandler);
		this.paneDerecho.add(btnAbajo, 1, 16);
		GridPane.setHalignment(btnAbajo, HPos.CENTER);
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
		setPaneIzquierdo();
		setPaneDerecho();
		setPaneInferior();
	}

}