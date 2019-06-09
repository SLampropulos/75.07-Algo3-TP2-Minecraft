import Herramientas.HachaMadera;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Herramientas.PicoMadera;
import Materiales.Madera;
import Materiales.Material;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaderaTest {

    @Test
    public void maderaEsGolpeadaPorPicoYNoSeDesgasta() {
        Material madera = new Madera(); //TODO debe funcionar con Material
        float durabilidad = madera.getDurabilidad();
        Herramienta pico = new PicoMadera();

        madera.desgastarCon(pico);

        assertEquals(durabilidad, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaDeMaderaYSeDesgasta() {
        Material madera = new Madera(); //TODO debe funcionar con Material
        float durabilidad = madera.getDurabilidad();
        Herramienta hacha = new HachaMadera();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 2, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaDePiedraYSeDesgasta() {
        Material madera = new Madera(); //TODO debe funcionar con Material
        float durabilidad = madera.getDurabilidad();
        Herramienta hacha = new HachaPiedra();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 5, madera.getDurabilidad());
    }
}
