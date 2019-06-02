import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamanteTest {

    @Test
    public void diamanteEsGolpeadoPorHachaPiedraYNoSeReduceSuDurabilidad() {
        Diamante diamante = new Diamante();
        float durabilidad = diamante.getDurabilidad();
        HachaPiedra hacha = new HachaPiedra();

        diamante.desgastarCon(hacha);

        assertEquals(durabilidad, diamante.getDurabilidad());
    }

}
