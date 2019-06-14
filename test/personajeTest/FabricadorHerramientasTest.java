package personajeTest;

import herramientas.HachaMetal;
import herramientas.Herramienta;
import herramientas.PicoMadera;
import materiales.Madera;
import materiales.Material;
import materiales.Metal;
import personaje.FabricadorHerramientas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FabricadorHerramientasTest {

    @Test
    void fabicradorSeIniciaVacio(){
        FabricadorHerramientas fabrHerramientas = new FabricadorHerramientas();
        ArrayList componentesFabricacion = fabrHerramientas.getElementosFabricacoderes();
        int cantComponentesFabricacion = 9;
        assertEquals(cantComponentesFabricacion,componentesFabricacion.size());
    }

    @Test
    void fabricadorAniadeUnMaterial(){
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material madera = new Madera();
        fabricadorHerramientas.agregar(madera,1,1);

        assertEquals(madera,fabricadorHerramientas.obtener(1,1));
    }
    @Test
    void fabricadorCreaUnPicoMadera(){
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
    void fabricadorQuitaUnElemento(){
        FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
        Material madera = new Madera();
        fabricadorHerramientas.agregar(madera,1,1);
        assertEquals(madera,fabricadorHerramientas.obtener(1,1));
        fabricadorHerramientas.remover(1,1);
        assertTrue(madera != fabricadorHerramientas.obtener(1,1));
    }
    @Test
    void fabricadorFabricaHachaDeMetal(){
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
}
