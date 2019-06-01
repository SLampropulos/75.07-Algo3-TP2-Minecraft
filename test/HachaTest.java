import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaTest {

    @Test
    void seCreaHachaMaderaConDurabilidadCorrecta(){
        HachaMadera hachaMadera = new HachaMadera();
        int durabilidad = hachaMadera.getDurabilidad();

        assertEquals(durabilidad, 100);
    }

    @Test
    void seCreaHachaMaderaConDuerzaCorrecta(){
        HachaMadera hachaMadera = new HachaMadera();
        int fuerza = hachaMadera.getFuerza();
        assertEquals(fuerza, 2);
    }

    @Test
    void seDesgastaUnaHachaDeMadera(){
        HachaMadera hachaMadera = new HachaMadera();
        int durabilidad = hachaMadera.getDurabilidad();
        hachaMadera.desgastar();

        assertEquals(durabilidad-2, hachaMadera.getDurabilidad());
    }

    @Test
    void seCreaHachaPiedraConDurabilidadCorrecta(){
        Herramienta hachaPiedra = new HachaPiedra();
        int durabilidad = hachaPiedra.getDurabilidad();

        assertEquals(durabilidad, 200);
    }

    @Test
    void seCreaHachaPiedraConFuerzaCorrecta(){
        Herramienta hachaPiedra = new HachaPiedra();
        int fuerza = hachaPiedra.getFuerza();

        assertEquals(fuerza, 5);
    }

    @Test
    void seDesgastaUnaHachaDePiedra(){
        HachaPiedra hachaPiedra = new HachaPiedra();
        int durabilidad = hachaPiedra.getDurabilidad();
        hachaPiedra.desgastar();

        assertEquals(durabilidad-5, hachaPiedra.getDurabilidad());
    }

}
