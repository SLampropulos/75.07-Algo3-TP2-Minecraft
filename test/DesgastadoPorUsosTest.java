import Herramientas.Desgastador.DesgatadorPorUsos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesgastadoPorUsosTest {

    @Test
    void desgastadorPorUsosSeCreaCorractamente(){
        DesgatadorPorUsos desgatadorPorUsos = new DesgatadorPorUsos(2,5);
        int usosRestante = desgatadorPorUsos.usosRestante();
        assertEquals(2,usosRestante);
    }

    @Test
    void desgastadorPorUsosSeUsaTotosSusUsosSuDurabilidadEsCero(){
        DesgatadorPorUsos desgatadorPorUsos = new DesgatadorPorUsos(3,5);
        int desgastado = 0;
        for (int i=0; i < 4; i++){
            desgastado = desgatadorPorUsos.calcularDesgaste();
        }
        assertEquals(5,desgastado);
    }

}

