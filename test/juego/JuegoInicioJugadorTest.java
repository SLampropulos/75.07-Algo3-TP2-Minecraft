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
		Mapa mapa = mineCraft.obtenerMapa();
		assertEquals(filaJugadorEsperada, mapa.obtenerFilaJugador());
		assertEquals(columnaJugadorEsperada, mapa.obtenerColumnaJugador());
	}
	
	@Test
	void testCrearJuegoYQuedaJugadorConHachaMadera() {
		MineCraft mineCraft = new MineCraft();
		Jugador jugador = mineCraft.obtenerJugador();
		assertEquals(true, jugador.obtenerHerramientaEquipada() instanceof HachaMadera);
	}
}
