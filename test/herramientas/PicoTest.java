package herramientas;
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
    void seCreaUnPicoDeMaderaYDesgastaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        int durabilidad = picoMadera.getDurabilidad();
        picoMadera.desgastar();
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
        picoPiedra.desgastar();
        assertEquals(durabilidad - 2/*(float) (4/1.5)*/, picoPiedra.getDurabilidad());
    }

    @Test
    void seCreaUnPicoDeMetalCorrectamente(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.getDurabilidad();
        int fuerza = picoMetal.getFuerza();
        assertEquals(400,durabilidad);
        assertEquals(12,fuerza);
    }

    @Test
    void seCreaUnPicoDeMetalSeUsaYNoCambiaDurabilidad(){
        PicoMetal picoMetal = new PicoMetal();
        int durabilidad = picoMetal.getDurabilidad();
        picoMetal.desgastar();
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
        assertEquals(durabilidad * 0.1, picoFino.getDurabilidad());
    }
}
