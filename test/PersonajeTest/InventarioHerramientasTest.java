package PersonajeTest;

import Herramientas.Herramienta;
import Herramientas.PicoMadera;
import Personaje.InventarioHerramientas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioHerramientasTest {

    @Test
    void inventarioIniciaCorrecatmente(){
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
        int cantElementos = inventarioHerramientas.sizeHerramineta();
        assertEquals(1,cantElementos);
    }

    @Test
    void inventarioAgregaHerramineta(){
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
        inventarioHerramientas.add(new PicoMadera());
        int cantElementos = inventarioHerramientas.sizeHerramineta();
        assertEquals(2,cantElementos);
    }

    @Test
    void inventarioDesechaUnaHerramienta(){
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
        Herramienta hacha = inventarioHerramientas.getHerramienta(0);
        inventarioHerramientas.remove(hacha);

        assertEquals(0, inventarioHerramientas.sizeHerramineta());
    }

}
