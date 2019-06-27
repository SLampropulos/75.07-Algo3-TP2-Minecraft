package herramientas;
import herramientas.HachaMadera;
import herramientas.HachaMetal;
import herramientas.HachaPiedra;
import herramientas.Herramienta;
import materiales.Diamante;
import materiales.Material;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HachaTest {

    @Test
    void seCreaHachaMaderaConDurabilidadCorrecta(){
        Herramienta hachaMadera = new HachaMadera();
        int durabilidad = hachaMadera.getDurabilidad();

        assertEquals(durabilidad, 100);
    }

    @Test
    void seCreaHachaMaderaConFuerzaCorrecta(){
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

    @Test
    void seCreaHachaMetalConDurabilidadCorrecta(){
        HachaMetal hachaMetal= new HachaMetal();
        int durabilidad = hachaMetal.getDurabilidad();
        assertEquals(400, durabilidad);
    }

    @Test
    void seCreaHachaMetalConFuerzaCorrecta(){
        HachaMetal hachaMetal = new HachaMetal();
        int fuerza = hachaMetal.getFuerza();
        assertEquals(10,fuerza);
    }

    @Test
    void seCreaHachaMetalSeDesgastaCorrectamente(){
        HachaMetal hachaMetal = new HachaMetal();
        int durabilidad = hachaMetal.getDurabilidad();
        hachaMetal.desgastar();
        assertEquals(durabilidad-(hachaMetal.getFuerza()/2),hachaMetal.getDurabilidad());
    }

    @Test
    void hachaSeUtilizaContraMaterialNoAdecuadoYSeDesgasta(){
        Herramienta herramienta = new HachaMadera();
        Material material = new Diamante();
        herramienta.golpear(material);

        assertEquals(herramienta.getDurabilidad(), 98);
    }
}
