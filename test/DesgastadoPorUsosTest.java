import Herramientas.Desgastador.DesgastadorPorUsos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesgastadoPorUsosTest {

    @Test
    void desgastadorPorUsosSeCreaCorractamente(){
        DesgastadorPorUsos desgatadorPorUsos = new DesgastadorPorUsos(2,5);
        int usosRestante = desgatadorPorUsos.usosRestante();
        assertEquals(2,usosRestante);
    }

    @Test
    void desgastadorPorUsosSeUsaTotosSusUsosSuDurabilidadEsCero(){
        DesgastadorPorUsos desgatadorPorUsos = new DesgastadorPorUsos(3,5);
        float desgastado = 0;
        for (int i=0; i < 4; i++){
            desgastado = desgatadorPorUsos.calcularDesgaste();
        }
        assertEquals(5,desgastado);
    }

}

