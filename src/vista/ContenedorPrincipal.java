package vista;

import eventos.BotonAbajoHandler;
import eventos.BotonArribaHandler;
import eventos.BotonDerechaHandler;
import eventos.BotonIzquierdaHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import juego.MineCraft;
import materiales.Madera;
import personaje.FabricadorHerramientas;

public class ContenedorPrincipal extends BorderPane {

	private MineCraft mineCraft;
	VistaMapa vistaMapa;
	GridPane paneIzquierdo;
	GridPane datosYBotones;

	public ContenedorPrincipal(MineCraft mineCraft, Stage stage) {
		this.mineCraft = mineCraft;
		this.paneIzquierdo = new GridPane();

		vistaMapa = new VistaMapa(mineCraft, this, paneIzquierdo);
		this.setPanelIzquierdo();
		this.setPanelDerecho();
	}

	private void setPanelIzquierdo() {
		vistaMapa.dibujar();
		paneIzquierdo.setAlignment(Pos.CENTER);
		this.setBorder(paneIzquierdo);
		this.setLeft(paneIzquierdo);
	}

	private void setPanelDerecho() {
		this.datosYBotones = new GridPane();

		Image fondo = new Image("file:src/vista/images/Mono2.jpg");
		BackgroundImage imagenDeFondo = new BackgroundImage(fondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1, 1, true, true, false, false));
		setBackground(new Background(imagenDeFondo));
		this.setBorder(datosYBotones);

		ponerMateriales();

		ponerFabricadorHerramientas();

		ponerBotones();

		datosYBotones.setAlignment(Pos.CENTER);
		setCenter(datosYBotones);
		datosYBotones.setGridLinesVisible(true); // TODO sacar
//		datosYBotones.setPadding(new Insets(10, 10, 10, 10));
		datosYBotones.setHgap(12);
		datosYBotones.setVgap(12);

	}

	private void ponerMateriales() {

		// TODO poner con imagenes
		Text lblMaderas = new Text("Maderas: " + mineCraft.getJugador().cantidadDeMadera());
		lblMaderas.setFill(Color.BLACK);
		lblMaderas.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(lblMaderas, 0, 0, 3, 1);

		Text lblPiedras = new Text("Piedras: " + mineCraft.getJugador().cantidadDePiedra());
		lblPiedras.setFill(Color.BLACK);
		lblPiedras.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(lblPiedras, 0, 1, 3, 1);

		Text lblMetales = new Text("Metal: " + mineCraft.getJugador().cantidadDeMetal());
		lblMetales.setFill(Color.BLACK);
		lblMetales.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(lblMetales, 0, 2, 3, 1);

		Text lblDiamantes = new Text("Diamantes: " + mineCraft.getJugador().cantidadDeDiamante());
		lblDiamantes.setFill(Color.BLACK);
		lblDiamantes.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(lblDiamantes, 0, 3, 3, 1);
	}

	private void ponerFabricadorHerramientas() {
		FabricadorHerramientas fabricador = mineCraft.getJugador().getFabricadorHerramientas();

		VistaCelda[][] matriz = new VistaCelda[3][3];
		Madera madera = new Madera(); // TODO va lo que saque del fabricador
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = new VistaCelda(madera, datosYBotones, i, j + 5);
				matriz[i][j].dibujar();
			}
	}

	private void ponerBotones() {

		Button btnArriba = new Button();
		btnArriba.setText("Arriba");
		BotonArribaHandler arribaHandler = new BotonArribaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnArriba.setOnAction(arribaHandler);
		this.datosYBotones.add(btnArriba, 1, 10);

		Button btnIzquierda = new Button();
		btnIzquierda.setText("Izquierda");
		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnIzquierda.setOnAction(izquierdaHandler);
		this.datosYBotones.add(btnIzquierda, 0, 11);

		Button btnDerecha = new Button();
		btnDerecha.setText("Derecha");
		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnDerecha.setOnAction(derechaHandler);
		this.datosYBotones.add(btnDerecha, 2, 11);

		Button btnAbajo = new Button();
		btnAbajo.setText("Abajo");
		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(mineCraft.getJugador(), this,
				vistaMapa.getVistaJugador());
		btnAbajo.setOnAction(abajoHandler);
		this.datosYBotones.add(btnAbajo, 1, 12);

	}

	private void setBorder(Pane pane) {
		pane.setStyle("-fx-padding: 2;-fx-border-style: solid inside;-fx-border-width: 7;"
				+ "-fx-border-insets: 2;-fx-border-radius: 10;-fx-border-color:BLACK;");
	}

	public void refrescar() {
		this.setPanelIzquierdo();
		this.setPanelDerecho();
	}

}