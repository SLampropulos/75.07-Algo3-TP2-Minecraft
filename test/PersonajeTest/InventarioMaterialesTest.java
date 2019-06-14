package PersonajeTest;

import Exceptions.NoHayMaterialException;
import Materiales.*;
import Personaje.InventarioMateriales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventarioMaterialesTest {

    @Test
    void inventarioIniciaSinNingunaMadera() {
        InventarioMateriales inventario = new InventarioMateriales();

        assertEquals(0, inventario.cantidadDeMadera());
    }

    @Test
    void inventarioIniciaSinNingunMetal() {
        InventarioMateriales inventario = new InventarioMateriales();

        assertEquals(0, inventario.cantidadDeMetal());
    }

    @Test
    void inventarioIniciaSinNingunaPiedra() {
        InventarioMateriales inventario = new InventarioMateriales();

        assertEquals(0, inventario.cantidadDePiedra());
    }

    @Test
    void inventarioIniciaSinNingunDiamante() {
        InventarioMateriales inventario = new InventarioMateriales();

        assertEquals(0, inventario.cantidadDeDiamante());
    }

    @Test
    void inventarioSeAgregaMaderaYAumentaCantidadDeMadera() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material madera = new Madera();

        inventario.agregar(madera);

        assertEquals(1, inventario.cantidadDeMadera());
    }

    @Test
    void inventarioSeAgregaMetalYAumentaCantidadDeMetal() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material metal = new Metal();

        inventario.agregar(metal);

        assertEquals(1, inventario.cantidadDeMetal());
    }

    @Test
    void inventarioSeAgregaPiedraYAumentaCantidadDePiedra() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material piedra = new Piedra();

        inventario.agregar(piedra);

        assertEquals(1, inventario.cantidadDePiedra());
    }

    @Test
    void inventarioSeAgregaDiamanteYAumentaCantidadDeDiamante() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material diamante = new Diamante();

        inventario.agregar(diamante);

        assertEquals(1, inventario.cantidadDeDiamante());
    }

    @Test
    void inventarioSeAgregaMaderaYNoAumentaCantidadDeOtrosMateriales() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material madera = new Madera();

        inventario.agregar(madera);

        assertEquals(0, inventario.cantidadDePiedra());
        assertEquals(0, inventario.cantidadDeMetal());
        assertEquals(0, inventario.cantidadDeDiamante());
    }

    @Test
    void inventarioSeAgregaMetalYNoAumentaCantidadDeOtrosMateriales() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material metal = new Metal();

        inventario.agregar(metal);

        assertEquals(0, inventario.cantidadDePiedra());
        assertEquals(0, inventario.cantidadDeMadera());
        assertEquals(0, inventario.cantidadDeDiamante());
    }

    @Test
    void inventarioSeAgregaPiedraYNoAumentaCantidadDeOtrosMateriales() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material piedra = new Piedra();

        inventario.agregar(piedra);

        assertEquals(0, inventario.cantidadDeMadera());
        assertEquals(0, inventario.cantidadDeMetal());
        assertEquals(0, inventario.cantidadDeDiamante());
    }

    @Test
    void inventarioSeAgregaDiamanteYNoAumentaCantidadDeOtrosMateriales() {
        InventarioMateriales inventario = new InventarioMateriales();
        Material diamante = new Diamante();

        inventario.agregar(diamante);

        assertEquals(0, inventario.cantidadDePiedra());
        assertEquals(0, inventario.cantidadDeMetal());
        assertEquals(0, inventario.cantidadDeMadera());
    }

    @Test
    void inventarioSeQuitaMaterialYEsDevueltoCorrectamente() throws NoHayMaterialException {
        InventarioMateriales inventario = new InventarioMateriales();
        Material madera = new Madera();

        inventario.agregar(madera);
        Material laMismaMadera = inventario.quitar(Madera.class);

        assertEquals(madera, laMismaMadera);
    }

    @Test
    void inventarioVacioTiraExcepcionSiSeIntentaObtenerMaterial() {
        InventarioMateriales inventario = new InventarioMateriales();

        assertThrows(NoHayMaterialException.class, ()->{inventario.quitar(Madera.class);});
    }

}