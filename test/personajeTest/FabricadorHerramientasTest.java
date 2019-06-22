package personajeTest;

import excepciones.EspacioOcupadoException;
import excepciones.ExceptionFabricacionNoValida;
import herramientas.HachaMetal;
import herramientas.Herramienta;
import herramientas.PicoMadera;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import personaje.FabricadorHerramientas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FabricadorHerramientasTest {

    @Test
    void fabicradorSeIniciaVacio(){
        FabricadorHerramientas fabrHerramientas = new FabricadorHerramientas();
        ArrayList componentesFabricacion = fabrHerramientas.getMateriales();
        int cantComponentesFabricacion = 9;
        assertEquals(cantComponentesFabricacion,componentesFabricacion.size());
    }

    @Test
    void fabricadorAniadeUnMaterial() throws EspacioOcupadoException {
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material madera = new Madera();
        fabricadorHerramientas.agregar(madera,1,1);

        assertEquals(madera,fabricadorHerramientas.obtener(1,1));
    }
    @Test
    void fabricadorCreaUnPicoMadera() throws EspacioOcupadoException, ExceptionFabricacionNoValida {
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material madera = new Madera();
        for(int i=0; i<3; i++){
            fabricadorHerramientas.agregar(madera,i,0);
        }
        fabricadorHerramientas.agregar(madera,1,1);
        fabricadorHerramientas.agregar(madera,1,2);

        Herramienta herramientaFabricada = fabricadorHerramientas.fabricar();

        assertEquals(herramientaFabricada.getClass(), PicoMadera.class);
    }
    @Test
    void fabricadorQuitaUnElemento() throws EspacioOcupadoException {
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material madera = new Madera();
        fabricadorHerramientas.agregar(madera,1,1);
        assertEquals(madera,fabricadorHerramientas.obtener(1,1));
        fabricadorHerramientas.remover(1,1);
        assertTrue(madera != fabricadorHerramientas.obtener(1,1));
    }
    @Test
    void fabricadorFabricaHachaDeMetal() throws EspacioOcupadoException, ExceptionFabricacionNoValida {
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material metal = new Metal();
        Material madera = new Madera();
        fabricadorHerramientas.agregar(metal,0,0);
        fabricadorHerramientas.agregar(metal,0,1);
        fabricadorHerramientas.agregar(metal,1,0);
        fabricadorHerramientas.agregar(madera,1,1);
        fabricadorHerramientas.agregar(madera,1,2);

        Herramienta herramienta = fabricadorHerramientas.fabricar();

        assertEquals(herramienta.getClass(), HachaMetal.class);
    }

    @Test
    void fabricadorAgregaUnMaterialEnDondeYaHayUnoTieraExcepcion() throws EspacioOcupadoException {
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material madera = new Madera();
        Material metal = new Metal();

        fabricadorHerramientas.agregar(madera,0,0);

        assertThrows(EspacioOcupadoException.class, ()->{ fabricadorHerramientas.agregar(metal,0,0); });
    }

}
