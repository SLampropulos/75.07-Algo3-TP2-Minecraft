package vista;

import eventos.*;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Boton extends Button {

	public Boton(BotonArribaHandler handler, GridPane pane, int columna, int fila) {
		setText("Arriba");
		setOnAction(handler);
		GridPane.setHalignment(this, HPos.CENTER);
		pane.add(this, columna, fila);
	}

	public Boton(BotonAbajoHandler handler, GridPane pane, int columna, int fila) {
		setText("Abajo");
		setOnAction(handler);
		GridPane.setHalignment(this, HPos.CENTER);
		pane.add(this, columna, fila);
	}

	public Boton(BotonIzquierdaHandler handler, GridPane pane, int columna, int fila) {
		setText("Izquierda");
		setOnAction(handler);
		GridPane.setHalignment(this, HPos.CENTER);
		pane.add(this, columna, fila);
	}

	public Boton(BotonDerechaHandler handler, GridPane pane, int columna, int fila) {
		setText("Derecha");
		setOnAction(handler);
		GridPane.setHalignment(this, HPos.CENTER);
		pane.add(this, columna, fila);
	}

	public Boton(BotonConstruirHandler handler, GridPane pane, int columna, int fila) {
		setText("Construir");
		setOnAction(handler);
		GridPane.setHalignment(this, HPos.CENTER);
		pane.add(this, columna, fila);
	}

	public Boton(BotonCancelarHandler handler, GridPane pane, int columna, int fila) {
		setText("Cancelar");
		setOnAction(handler);
		GridPane.setHalignment(this, HPos.CENTER);
		pane.add(this, columna, fila);
	}
}
