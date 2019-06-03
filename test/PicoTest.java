import Herramientas.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoTest {

    @Test
    void seCreaUnPicoDeMaderaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        int durabilidad = picoMadera.getDurabilidad();
        int fuerza = picoMadera.getFuerza();
        assertEquals(100,durabilidad);
        assertEquals(2,fuerza);
    }

    @Test
    void seCreaUnPicoMaderaYDesgastaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        int durabilidad = picoMadera.getDurabilidad();
        PicoMadera.desgastar();
        assertEquals(durabilidad-2, picoMadera.getDurabilidad());
    }

    @Test
    void seCreaUnPicoDePiedraCorrectamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        int durabilidad = picoPiedra.getDurabilidad();
        int fuerza = picoPiedra.getFuerza();
        assertEquals(200,durabilidad);
        assertEquals(4,fuerza);
    }

    @Test
    void seCreaUnPicoDePiedraYDesgastaCorrectamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        int durabilidad = picoPiedra.getDurabilidad();
        PicoMadera.desgastar();
        assertEquals(durabilidad-2, picoPiedra.getDurabilidad());
    }

    @Test
    void seCreaUnPicoMetalYDesgastaCorrectamente(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.getDurabilidad();
        int fuerza = picoMetal.getFuerza();
        assertEquals(400,durabilidad);
        assertEquals(12,fuerza);
    }

    @Test
    void seCreaUnPicoDePiedraSeUsaYNoCambiaDurabilidad(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.getDurabilidad();
        PicoMadera.desgastar();
        assertEquals(durabilidad, picoMetal.getDurabilidad());
    }

    @Test
    void seCreaUnPicoFinoCorrectamnete(){
        PicoFino picoFino = new PicoFino();
        int durabilidad = picoFino.getDurabilidad();
        int fuerza = picoFino.getFuerza();
        assertEquals(1000,durabilidad);
        assertEquals(20,fuerza);
    }

    @Test
    void seCreaPicoFinoYSedesgastaCorrectamente(){
        PicoFino picoFino = new PicoFino();
        int durabilidad = picoFino.getDurabilidad();
        picoFino.desgastar();
        assertEquals(durabilidad - (durabilidad/10), picoFino.getDurabilidad());
    }
}
