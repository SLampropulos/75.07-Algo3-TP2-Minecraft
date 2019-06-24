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
        float durabiliadad = diamante.getDurabilidad();

        assertEquals(100,durabiliadad);
    }

    @Test
    public void diamanteEsGolpeadoPorHachaPiedraYNoSeReduceSuDurabilidad() {
        Material diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        Herramienta hacha = new HachaPiedra();

        diamante.desgastarCon(hacha);

        assertEquals(durabilidad, diamante.getDurabilidad());
    }

    @Test void diamanteEsGolpeadoPorUnPicoFino(){
        Material diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        Herramienta picoFino = new PicoFino();

        diamante.desgastarCon(picoFino);
        assertEquals(durabilidad-20,diamante.getDurabilidad());
    }

    @Test void diamanteEsGolpeadoPorUnPicoPiedraNoPasaNada(){
        Material diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        Herramienta picoPiedra = new PicoPiedra();

        diamante.desgastarCon(picoPiedra);
        assertEquals(durabilidad,diamante.getDurabilidad());
    }
}
