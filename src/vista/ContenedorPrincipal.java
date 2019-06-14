package vista;

import eventos.BotonAbajoHandler;
import eventos.BotonArribaHandler;
import eventos.BotonDerechaHandler;
import eventos.BotonIzquierdaHandler;
//import eventos.BotonMoverHandler;
//import eventos.BotonPasarTurnoHandler;
//import eventos.BotonPerderHandler;
//import eventos.BotonTirarDadosHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
//		this.setPanelInformativo();
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
//		datosYBotones.setSpacing(20);

		Image fondo = new Image("file:src/vista/images/Mono2.jpg");
		BackgroundImage imagenDeFondo = new BackgroundImage(fondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1, 1, true, true, false, false));
		setBackground(new Background(imagenDeFondo));
		this.setBorder(datosYBotones);

		Text titulo = new Text("Materiales: ");
		titulo.setFill(Color.BLACK);
		titulo.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(titulo, 0, 0, 3, 1);
//		VBox.setMargin(titulo, new Insets(10));

//		this.mostrarJugadorActual(algoPoly.getJugadorActual().getNombre());

//		for (Jugador jugador : algoPoly.getJugadores()) {
//			Text txtJugador = new Text("Disponible : $ " + String.valueOf(jugador.getDinero()));
//			txtJugador.setFont(Font.font("Arial", FontWeight.BOLD, 20));
//			setearColor(txtJugador, jugador);
//			datosYBotones.getChildren().add(txtJugador);
//			VBox.setMargin(txtJugador, new Insets(15));
//		}

//		this.mostrarDados(algoPoly.getDados().getDado1());
//		this.mostrarDados(algoPoly.getDados().getDado2());
//
//		if (this.algoPoly.hayGanador()) {
//			mostrarAlert("Gano jugador: " + algoPoly.getJugadores().get(0).getNombre());
//	        System.exit(0);  // Sale de la aplicacion
//		}

		this.ponerBotones();

		this.datosYBotones.setAlignment(Pos.CENTER);
		this.setCenter(datosYBotones);
	}

	private void mostrarAlert(String mensaje) {
		Alert dialogoAlerta = new Alert(AlertType.INFORMATION);
		dialogoAlerta.setTitle("");
		dialogoAlerta.setHeaderText(null);
		dialogoAlerta.setContentText(mensaje);
		dialogoAlerta.initStyle(StageStyle.UTILITY);
		dialogoAlerta.showAndWait();
	}

	private void ponerBotones() {

//		if (algoPoly.debeVenderPropiedades()) {
//			this.mostrarAlert("Debe vender Propiedades.");
//		}
//		
//		if (algoPoly.puedeTirarDados()) {
//			Button btnTirarDados = new Button();
//			btnTirarDados.setText("Tirar Dados");
//			BotonTirarDadosHandler tirarDadosHandler = new BotonTirarDadosHandler(this.algoPoly, this);
//			btnTirarDados.setOnAction(tirarDadosHandler);
//			VBox.setMargin(btnTirarDados, new Insets(15));
//			this.datosYBotones.getChildren().add(btnTirarDados);
//		}
//
		Button btnArriba = new Button();
		btnArriba.setText("Arriba");
		BotonArribaHandler arribaHandler = new BotonArribaHandler(mineCraft.getJugador(), this);
		btnArriba.setOnAction(arribaHandler);
//		VBox.setMargin(btnArriba, new Insets(15));
		this.datosYBotones.add(btnArriba, 1, 10);

		Button btnIzquierda = new Button();
		btnIzquierda.setText("Izquierda");
		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.getJugador(), this);
		btnIzquierda.setOnAction(izquierdaHandler);
//		VBox.setMargin(btnArriba, new Insets(15));
		this.datosYBotones.add(btnIzquierda, 0, 11);

		Button btnDerecha = new Button();
		btnDerecha.setText("Derecha");
		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(mineCraft.getJugador(), this);
		btnDerecha.setOnAction(derechaHandler);
//		VBox.setMargin(btnArriba, new Insets(15));
		this.datosYBotones.add(btnDerecha, 2, 11);

		Button btnAbajo = new Button();
		btnAbajo.setText("Abajo");
		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(mineCraft.getJugador(), this);
		btnAbajo.setOnAction(abajoHandler);
//		VBox.setMargin(btnAbajo, new Insets(15));
		this.datosYBotones.add(btnAbajo, 1, 12);

//
//		if (algoPoly.debePasarTurno()) {
//			Button btnPasar = new Button();
//			btnPasar.setText("Pasar Turno");
//			this.mostrarAlert("Pierde turno por estar preso");
//			BotonPasarTurnoHandler pasarHandler = new BotonPasarTurnoHandler(this.algoPoly, this);
//			btnPasar.setOnAction(pasarHandler);
//			VBox.setMargin(btnPasar, new Insets(15));
//			this.datosYBotones.getChildren().add(btnPasar);
//		}
//		
//		if (algoPoly.vaAPerder()) {
//			Button btnPerder = new Button();
//			btnPerder.setText("Perder");
//			BotonPerderHandler perderHandler = new BotonPerderHandler(this.algoPoly, this);
//			btnPerder.setOnAction(perderHandler);
//			VBox.setMargin(btnPerder, new Insets(15));
//			this.datosYBotones.getChildren().add(btnPerder);
//		}
	}

//	private void mostrarJugadorActual(String nombre) {
//		Image image = new Image("file:src/vista/imagenes/ficharoja.png");
//		if (nombre == "Verde")
//			image = new Image("file:src/vista/imagenes/fichaverde.png");
//		if (nombre == "Azul")
//			image = new Image("file:src/vista/imagenes/fichaazul.png");
//		ImageView imageView = new ImageView();
//		imageView.setImage(image);
//		imageView.setFitWidth(50);
//		imageView.setFitHeight(50);
//		imageView.setPreserveRatio(true);
//		imageView.setSmooth(true);
//		datosYBotones.getChildren().add(imageView);
//	}

//	private void mostrarDados(double valor) {
//		Image image = new Image("file:src/vista/imagenes/dado1.png");
//		if (valor == 2)
//			image = new Image("file:src/vista/imagenes/dado2.png");
//		if (valor == 3)
//			image = new Image("file:src/vista/imagenes/dado3.png");
//		if (valor == 4)
//			image = new Image("file:src/vista/imagenes/dado4.png");
//		if (valor == 5)
//			image = new Image("file:src/vista/imagenes/dado5.png");
//		if (valor == 6)
//			image = new Image("file:src/vista/imagenes/dado6.png");
//		ImageView imageView = new ImageView();
//		imageView.setImage(image);
//		imageView.setFitWidth(50);
//		imageView.setFitHeight(50);
//		imageView.setPreserveRatio(true);
//		imageView.setSmooth(true);
//		datosYBotones.getChildren().add(imageView);
//	}

//	private void setearColor(Text txt, Jugador jugador) {
//		if (jugador.getNombre().equals("Rojo"))
//			txt.setFill(Color.RED);
//		if (jugador.getNombre().equals("Verde"))
//			txt.setFill(Color.GREEN);
//		if (jugador.getNombre().equals("Azul"))
//			txt.setFill(Color.BLUE);
//	}

	private void setBorder(Pane pane) {
		String color = "BLACK";
		pane.setStyle("-fx-padding: 2;" + "-fx-border-style: solid inside;" + "-fx-border-width: 7;"
				+ "-fx-border-insets: 2;" + "-fx-border-radius: 10;" + "-fx-border-color: " + color + ";");
	}

	public void refrescar() {
		this.setPanelIzquierdo();
		this.setPanelDerecho();
	}
}