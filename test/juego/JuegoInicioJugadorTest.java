package juego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import herramientas.HachaMadera;
import personaje.Jugador;

class JuegoInicioJugadorTest {

	private int filaJugadorEsperada = 14;
	private int columnaJugadorEsperada = 11;

	@Test
	void testCrearJuegoYQuedaJugadorBienUbicadoEnElMapa() {
		MineCraft mineCraft = new MineCraft();
		Mapa mapa = mineCraft.getMapa();
		assertEquals(filaJugadorEsperada, mapa.getFilaJugador());
		assertEquals(columnaJugadorEsperada, mapa.getColumnaJugador());
	}
	
	@Test
	void testCrearJuegoYQuedaJugadorConHachaMadera() {
		MineCraft mineCraft = new MineCraft();
		Jugador jugador = mineCraft.getJugador();
		assertEquals(true, jugador.getEquipado() instanceof HachaMadera);
	}
}
