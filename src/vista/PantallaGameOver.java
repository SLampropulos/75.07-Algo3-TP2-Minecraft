package vista;

import eventos.FinDelJuegoHandler;

public class PantallaGameOver extends PantallaJuego {

    static final String TEXTO_FIN_JUEGO = "SALIR DEL JUEGO";
    static final String DIRECCION_IMAGEN_FIN_DEL_JUEGO = "file:src/vista/images/GameOver.png";
    
    public PantallaGameOver() {
        super();
        setBoton(TEXTO_FIN_JUEGO, new FinDelJuegoHandler());
        setImagenDeFondo(DIRECCION_IMAGEN_FIN_DEL_JUEGO);
    }

}
