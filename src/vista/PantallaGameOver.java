package vista;

import eventos.FinDelJuegoHandler;

public class PantallaGameOver extends PantallaJuego {

    public PantallaGameOver() {
        super();
        setBoton("SALIR DEL JUEGO", new FinDelJuegoHandler());
        setImagenDeFondo("file:src/vista/images/GameOver.png");
    }

}
