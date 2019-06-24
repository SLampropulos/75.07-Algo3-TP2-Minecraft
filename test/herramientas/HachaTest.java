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
        int durabilidad = hachaMadera.obtenerDurabilidad();

        assertEquals(durabilidad, 100);
    }

    @Test
    void seCreaHachaMaderaConFuerzaCorrecta(){
        HachaMadera hachaMadera = new HachaMadera();
        int fuerza = hachaMadera.obtenerFuerza();
        assertEquals(fuerza, 2);
    }

    @Test
    void seDesgastaUnaHachaDeMadera(){
        HachaMadera hachaMadera = new HachaMadera();
        int durabilidad = hachaMadera.obtenerDurabilidad();
        hachaMadera.desgastar();

        assertEquals(durabilidad-2, hachaMadera.obtenerDurabilidad());
    }

    @Test
    void seCreaHachaPiedraConDurabilidadCorrecta(){
        Herramienta hachaPiedra = new HachaPiedra();
        int durabilidad = hachaPiedra.obtenerDurabilidad();

        assertEquals(durabilidad, 200);
    }

    @Test
    void seCreaHachaPiedraConFuerzaCorrecta(){
        Herramienta hachaPiedra = new HachaPiedra();
        int fuerza = hachaPiedra.obtenerFuerza();

        assertEquals(fuerza, 5);
    }

    @Test
    void seDesgastaUnaHachaDePiedra(){
        HachaPiedra hachaPiedra = new HachaPiedra();
        int durabilidad = hachaPiedra.obtenerDurabilidad();
        hachaPiedra.desgastar();

        assertEquals(durabilidad-5, hachaPiedra.obtenerDurabilidad());
    }

    @Test
    void seCreaHachaMetalConDurabilidadCorrecta(){
        HachaMetal hachaMetal= new HachaMetal();
        int durabilidad = hachaMetal.obtenerDurabilidad();
        assertEquals(400, durabilidad);
    }

    @Test
    void seCreaHachaMetalConFuerzaCorrecta(){
        HachaMetal hachaMetal = new HachaMetal();
        int fuerza = hachaMetal.obtenerFuerza();
        assertEquals(10,fuerza);
    }

    @Test
    void seCreaHachaMetalSeDesgastaCorrectamente(){
        HachaMetal hachaMetal = new HachaMetal();
        int durabilidad = hachaMetal.obtenerDurabilidad();
        hachaMetal.desgastar();
        assertEquals(durabilidad-(hachaMetal.obtenerFuerza()/2),hachaMetal.obtenerDurabilidad());
    }

    @Test
    void hachaSeUtilizaContraMaterialNoAdecuadoYSeDesgasta(){
        Herramienta herramienta = new HachaMadera();
        Material material = new Diamante();
        herramienta.golpear(material);

        assertEquals(herramienta.obtenerDurabilidad(), 98);
    }
}
