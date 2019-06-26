package vista;

import eventos.InicioDelJuegoHandler;
import javafx.stage.Stage;
import juego.MineCraft;

public class PantallaInicio extends PantallaJuego {

	static final String DIRECCION_AUDIO_INICIO = "sounds/INTRO.mp3";
	static final String BOTON_INICIO = "INICIAR JUEGO";
	static final String DIRECCION_FONDO_MENU_INICIAL = "file:src/vista/images/inicio.jpg";
	
	public PantallaInicio(Stage stage, MineCraft mineCraft) {
		super();
		setBoton(BOTON_INICIO, new InicioDelJuegoHandler(mineCraft, stage));
		setImagenDeFondo(DIRECCION_FONDO_MENU_INICIAL);
		setMusicaDeFondo(DIRECCION_AUDIO_INICIO);
	}
}
