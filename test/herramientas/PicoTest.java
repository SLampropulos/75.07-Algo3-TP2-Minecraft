package herramientas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoTest {

    @Test
    void seCreaUnPicoDeMaderaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        float durabilidad = picoMadera.getDurabilidad();
        float fuerza = picoMadera.getFuerza();
        assertEquals(100,durabilidad);
        assertEquals(2,fuerza);
    }

    @Test
    void seCreaUnPicoDeMaderaYDesgastaCorrectamente(){
        PicoMadera picoMadera = new PicoMadera();
        float durabilidad = picoMadera.getDurabilidad();
        picoMadera.desgastar();
        assertEquals(durabilidad-2, picoMadera.getDurabilidad());
    }

    @Test
    void seCreaUnPicoDePiedraCorrectamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        float durabilidad = picoPiedra.getDurabilidad();
        float fuerza = picoPiedra.getFuerza();
        assertEquals(200,durabilidad);
        assertEquals(4,fuerza);
    }

    @Test
    void seCreaUnPicoDePiedraYDesgastaCorrectamente(){
        PicoPiedra picoPiedra = new PicoPiedra();
        float durabilidad = picoPiedra.getDurabilidad();
        picoPiedra.desgastar();
        assertEquals(durabilidad - (float) (4/1.5), picoPiedra.getDurabilidad());
    }

    @Test
    void seCreaUnPicoDeMetalCorrectamente(){
        PicoMetal picoMetal = new PicoMetal();
        float durabilidad = picoMetal.getDurabilidad();
        float fuerza = picoMetal.getFuerza();
        assertEquals(400,durabilidad);
        assertEquals(12,fuerza);
    }

    @Test
    void seCreaUnPicoDeMetalSeUsaYNoCambiaDurabilidad(){
        PicoMetal picoMetal = new PicoMetal();
        float durabilidad = picoMetal.getDurabilidad();
        picoMetal.desgastar();
        assertEquals(durabilidad, picoMetal.getDurabilidad());
    }

    @Test
    void seCreaUnPicoFinoCorrectamnete(){
        PicoFino picoFino = new PicoFino();
        float durabilidad = picoFino.getDurabilidad();
        float fuerza = picoFino.getFuerza();
        assertEquals(1000,durabilidad);
        assertEquals(20,fuerza);
    }

    @Test
    void seCreaPicoFinoYSedesgastaCorrectamente(){
        PicoFino picoFino = new PicoFino();
        float durabilidad = picoFino.getDurabilidad();
        picoFino.desgastar();
        assertEquals(durabilidad - (durabilidad/10), picoFino.getDurabilidad());
    }
}
