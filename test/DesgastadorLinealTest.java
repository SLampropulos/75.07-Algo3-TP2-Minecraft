import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesgastadorLinealTest {

    @Test
    void seDesgastaLinealMente(){
        DesgatadorLineal desgatadorLineal = new DesgatadorLineal(1,1);
        int desgastado = desgatadorLineal.calcularDesgaste();
        assertEquals(desgastado,1);
    }

    @Test
    void seDesgastaDiezVecesCorrectamente(){
        DesgatadorLineal desgatadorLineal = new DesgatadorLineal(1,1);
        int desgastado = 0;
        for (int i=0; i<10; i++) {
            desgastado += desgatadorLineal.calcularDesgaste();
        }
        assertEquals(10,desgastado);
    }

    @Test
    void seDesgastaLinealMenteConFuerzaCuatroYInDiceDesgasteDos(){
        DesgatadorLineal desgatadorLineal = new DesgatadorLineal(4,2);
        int desgastado = desgatadorLineal.calcularDesgaste();
        assertEquals(desgastado,2);
    }



}
