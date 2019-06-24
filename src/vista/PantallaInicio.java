package vista;

import eventos.InicioDelJuegoHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import juego.MineCraft;

public class PantallaInicio extends StackPane {
    
	//Definición de constantes
	static final String BOTON_INICIO = "INICIAR JUEGO";
	static final String DIRECCION_FONDO_MENU_INICIAL = "file:src/vista/images/inicio.jpg";
	static final int TAMAÑO_HORIZONTAL_PANTALLA_INICIAL = 1160;
	static final int TAMAÑO_VERTICAL_PANTALLA_INICIAL = 640;
	static final String DIRECCION_AUDIO_INICIO = "sounds/INTRO.mp3";
	
	//Constructor
    public PantallaInicio(Stage stage, MineCraft juego) {
        super();
        Button botonIniciar = new Button();
        botonIniciar.setText(BOTON_INICIO);
        botonIniciar.setOnAction(new InicioDelJuegoHandler(juego, stage));
        
    	this.getChildren().add(botonIniciar);
        BackgroundImage backgroundImage = new BackgroundImage(new Image(DIRECCION_FONDO_MENU_INICIAL, TAMAÑO_HORIZONTAL_PANTALLA_INICIAL, TAMAÑO_VERTICAL_PANTALLA_INICIAL, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(backgroundImage));

        URL url = getClass().getResource(DIRECCION_AUDIO_INICIO);
        Media musica = new Media(url.toString());
    	MediaPlayer clip = new MediaPlayer(musica);
    	clip.setCycleCount(clip.INDEFINITE);
    	clip.play();
    }
}
