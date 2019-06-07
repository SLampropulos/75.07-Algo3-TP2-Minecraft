import Herramientas.*;
import Materiales.Madera;
import Materiales.Material;
import Materiales.Metal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MetalTest {

    @Test
    public void metalEsGolpeadoConPicoDeMaderaYNoSeReduceSuDurabilidad() {
    	Metal metal = new Metal(); //TODO debe funcionar con Material
        float durabilidad = metal.getDurabilidad();
        PicoMadera pico = new PicoMadera();

        metal.desgastarCon(pico);

        assertEquals(durabilidad, metal.getDurabilidad());
    }

    @Test
    public void metalEsGolpeadoConPicoDePiedraYSeReduceSuDurabilidad() {
    	Metal metal = new Metal(); //TODO debe funcionar con Material
        float durabilidad = metal.getDurabilidad();
        PicoPiedra pico = new PicoPiedra();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 4, metal.getDurabilidad());

    }
    @Test
    public void metalEsGolpeadoConPicoDeMetalYSeReduceSuDurabilidad() {
    	Metal metal = new Metal(); //TODO debe funcionar con Material
        float durabilidad = metal.getDurabilidad();
        PicoMetal pico = new PicoMetal();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 12, metal.getDurabilidad());

    }
    @Test
    public void metalEsGolpeadoConPicoFinoaYSeReduceSuDurabilidad() {
    	Metal metal = new Metal(); //TODO debe funcionar con Material
        float durabilidad = metal.getDurabilidad();
        PicoFino pico = new PicoFino();

        metal.desgastarCon(pico);

        assertEquals(durabilidad - 20, metal.getDurabilidad());
    }

}
