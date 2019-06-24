package materiales;
import herramientas.*;
import materiales.Material;
import materiales.Piedra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PiedraTest {

    @Test
    public void piedraEsGolpeadaPorHachaDePiedraYNoSeReduceSuDurabilidad() {
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraEsGolpeadaPorHachaDeMaderaYNoSeReduceSuDurabilidad() {
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        HachaMadera hacha = new HachaMadera();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraEsGolpeadaPorHachaDeMetalYNoSeReduceSuDurabilidad() {
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        HachaMetal hacha = new HachaMetal();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.obtenerDurabilidad());
    }

    @Test
    public void piedraEsGolepadaPorPicoMadera(){
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        PicoMadera picoMadera = new PicoMadera();

        piedra.desgastarCon(picoMadera);

        assertEquals(durabilidad-2, piedra.obtenerDurabilidad());

    }

    @Test
    public void piedraEsGolepadaPorPicoPiedra(){
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        PicoPiedra pico = new PicoPiedra();

        piedra.desgastarCon(pico);

        assertEquals(durabilidad-4, piedra.obtenerDurabilidad());
    }
    @Test
    public void piedraEsGolepadaPorPicoMetal(){
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        PicoMetal pico = new PicoMetal();

        piedra.desgastarCon(pico);

        assertEquals(durabilidad-12, piedra.obtenerDurabilidad());
    }
    @Test
    public void piedraEsGolepadaPorPicoFino(){
        Material piedra = new Piedra();
        int durabilidad = piedra.obtenerDurabilidad();
        PicoFino pico = new PicoFino();

        piedra.desgastarCon(pico);

        assertEquals(durabilidad-20, piedra.obtenerDurabilidad());
    }

}
