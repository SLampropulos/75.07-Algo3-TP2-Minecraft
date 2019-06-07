import Herramientas.HachaMadera;
import Herramientas.HachaPiedra;
import Herramientas.PicoMadera;
import Materiales.Madera;
import Materiales.Material;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaderaTest {

    @Test
    public void maderaEsGolpeadaPorPicoYNoSeDesgasta() {
        Material madera = new Madera();
        float durabilidad = madera.getDurabilidad();
        PicoMadera pico = new PicoMadera();

        madera.desgastarCon(pico);

        assertEquals(durabilidad, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaDeMaderaYSeDesgasta() {
        Material madera = new Madera();
        float durabilidad = madera.getDurabilidad();
        HachaMadera hacha = new HachaMadera();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 2, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaDePiedraYSeDesgasta() {
        Material madera = new Madera();
        float durabilidad = madera.getDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 5, madera.getDurabilidad());
    }
}
