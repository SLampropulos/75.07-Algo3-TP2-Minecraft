package vista;

import eventos.BotonAbajoHandler;
import eventos.BotonArribaHandler;
import eventos.BotonDerechaHandler;
import eventos.BotonIzquierdaHandler;
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

public class ContenedorPrincipal extends BorderPane {

	private MineCraft mineCraft;
	VistaMapa vistaMapa;
	Canvas canvas;
	GridPane paneIzquierdo;
	Label dineroDisponible;
	GridPane datosYBotones;
	Stage stage;
	Label turno;

	public ContenedorPrincipal(MineCraft mineCraft, Stage stage) {
		this.mineCraft = mineCraft;
		this.setPanelIzquierdo();
		this.setPanelDerecho();
	}

	private void setPanelIzquierdo() {
		paneIzquierdo = new GridPane();
		vistaMapa = new VistaMapa(mineCraft, this, paneIzquierdo);
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

		Text titulo = new Text("Materiales: " + mineCraft.getJugador().getMateriales().size());
		titulo.setFill(Color.BLACK);
		titulo.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(titulo, 0, 0, 3, 1);

		this.ponerBotones();

		this.datosYBotones.setAlignment(Pos.CENTER);
		this.setCenter(datosYBotones);
	}

	private void ponerBotones() {

		Button btnArriba = new Button();
		btnArriba.setText("Arriba");
		BotonArribaHandler arribaHandler = new BotonArribaHandler(mineCraft.getJugador(), this);
		btnArriba.setOnAction(arribaHandler);
		this.datosYBotones.add(btnArriba, 1, 10);

		Button btnIzquierda = new Button();
		btnIzquierda.setText("Izquierda");
		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.getJugador(), this);
		btnIzquierda.setOnAction(izquierdaHandler);
		this.datosYBotones.add(btnIzquierda, 0, 11);

		Button btnDerecha = new Button();
		btnDerecha.setText("Derecha");
		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(mineCraft.getJugador(), this);
		btnDerecha.setOnAction(derechaHandler);
		this.datosYBotones.add(btnDerecha, 2, 11);

		Button btnAbajo = new Button();
		btnAbajo.setText("Abajo");
		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(mineCraft.getJugador(), this);
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