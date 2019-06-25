package vista;

import eventos.BotonAbajoHandler;
import eventos.BotonArribaHandler;
import eventos.BotonConstruirHandler;
import eventos.BotonDerechaHandler;
import eventos.BotonIzquierdaHandler;
import eventos.DiamanteClickHandler;
import eventos.FabricadorClickHandler;
import eventos.MaderaClickHandler;
import eventos.MetalClickHandler;
import eventos.PiedraClickHandler;
import excepciones.GameOverException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
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
	VistaMapa vistaMapa;
	GridPane paneIzquierdo;
	GridPane paneDerecho;
	FlowPane paneInferior;

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

		paneDerecho.setGridLinesVisible(true); // TODO sacar
		paneDerecho.setHgap(12);
		paneDerecho.setVgap(12);

		// TODO sacar
		Text lblH = new Text(
				"#Herramientas: " + mineCraft.getJugador().getInventarioHerramientas().cantidadDeHerramientas());
		lblH.setFont(Font.font("Arial", FontWeight.BOLD, 16));
		paneDerecho.add(lblH, 0, 14, 3, 1);
	}

	private void setPaneInferior() {
		ImageView imageView;
		InventarioHerramientas inventario=mineCraft.getJugador().getInventarioHerramientas();

//		Rectangle fondo = new Rectangle(0, 0, 60, 32); // TODO sacar
//		fondo.setFill(Color.BLUE);
		paneInferior.getChildren().clear();

		for (int i = 0; i < inventario.cantidadDeHerramientas(); i++) {
			imageView = new ImageView();
			imageView.setImage(new Image("file:src/vista/images/"+ inventario.obtenerHerramienta(i).getClass().getSimpleName() + ".png"));
			paneInferior.getChildren().add(imageView);
		}
	}

	private void ponerMateriales() {
		ImageView imageView;

		if (mineCraft.getJugador().materialSeleccionado() == Madera.class) {
			Rectangle fondo = new Rectangle(0, 0, 60, 32); // TODO ajustar
			fondo.setFill(Color.RED);
			paneDerecho.add(fondo, 0, 0);
		}
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Madera.png"));
		paneDerecho.add(imageView, 0, 0);
//		imageView.setTranslateX(10);
//		imageView.setTranslateY(0);
		imageView.setOnMouseClicked(new MaderaClickHandler(mineCraft, this));

		Text lblMaderas = new Text("x" + mineCraft.getJugador().cantidadDeMadera());
		lblMaderas.setFill(Color.BLACK);
		lblMaderas.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblMaderas, 1, 0);

		if (mineCraft.getJugador().materialSeleccionado() == Piedra.class) {
			Rectangle fondo = new Rectangle(0, 0, 60, 32); // TODO ajustar
			fondo.setFill(Color.RED);
			paneDerecho.add(fondo, 0, 1);
		}
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Piedra.png"));
		paneDerecho.add(imageView, 0, 1);
		imageView.setOnMouseClicked(new PiedraClickHandler(mineCraft, this));

		Text lblPiedras = new Text("x" + mineCraft.getJugador().cantidadDePiedra());
		lblPiedras.setFill(Color.BLACK);
		lblPiedras.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblPiedras, 1, 1);

		if (mineCraft.getJugador().materialSeleccionado() == Metal.class) {
			Rectangle fondo = new Rectangle(0, 0, 60, 32); // TODO ajustar
			fondo.setFill(Color.RED);
			paneDerecho.add(fondo, 0, 2);
		}
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Metal.png"));
		paneDerecho.add(imageView, 0, 2);
		imageView.setOnMouseClicked(new MetalClickHandler(mineCraft, this));

		Text lblMetales = new Text("x" + mineCraft.getJugador().cantidadDeMetal());
		lblMetales.setFill(Color.BLACK);
		lblMetales.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblMetales, 1, 2);

		if (mineCraft.getJugador().materialSeleccionado() == Diamante.class) {
			Rectangle fondo = new Rectangle(0, 0, 60, 32); // TODO ajustar
			fondo.setFill(Color.RED);
			paneDerecho.add(fondo, 0, 3);
		}
		imageView = new ImageView();
		imageView.setImage(new Image("file:src/vista/images/Diamante.png"));
		paneDerecho.add(imageView, 0, 3);
		imageView.setOnMouseClicked(new DiamanteClickHandler(mineCraft, this));

		Text lblDiamantes = new Text("x" + mineCraft.getJugador().cantidadDeDiamante());
		lblDiamantes.setFill(Color.BLACK);
		lblDiamantes.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		paneDerecho.add(lblDiamantes, 1, 3);
	}

	private void ponerFabricadorHerramientas() {
		FabricadorHerramientas fabricador = mineCraft.getJugador().getFabricadorHerramientas();

		Rectangle fondo;
		ImageView imageView;

		Material material;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				fondo = new Rectangle(0, 0, 50, 40); // TODO ajustar
				fondo.setFill(Color.GREEN);
				paneDerecho.add(fondo, i, j + 5);

				if (fabricador.obtener(i, j).getClass() == MaterialNull.class) {
					imageView = new ImageView();
					imageView.setImage(new Image("file:src/vista/images/question.png"));
					paneDerecho.add(imageView, i, j + 5);
					imageView.setOnMouseClicked(new FabricadorClickHandler(mineCraft, this, i, j));

				} else {
					material = fabricador.obtener(i, j);
					imageView = new ImageView();
					imageView.setImage(
							new Image("file:src/vista/images/" + material.getClass().getSimpleName() + ".png"));
					paneDerecho.add(imageView, i, j + 5);
				}
			}
	}

	private void ponerBotones() {

		Button btnArriba = new Button();
		btnArriba.setText("Arriba");
		BotonArribaHandler arribaHandler = new BotonArribaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnArriba.setOnAction(arribaHandler);
		this.paneDerecho.add(btnArriba, 1, 10);

		Button btnIzquierda = new Button();
		btnIzquierda.setText("Izquierda");
		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnIzquierda.setOnAction(izquierdaHandler);
		this.paneDerecho.add(btnIzquierda, 0, 11);

		Button btnDerecha = new Button();
		btnDerecha.setText("Derecha");
		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnDerecha.setOnAction(derechaHandler);
		this.paneDerecho.add(btnDerecha, 2, 11);

		Button btnAbajo = new Button();
		btnAbajo.setText("Abajo");
		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnAbajo.setOnAction(abajoHandler);
		this.paneDerecho.add(btnAbajo, 1, 12);

		Button btnConstruir = new Button();
		btnConstruir.setText("Construir");
		BotonConstruirHandler construirHandler = new BotonConstruirHandler(mineCraft, this);
		btnConstruir.setOnAction(construirHandler);
		this.paneDerecho.add(btnConstruir, 0, 8);
	}

	private void setBorder(Pane pane) {
		pane.setStyle("-fx-padding: 2;-fx-border-style: solid inside;-fx-border-width: 7;"
				+ "-fx-border-insets: 2;-fx-border-radius: 10;-fx-border-color:BLACK;");
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