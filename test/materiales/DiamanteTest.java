package materiales;
import herramientas.HachaPiedra;
import herramientas.Herramienta;
import herramientas.PicoFino;
import herramientas.PicoPiedra;
import materiales.Diamante;
import materiales.Material;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamanteTest {


    @Test
    public void diamanteSeCreaCorrectamnete(){
        Material diamante = new Diamante();
        int durabiliadad = diamante.obtenerDurabilidad();

        assertEquals(100,durabiliadad);
    }

    @Test
    public void diamanteEsGolpeadoPorHachaPiedraYNoSeReduceSuDurabilidad() {
        Material diamante = new Diamante();
        int durabilidad = diamante.obtenerDurabilidad();
        Herramienta hacha = new HachaPiedra();

        diamante.desgastarCon(hacha);

        assertEquals(durabilidad, diamante.obtenerDurabilidad());
    }

    @Test void diamanteEsGolpeadoPorUnPicoFino(){
        Material diamante = new Diamante();
        int durabilidad = diamante.obtenerDurabilidad();
        Herramienta picoFino = new PicoFino();

        diamante.desgastarCon(picoFino);
        assertEquals(durabilidad-20,diamante.obtenerDurabilidad());
    }

    @Test void diamanteEsGolpeadoPorUnPicoPiedraNoPasaNada(){
        Material diamante = new Diamante();
        int durabilidad = diamante.obtenerDurabilidad();
        Herramienta picoPiedra = new PicoPiedra();

        diamante.desgastarCon(picoPiedra);
        assertEquals(durabilidad,diamante.obtenerDurabilidad());
    }
}
