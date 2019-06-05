package PersonajeTest;

import Herramientas.Herramienta;
import Herramientas.PicoMadera;
import Personaje.InventarioHerraminetas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioHerraminetasTest {

    @Test
    void inventarioIniciaCorrecatmente(){
        InventarioHerraminetas inventarioHerraminetas = new InventarioHerraminetas();
        int cantElementos = inventarioHerraminetas.sizeHerramineta();
        assertEquals(1,cantElementos);
    }

    @Test
    void inventarioAgregaHerramineta(){
        InventarioHerraminetas inventarioHerraminetas = new InventarioHerraminetas();
        inventarioHerraminetas.add(new PicoMadera());
        int cantElementos = inventarioHerraminetas.sizeHerramineta();
        assertEquals(2,cantElementos);
    }

    @Test
    void inventarioDesechaUnaHerramienta(){
        InventarioHerraminetas inventarioHerraminetas = new InventarioHerraminetas();
        Herramienta hacha = inventarioHerraminetas.getHerramienta(0);
        inventarioHerraminetas.remove(hacha);

        assertEquals(0,inventarioHerraminetas.sizeHerramineta());
    }

}
