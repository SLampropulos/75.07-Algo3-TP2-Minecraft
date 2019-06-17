package juego;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import materiales.Madera;

class JuegoTest {

	private int[] filasMadera = { 4, 4, 8, 8, 5 };
	private int[] columnasMadera = { 3, 11, 3, 11, 5 };

	@Test
	void testCrearJuegoYQuedanMaderasUbicadasEnElMapa() {
		MineCraft mineCraft = new MineCraft();
		Mapa mapa = mineCraft.getMapa();
		Celda celda;
		for (int i = 0; i < filasMadera.length; i++) {
			celda = mapa.getCeldas()[filasMadera[i]][columnasMadera[i]];
			assertEquals(true, celda.getMaterial() instanceof Madera);
		}
	}
}