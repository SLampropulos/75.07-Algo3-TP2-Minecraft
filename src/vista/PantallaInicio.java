package vista;

import eventos.InicioDelJuegoHandler;
import javafx.stage.Stage;
import juego.MineCraft;

public class PantallaInicio extends PantallaJuego {

	public PantallaInicio(Stage stage, MineCraft mineCraft, int anchoPantalla, int altoPantalla) {
		super();
		setBoton("INICIAR JUEGO", new InicioDelJuegoHandler(mineCraft, stage, anchoPantalla, altoPantalla));
		setImagenDeFondo("file:src/vista/images/Inicio.jpg");
	}
}
