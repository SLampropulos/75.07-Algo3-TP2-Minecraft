import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HerramientaTest {

    @Test
    void seCreaHachaMaderaConDurabilidadCorrecta(){
        Herramienta hachaMadera = Herramienta.HachaMadera();
        int durabilidad = hachaMadera.getDurabilidad();

        assertEquals(durabilidad, 100);
    }

    @Test
    void seCreaHachaMaderaConDuerzaCorrecta(){
        Herramienta hachaMadera = Herramienta.HachaMadera();
        int fuerza = hachaMadera.getFuerza();
        assertEquals(fuerza, 2);
    }
}
