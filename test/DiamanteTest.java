import Herramientas.HachaPiedra;
import Herramientas.PicoFino;
import Herramientas.PicoPiedra;
import Materiales.Diamante;
import Materiales.Material;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamanteTest {


    @Test
    public void diamanteSeCreaCorrectamnete(){
        Material diamante = new Diamante();
        float durabiliadad = diamante.getDurabilidad();

        assertEquals(100,durabiliadad);
    }

    @Test
    public void diamanteEsGolpeadoPorHachaPiedraYNoSeReduceSuDurabilidad() {
        Material diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        diamante.desgastarCon(hacha);

        assertEquals(durabilidad, diamante.getDurabilidad());
    }

    @Test void diamanteEsGolpeadoPorUnPicoFino(){
        Material diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        PicoFino picoFino = new PicoFino();

        diamante.desgastarCon(picoFino);
        assertEquals(durabilidad-20,diamante.getDurabilidad());
    }

    @Test void diamanteEsGolpeadoPorUnPicoPiedraNoPasaNada(){
        Material diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        PicoPiedra picoPiedra = new PicoPiedra();

        diamante.desgastarCon(picoPiedra);
        assertEquals(durabilidad,diamante.getDurabilidad());
    }
}
