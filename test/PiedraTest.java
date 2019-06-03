import Herramientas.HachaMadera;
import Herramientas.HachaPiedra;
import Materiales.Piedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PiedraTest {

    @Test
    public void piedraEsGolpeadaPorHachaDePiedraYNoSeReduceSuDurabilidad() {
        Piedra piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.getDurabilidad());
    }

    @Test
    public void piedraEsGolpeadaPorHachaDeMaderaYNoSeReduceSuDurabilidad() {
        Piedra piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        HachaMadera hacha = new HachaMadera();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.getDurabilidad());
    }

    /*@Test
    public void piedraEsGolpeadaPorHachaDeMetalYNoSeReduceSuDurabilidad() {
        Piedra piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        HachaMetal hacha = new HachaMetal();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.getDurabilidad());
    }*/

}
