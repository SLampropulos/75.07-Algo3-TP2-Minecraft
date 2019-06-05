package PersonajeTest;

import Herramientas.Herramienta;
import Personaje.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JugadorTest {

    @Test
    void personajeSeCreaAdecuadamente(){
        Jugador jugador = new Jugador();
        Herramienta hacha = jugador.getEquipado();
        assertTrue(hacha != null);
    }

}
