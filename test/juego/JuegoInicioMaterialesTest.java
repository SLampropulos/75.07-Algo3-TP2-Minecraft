package juego;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;

class JuegoInicioMaterialesTest {

// Testea los cuatro extremos de los grupos y un pto. intermedio
	private int[] filasMadera = { 4, 4, 8, 8, 5 };
	private int[] columnasMadera = { 3, 11, 3, 11, 5 };

	private int[] filasPiedra = { 11, 11, 13, 13, 12 };
	private int[] columnasPiedra = { 8, 9, 8, 9, 8 };

	private int[] filasMetal = { 14, 14, 15, 15 };
	private int[] columnasMetal = { 20, 21, 20, 21 };

	private int[] filasDiamante = { 1, 1, 2, 2 };
	private int[] columnasDiamante = { 20, 21, 20, 21 };

	@Test
	void testCrearJuegoYQuedanMaderasBienUbicadasEnElMapa() {
		MineCraft mineCraft = new MineCraft();
		Mapa mapa = mineCraft.obtenerMapa();
		Celda celda;
		for (int i = 0; i < filasMadera.length; i++) {
			celda = mapa.obtenerCeldas()[filasMadera[i]][columnasMadera[i]];
			assertEquals(true, celda.obtenerMaterial() instanceof Madera);
		}
	}

	@Test
	void testCrearJuegoYQuedanPiedrasBienUbicadasEnElMapa() {
		MineCraft mineCraft = new MineCraft();
		Mapa mapa = mineCraft.obtenerMapa();
		Celda celda;
		for (int i = 0; i < filasPiedra.length; i++) {
			celda = mapa.obtenerCeldas()[filasPiedra[i]][columnasPiedra[i]];
			assertEquals(true, celda.obtenerMaterial() instanceof Piedra);
		}
	}

	@Test
	void testCrearJuegoYQuedanMetalesBienUbicadosEnElMapa() {
		MineCraft mineCraft = new MineCraft();
		Mapa mapa = mineCraft.obtenerMapa();
		Celda celda;
		for (int i = 0; i < filasMetal.length; i++) {
			celda = mapa.obtenerCeldas()[filasMetal[i]][columnasMetal[i]];
			assertEquals(true, celda.obtenerMaterial() instanceof Metal);
		}
	}

	@Test
	void testCrearJuegoYQuedanDiamantesBienUbicadosEnElMapa() {
		MineCraft mineCraft = new MineCraft();
		Mapa mapa = mineCraft.obtenerMapa();
		Celda celda;
		for (int i = 0; i < filasDiamante.length; i++) {
			celda = mapa.obtenerCeldas()[filasDiamante[i]][columnasDiamante[i]];
			assertEquals(true, celda.obtenerMaterial() instanceof Diamante);
		}
	}
}