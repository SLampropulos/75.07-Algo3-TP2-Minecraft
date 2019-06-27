package herramientas.desgastador;
import org.junit.jupiter.api.Test;

import herramientas.desgastador.DesgastadorPorUsos;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesgastadoPorUsosTest {

    @Test
    void desgastadorPorUsosSeCreaCorrectamente(){
        DesgastadorPorUsos desgatadorPorUsos = new DesgastadorPorUsos(2,5);
        int usosRestante = desgatadorPorUsos.usosRestantes();
        assertEquals(2,usosRestante);
    }

    @Test
    void desgastadorPorUsosSeAlcanzaLimiteDeUsosYSuDurabilidadEsCero(){
        DesgastadorPorUsos desgastadorPorUsos = new DesgastadorPorUsos(3,5);
        int desgastado = 0;
        for (int i=0; i < 4; i++){
            desgastado = desgastadorPorUsos.calcularDesgaste();
        }
        assertEquals(5,desgastado);
    }

}

