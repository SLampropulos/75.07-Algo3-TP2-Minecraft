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
        float durabilidad = piedra.getDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.getDurabilidad());
    }

    @Test
    public void piedraEsGolpeadaPorHachaDeMaderaYNoSeReduceSuDurabilidad() {
        Material piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        HachaMadera hacha = new HachaMadera();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.getDurabilidad());
    }

    @Test
    public void piedraEsGolpeadaPorHachaDeMetalYNoSeReduceSuDurabilidad() {
        Material piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        HachaMetal hacha = new HachaMetal();

        piedra.desgastarCon(hacha);

        assertEquals(durabilidad, piedra.getDurabilidad());
    }

    @Test
    public void piedraEsGolepadaPorPicoMadera(){
        Material piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        PicoMadera picoMadera = new PicoMadera();

        piedra.desgastarCon(picoMadera);

        assertEquals(durabilidad-2, piedra.getDurabilidad());

    }

    @Test
    public void piedraEsGolepadaPorPicoPiedra(){
        Material piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        PicoPiedra pico = new PicoPiedra();

        piedra.desgastarCon(pico);

        assertEquals(durabilidad-4, piedra.getDurabilidad());
    }
    @Test
    public void piedraEsGolepadaPorPicoMetal(){
        Material piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        PicoMetal pico = new PicoMetal();

        piedra.desgastarCon(pico);

        assertEquals(durabilidad-12, piedra.getDurabilidad());
    }
    @Test
    public void piedraEsGolepadaPorPicoFino(){
        Material piedra = new Piedra();
        float durabilidad = piedra.getDurabilidad();
        PicoFino pico = new PicoFino();

        piedra.desgastarCon(pico);

        assertEquals(durabilidad-20, piedra.getDurabilidad());
    }

}
