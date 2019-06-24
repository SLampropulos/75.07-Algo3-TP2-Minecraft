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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import juego.MineCraft;
import java.net.URL;

//A quitar
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ContenedorPrincipal extends BorderPane {

	//Definición de constantes
	static final String DIRECCION_FONDO_JUEGO = "file:src/vista/images/Mono2.jpg";
	static final String DIRECCION_CELDA_JUEGO = "images/Celda.png";
	static final String TITULO_HERRAMIENTA_ACTUAL = "Herramienta: ";
	
	//Declaración de variables
	private MineCraft mineCraft;
	VistaMapa vistaMapa;
	GridPane panelIzquierdo;
	GridPane datosYBotones;
	GridPane herramientaActual;

	//Constructor
	public ContenedorPrincipal(MineCraft mineCraft, Stage stage) {
		this.mineCraft = mineCraft;
		this.panelIzquierdo = new GridPane();

		vistaMapa = new VistaMapa(mineCraft, this, panelIzquierdo);
		this.definirPanelIzquierdo();
		this.definirPanelDerecho();
	}

	private void definirPanelIzquierdo() {
		vistaMapa.dibujar();
		panelIzquierdo.setAlignment(Pos.CENTER);
		this.establecerFrontera(panelIzquierdo);
		this.setLeft(panelIzquierdo);
	}

	private void definirPanelDerecho() {

		this.datosYBotones = new GridPane();
		//this.herramientaActual = new GridPane();

		Image fondo = new Image(DIRECCION_FONDO_JUEGO);
		BackgroundImage imagenDeFondo = new BackgroundImage(fondo, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1, 1, true, true, false, false));
		setBackground(new Background(imagenDeFondo));
		//this.establecerFrontera(datosYBotones);

		/*Text titulo = new Text(TITULO_MATERIALES);
		titulo.setFill(Color.BLACK);
		titulo.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		this.datosYBotones.add(titulo, 0, 0, 3, 1);*/

		this.colocarBotones();		
		this.colocarInventarioHerramientas();
		this.colocarInventarioMateriales();
		this.colocarPatron();
		this.colocarHerramientaActual();

		this.datosYBotones.setAlignment(Pos.CENTER);
		this.setCenter(datosYBotones);
	}
	
	private void colocarHerramientaActual() {
		Text tituloHerramientaActual = new Text(TITULO_HERRAMIENTA_ACTUAL);
		tituloHerramientaActual.setFill(Color.BLACK);
		tituloHerramientaActual.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		//this.herramientaActual.add(tituloHerramientaActual, 0, 10);
		
		/*URL direccion = getClass().getResource(DIRECCION_CELDA_JUEGO);
		Image celda = new Image(direccion.toString(), 32, 32, false, true);*/
		/*Button btnHerramientaActual = new Button();
		btnHerramientaActual.setGraphic(new ImageView(celda));
		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.obtenerJugador(), this, vistaMapa.obtenerVistaJugador());
		btnHerramientaActual.setOnAction(izquierdaHandler);
		this.datosYBotones.add(btnHerramientaActual, 0, 13);*/
	}
	
	private void colocarInventarioHerramientas() {
		
	}
	
	private void colocarInventarioMateriales() {
		
	}
	
	private void colocarPatron() {
		
	}

	private void colocarBotones() {

		Button btnArriba = new Button();
		btnArriba.setText("Arriba");
		BotonArribaHandler arribaHandler = new BotonArribaHandler(mineCraft.obtenerJugador(), this, vistaMapa.obtenerVistaJugador());
		btnArriba.setOnAction(arribaHandler);
		this.datosYBotones.add(btnArriba, 1, 10);

		Button btnIzquierda = new Button();
		btnIzquierda.setText("Izquierda");
		BotonIzquierdaHandler izquierdaHandler = new BotonIzquierdaHandler(mineCraft.obtenerJugador(), this, vistaMapa.obtenerVistaJugador());
		btnIzquierda.setOnAction(izquierdaHandler);
		this.datosYBotones.add(btnIzquierda, 0, 11);

		Button btnDerecha = new Button();
		btnDerecha.setText("Derecha");
		BotonDerechaHandler derechaHandler = new BotonDerechaHandler(mineCraft.obtenerJugador(), this, vistaMapa.obtenerVistaJugador());
		btnDerecha.setOnAction(derechaHandler);
		this.datosYBotones.add(btnDerecha, 2, 11);

		Button btnAbajo = new Button();
		btnAbajo.setText("Abajo");
		BotonAbajoHandler abajoHandler = new BotonAbajoHandler(mineCraft.obtenerJugador(), this, vistaMapa.obtenerVistaJugador());
		btnAbajo.setOnAction(abajoHandler);
		this.datosYBotones.add(btnAbajo, 1, 12);

	}
	
	private void establecerFrontera(Pane pane) {
		pane.setStyle("-fx-padding: 2;-fx-border-style: solid inside;-fx-border-width: 7;"
				+ "-fx-border-insets: 2;-fx-border-radius: 10;-fx-border-color:BLACK;");
	}

	public void refrescar() {
		this.definirPanelIzquierdo();
		this.definirPanelDerecho();
	}
}
