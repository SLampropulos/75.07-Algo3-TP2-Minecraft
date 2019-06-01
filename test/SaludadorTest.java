import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaludadorTest {
    @Test
    void saludadorSaludaAUnaPersona(){
        Saludador saludador = new Saludador();
        String saludo = saludador.saludar();

        assertEquals(saludo, "hola");
    }

}
