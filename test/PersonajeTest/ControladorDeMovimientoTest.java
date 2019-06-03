package PersonajeTest;

import Personaje.ControladorDeMovimiento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControladorDeMovimientoTest {

    @Test
    void seCreaMovedorSeInicilizaBienTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        int valor1 = controladorDeMovimiento.getHorizontal();
        int valor2 = controladorDeMovimiento.getVertical();

        assertEquals(1,valor1);
        assertEquals(1,valor2);
    }

    @Test
    void controladorSeMueveAlOesteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movDerecha();

        assertEquals(2,controladorDeMovimiento.getHorizontal());
    }
    @Test
    void controladorSeMueveAlEsteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movIzq();

        assertEquals(0,controladorDeMovimiento.getHorizontal());
    }

    @Test
    void controladorSeMueveAlNorteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movArriba();

        assertEquals(2,controladorDeMovimiento.getVertical());
    }

    @Test
    void controladorSeMueveAlSurTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movAbajo();

        assertEquals(0,controladorDeMovimiento.getVertical());
    }

    @Test
    void controladorSeMueveAlNoroesteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movArribaDerecha();

        assertEquals(2,controladorDeMovimiento.getHorizontal());
        assertEquals(2,controladorDeMovimiento.getVertical());
    }

    @Test
    void controladorSeMueveAlNoresteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movArribaIzq();

        assertEquals(0,controladorDeMovimiento.getHorizontal());
        assertEquals(2,controladorDeMovimiento.getVertical());
    }

    @Test
    void controladorSeMueveAlSuroesteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movAbajoDerecha();

        assertEquals(2,controladorDeMovimiento.getHorizontal());
        assertEquals(0,controladorDeMovimiento.getVertical());
    }

    @Test
    void controladorSeMueveAlSuresteTest(){
        ControladorDeMovimiento controladorDeMovimiento = new ControladorDeMovimiento(1,1);
        controladorDeMovimiento.movAbajoIzq();

        assertEquals(0,controladorDeMovimiento.getHorizontal());
        assertEquals(0,controladorDeMovimiento.getVertical());
    }


}
