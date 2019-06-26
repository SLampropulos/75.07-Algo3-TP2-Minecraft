package vista;

import eventos.*;
import javafx.scene.control.Button;

public class Boton extends Button {

    static final String TEXTO_BOTON_ARRIBA = "Arriba";
    static final String TEXTO_BOTON_ABAJO = "Abajo";
    static final String TEXTO_BOTON_IZQUIERDA = "Izquierda";
    static final String TEXTO_BOTON_DERECHA = "Derecha";
    static final String TEXTO_BOTON_CONSTRUIR = "Construir";
    static final String TEXTO_BOTON_CANCELAR = "Cancelar";
    
    public Boton(BotonArribaHandler handler) {
        setText(TEXTO_BOTON_ARRIBA);
        setOnAction(handler);
    }

    public Boton(BotonAbajoHandler handler) {
        setText(TEXTO_BOTON_ABAJO);
        setOnAction(handler);
    }

    public Boton(BotonIzquierdaHandler handler) {
        setText(TEXTO_BOTON_IZQUIERDA);
        setOnAction(handler);
    }

    public Boton(BotonDerechaHandler handler) {
        setText(TEXTO_BOTON_DERECHA);
        setOnAction(handler);
    }

    public Boton(BotonConstruirHandler handler) {
        setText(TEXTO_BOTON_CONSTRUIR);
        setOnAction(handler);
    }

    public Boton(BotonCancelarHandler handler) {
        setText(TEXTO_BOTON_CANCELAR);
        setOnAction(handler);
    }

}
