import Herramientas.*;
import Materiales.Material;
import Materiales.Metal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MetalTest {

    @Test
    public void metalEsGolpeadoConPicoDeMaderaYNoSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        float durabilidad = metal.getDurabilidad();
        Herramienta pico = new PicoMadera();

        metal.desgastarCon(pico);

        assertEquals(durabilidad, metal.getDurabilidad());
    }

    @Test
    public void metalEsGolpeadoConPicoDePiedraYSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        float durabilidad = metal.getDurabilidad();
        Herramienta pico = new PicoPiedra();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 4, metal.getDurabilidad());

    }
    @Test
    public void metalEsGolpeadoConPicoDeMetalYSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        float durabilidad = metal.getDurabilidad();
        Herramienta pico = new PicoMetal();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 12, metal.getDurabilidad());

    }
    @Test
    public void metalEsGolpeadoConPicoFinoaYSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        float durabilidad = metal.getDurabilidad();
        Herramienta pico = new PicoFino();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 20, metal.getDurabilidad());
    }

}
