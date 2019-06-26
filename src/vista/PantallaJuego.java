package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;


abstract class PantallaJuego extends StackPane {

    static int anchoPantalla = 1160;
    static int altoPantalla = 680;

    void setImagenDeFondo(String rutaImagen) {
        BackgroundImage backgroundImage = new BackgroundImage(new Image(rutaImagen, anchoPantalla, altoPantalla, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(backgroundImage));
    }

    void setBoton(String textoBoton, EventHandler<ActionEvent> handler) {
        Button botonIniciar = new Button();
        botonIniciar.setText(textoBoton);
        botonIniciar.setOnAction(handler);
        this.getChildren().add(botonIniciar);
    }

}
