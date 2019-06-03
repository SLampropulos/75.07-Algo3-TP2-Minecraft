import Herramientas.HachaMadera;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Materiales.Madera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MaderaTest {

    @Test
    public void maderaEsGolpeadaPorPicoYSeLanzaExcepcion() {
        Madera madera = new Madera();
        float durabilidad = madera.getDurabilidad();
        /* Acá iría la clase Pico y debería funcionar igual. Como no está implementada todavía
        * la dejo así. */
        Herramienta pico = new Herramienta(200, 10);

        assertThrows(HerramientaInvalidaException.class, ()-> {madera.desgastarCon(pico);});
    }

    @Test
    public void maderaEsGolpeadaPorHachaMaderaYSeDesgasta() {
        Madera madera = new Madera();
        float durabilidad = madera.getDurabilidad();
        HachaMadera hacha = new HachaMadera();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 2, madera.getDurabilidad());
    }

    @Test
    public void maderaEsGolpeadaPorHachaPiedraYSeDesgasta() {
        Madera madera = new Madera();
        float durabilidad = madera.getDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        madera.desgastarCon(hacha);

        assertEquals(durabilidad - 5, madera.getDurabilidad());
    }
}
