package herramientas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoTest {

    @Test
    void seCreaUnPicoDeMaderaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        int durabilidad = picoMadera.obtenerDurabilidad();
        int fuerza = picoMadera.obtenerFuerza();
        assertEquals(100,durabilidad);
        assertEquals(2,fuerza);
    }

    @Test
    void seCreaUnPicoDeMaderaYDesgastaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        int durabilidad = picoMadera.obtenerDurabilidad();
        picoMadera.desgastar();
        assertEquals(durabilidad-2, picoMadera.obtenerDurabilidad());
    }

    @Test
    void seCreaUnPicoDePiedraCorrectamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        int durabilidad = picoPiedra.obtenerDurabilidad();
        int fuerza = picoPiedra.obtenerFuerza();
        assertEquals(200,durabilidad);
        assertEquals(4,fuerza);
    }

    @Test
    void seCreaUnPicoDePiedraYDesgastaCorrectamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        int durabilidad = picoPiedra.obtenerDurabilidad();
        picoPiedra.desgastar();
        assertEquals(durabilidad - (int) (4/1.5), picoPiedra.obtenerDurabilidad());
    }

    @Test
    void seCreaUnPicoDeMetalCorrectamente(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.obtenerDurabilidad();
        int fuerza = picoMetal.obtenerFuerza();
        assertEquals(400,durabilidad);
        assertEquals(12,fuerza);
    }

    @Test
    void seCreaUnPicoDeMetalSeUsaYNoCambiaDurabilidad(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.obtenerDurabilidad();
        picoMetal.desgastar();
        assertEquals(durabilidad, picoMetal.obtenerDurabilidad());
    }

    @Test
    void seCreaUnPicoFinoCorrectamnete(){
        PicoFino picoFino = new PicoFino();
        int durabilidad = picoFino.obtenerDurabilidad();
        int fuerza = picoFino.obtenerFuerza();
        assertEquals(1000,durabilidad);
        assertEquals(20,fuerza);
    }

    @Test
    void seCreaPicoFinoYSedesgastaCorrectamente(){
        PicoFino picoFino = new PicoFino();
        int durabilidad = picoFino.obtenerDurabilidad();
        picoFino.desgastar();
        assertEquals(durabilidad - (durabilidad/10), picoFino.obtenerDurabilidad());
    }
}
