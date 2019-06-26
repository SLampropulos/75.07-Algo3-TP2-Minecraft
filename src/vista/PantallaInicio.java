package vista;

import eventos.InicioDelJuegoHandler;
import javafx.stage.Stage;
import juego.MineCraft;

public class PantallaInicio extends PantallaJuego {

	public PantallaInicio(Stage stage, MineCraft mineCraft) {
		super();
		setBoton("INICIAR JUEGO", new InicioDelJuegoHandler(mineCraft, stage));
		setImagenDeFondo("file:src/vista/images/Inicio.jpg");
	}
}
