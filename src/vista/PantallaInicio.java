package vista;

import eventos.InicioDelJuegoHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import juego.MineCraft;

public class PantallaInicio extends StackPane {

    public PantallaInicio(Stage stage, MineCraft juego) {
        super();
        Button botonIniciar = new Button();
        botonIniciar.setText("INICIAR JUEGO");
        botonIniciar.setOnAction(new InicioDelJuegoHandler(juego, stage));
        this.getChildren().add(botonIniciar);
        BackgroundImage backgroundImage = new BackgroundImage(new Image("file:src/vista/images/inicio.jpg", 1160, 640, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(backgroundImage));
    }

}
