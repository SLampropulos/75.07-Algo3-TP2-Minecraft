import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaTest {

    @Test
    void seCreaHachaMaderaConDurabilidadCorrecta(){
        HachaMadera hachaMadera = new HachaMadera();
        float durabilidad = hachaMadera.getDurabilidad();

        assertEquals(durabilidad, 100);
    }

    @Test
    void seCreaHachaMaderaConDuerzaCorrecta(){
        HachaMadera hachaMadera = new HachaMadera();
        float fuerza = hachaMadera.getFuerza();
        assertEquals(fuerza, 2);
    }

    @Test
    void seDesgastaUnaHachaDeMadera(){
        HachaMadera hachaMadera = new HachaMadera();
        float durabilidad = hachaMadera.getDurabilidad();
        hachaMadera.desgastar();

        assertEquals(durabilidad-2, hachaMadera.getDurabilidad());
    }

    @Test
    void seCreaHachaPiedraConDurabilidadCorrecta(){
        Herramienta hachaPiedra = new HachaPiedra();
        float durabilidad = hachaPiedra.getDurabilidad();

        assertEquals(durabilidad, 200);
    }

    @Test
    void seCreaHachaPiedraConFuerzaCorrecta(){
        Herramienta hachaPiedra = new HachaPiedra();
        float fuerza = hachaPiedra.getFuerza();

        assertEquals(fuerza, 5);
    }

    @Test
    void seDesgastaUnaHachaDePiedra(){
        HachaPiedra hachaPiedra = new HachaPiedra();
        float durabilidad = hachaPiedra.getDurabilidad();
        hachaPiedra.desgastar();

        assertEquals(durabilidad-5, hachaPiedra.getDurabilidad());
    }

    @Test
    void seCreaHachaMetalConDurabilidadCorrecta(){
        HachaMetal hachaMetal= new HachaMetal();
        float durabilidad = hachaMetal.getDurabilidad();
        assertEquals(400, durabilidad);
    }

    @Test
    void seCreaHachaMetalConFuerzaCorrecta(){
        HachaMetal hachaMetal = new HachaMetal();
        float fuerza = hachaMetal.getFuerza();
        assertEquals(10,fuerza);
    }

    @Test
    void seCreaHachaMetalSeDesgastaCorrectamente(){
        HachaMetal hachaMetal = new HachaMetal();
        float durabilidad = hachaMetal.getDurabilidad();
        hachaMetal.desgastar();
        assertEquals(durabilidad-(hachaMetal.getFuerza()/2),hachaMetal.getDurabilidad());
    }
}
