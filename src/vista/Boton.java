package vista;

import eventos.*;
import javafx.scene.control.Button;

public class Boton extends Button {

    public Boton(BotonArribaHandler handler) {
        setText("Arriba");
        setOnAction(handler);
    }

    public Boton(BotonAbajoHandler handler) {
        setText("Abajo");
        setOnAction(handler);
    }

    public Boton(BotonIzquierdaHandler handler) {
        setText("Izquierda");
        setOnAction(handler);
    }

    public Boton(BotonDerechaHandler handler) {
        setText("Derecha");
        setOnAction(handler);
    }

    public Boton(BotonConstruirHandler handler) {
        setText("Construir");
        setOnAction(handler);
    }

    public Boton(BotonCancelarHandler handler) {
        setText("Cancelar");
        setOnAction(handler);
    }
}
