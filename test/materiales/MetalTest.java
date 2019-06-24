package materiales;
import herramientas.*;
import materiales.Material;
import materiales.Metal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MetalTest {

    @Test
    public void metalEsGolpeadoConPicoDeMaderaYNoSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        int durabilidad = metal.obtenerDurabilidad();
        Herramienta pico = new PicoMadera();

        metal.desgastarCon(pico);

        assertEquals(durabilidad, metal.obtenerDurabilidad());
    }

    @Test
    public void metalEsGolpeadoConPicoDePiedraYSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        int durabilidad = metal.obtenerDurabilidad();
        Herramienta pico = new PicoPiedra();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 4, metal.obtenerDurabilidad());

    }
    @Test
    public void metalEsGolpeadoConPicoDeMetalYSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        int durabilidad = metal.obtenerDurabilidad();
        Herramienta pico = new PicoMetal();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 12, metal.obtenerDurabilidad());

    }
    @Test
    public void metalEsGolpeadoConPicoFinoaYSeReduceSuDurabilidad() {
    	Material metal = new Metal();
        int durabilidad = metal.obtenerDurabilidad();
        Herramienta pico = new PicoFino();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 20, metal.obtenerDurabilidad());
    }

}
