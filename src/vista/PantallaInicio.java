package vista;

import eventos.InicioDelJuegoHandler;
import javafx.stage.Stage;
import juego.MineCraft;

public class PantallaInicio extends PantallaJuego {

    public PantallaInicio(Stage stage, MineCraft juego) {
        super();
        setBoton("INICIAR JUEGO", new InicioDelJuegoHandler(juego, stage));
        setImagenDeFondo("file:src/vista/images/Inicio.jpg");
    }

}
