package PersonajeTest;

import Herramientas.HachaMadera;
import Herramientas.Herramienta;
import Herramientas.PicoMadera;
import Personaje.InventarioHerramientas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioHerramientasTest {

    @Test
    void inventarioIniciaConUnHachaDeMadera() {
        InventarioHerramientas inventario = new InventarioHerramientas();
        Herramienta herramienta = inventario.getHerramienta(0);
        assertEquals(HachaMadera.class, herramienta.getClass());
    }

    @Test
    void inventarioIniciaConTamanioCorrecto(){
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
        int cantidadDeElementos = inventarioHerramientas.cantidadDeHerramientas();
        assertEquals(1,cantidadDeElementos);
    }

    @Test
    void inventarioAgregaHerramientaYAumentaTamanio(){
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
        inventarioHerramientas.add(new PicoMadera());
        int cantElementos = inventarioHerramientas.cantidadDeHerramientas();
        assertEquals(2,cantElementos);
    }

    @Test
    void inventarioDesechaUnaHerramientaYDisminuyeTamanio(){
        InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
        Herramienta hacha = inventarioHerramientas.getHerramienta(0);
        inventarioHerramientas.remove(hacha);
        assertEquals(0, inventarioHerramientas.cantidadDeHerramientas());
    }

}