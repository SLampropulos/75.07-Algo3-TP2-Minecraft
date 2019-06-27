package materiales;
import herramientas.HachaMadera;
import herramientas.HachaPiedra;
import herramientas.Herramienta;
import herramientas.PicoMadera;
import materiales.Madera;
import materiales.Material;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaderaTest {

    @Test
    public void maderaEsGolpeadaPorPicoYNoSeDesgasta() {
        Material madera = new Madera();
        int durabilidad = madera.getDurabilidad();
        Herramienta pico = new PicoMadera();

        madera.desgastarCon(pico);

        assertEquals(durabilidad, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaDeMaderaYSeDesgasta() {
        Material madera = new Madera();
        int durabilidad = madera.getDurabilidad();
        Herramienta hacha = new HachaMadera();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 2, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaDePiedraYSeDesgasta() {
        Material madera = new Madera();
        int durabilidad = madera.getDurabilidad();
        Herramienta hacha = new HachaPiedra();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 5, madera.getDurabilidad());
    }
}
