import Herramientas.PicoMadera;
import Herramientas.PicoPiedra;
import Materiales.Metal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MetalTest {

    @Test
    public void metalEsGolpeadoConPicoDeMaderaYNoSeReduceSuDurabilidad() {
        Metal metal = new Metal();
        float durabilidad = metal.getDurabilidad();
        PicoMadera pico = new PicoMadera();

        metal.desgastarCon(pico);

        assertEquals(durabilidad, metal.getDurabilidad());
    }

    @Test
    public void metalEsGolpeadoConPicoDePiedraYSeReduceSuDurabilidad() {
        Metal metal = new Metal();
        float durabilidad = metal.getDurabilidad();
        PicoPiedra pico = new PicoPiedra();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - (float)(4/1.5), metal.getDurabilidad());

    }

}
