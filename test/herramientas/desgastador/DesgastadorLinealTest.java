package herramientas.desgastador;
import org.junit.jupiter.api.Test;

import herramientas.desgastador.DesgastadorLineal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesgastadorLinealTest {

    @Test
    void seDesgastaLinealMente(){
        DesgastadorLineal desgatadorLineal = new DesgastadorLineal(1,1);
        float desgastado = desgatadorLineal.calcularDesgaste();
        assertEquals(desgastado,1);
    }

    @Test
    void seDesgastaDiezVecesCorrectamente(){
        DesgastadorLineal desgatadorLineal = new DesgastadorLineal(1,1);
        float desgastado = 0;
        for (int i=0; i<10; i++) {
            desgastado += desgatadorLineal.calcularDesgaste();
        }
        assertEquals(10,desgastado);
    }

    @Test
    void seDesgastaLinealMenteConFuerzaCuatroYInDiceDesgasteDos(){
        DesgastadorLineal desgatadorLineal = new DesgastadorLineal(4,2);
        float desgastado = desgatadorLineal.calcularDesgaste();
        assertEquals(desgastado,2);
    }



}
