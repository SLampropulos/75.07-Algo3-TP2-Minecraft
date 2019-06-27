package juego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Madera;
import materiales.Piedra;
import personaje.Jugador;

class MapaTest {

	private final int cantidadDeFilas = 16;
	private final int cantidadDeColumnas = 24;

	@Test
	void testAgregarMaderaPosicionVacia() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregar(unaMadera, 5, 6);

		assertEquals(unaMadera, mapa.getMaterialEn(5, 6));
	}

	@Test
	void testAgregarPiedraPosicionVacia() {
		Mapa mapa = new Mapa();
		Piedra unaPiedra = new Piedra();

		mapa.agregar(unaPiedra, 8, 9);

		assertEquals(unaPiedra, mapa.getMaterialEn(8, 9));
	}

	@Test
	void testAgregarJugadorPosicionVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.setJugador(jugador, 10, 15);
		assertEquals(10, mapa.getFilaJugador());
		assertEquals(15, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaDerechaVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.derecha();

		assertEquals(10, mapa.getFilaJugador());
		assertEquals(16, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaIzquierdaVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.izquierda();

		assertEquals(10, mapa.getFilaJugador());
		assertEquals(14, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaSuperiorVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.arriba();

		assertEquals(9, mapa.getFilaJugador());
		assertEquals(15, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaInferiorVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.abajo();

		assertEquals(11, mapa.getFilaJugador());
		assertEquals(15, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaDerechaConMaderaYNoSeMueve() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregar(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.derecha();

		assertEquals(unaMadera, mapa.getMaterialEn(10, 16));
		assertEquals(10, mapa.getFilaJugador());
		assertEquals(15, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaDerechaConMaderaYLaDesgasta() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregar(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		int durabilidadInicial = unaMadera.getDurabilidad();
		jugador.derecha();

		assertTrue(unaMadera.getDurabilidad() < durabilidadInicial);
	}

	@Test
	void testMoverJugadorFueraDeLimiteIzquierdoNoHaceNada() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.setMapa(mapa);
		mapa.setJugador(jugador, 0, 0);

		jugador.izquierda();

		assertEquals(0, mapa.getFilaJugador());
		assertEquals(0, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorFueraDeLimiteDerechoNoHaceNada() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.setMapa(mapa);
		mapa.setJugador(jugador, 0, cantidadDeColumnas);

		jugador.derecha();

		assertEquals(0, mapa.getFilaJugador());
		assertEquals(cantidadDeColumnas, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorFueraDeLimiteSuperiorNoHaceNada() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.setMapa(mapa);
		mapa.setJugador(jugador, 0, 0);

		jugador.arriba();

		assertEquals(0, mapa.getFilaJugador());
		assertEquals(0, mapa.getColumnaJugador());
	}

	@Test
	void testMoverJugadorFueraDeLimiteInferiorNoHaceNada() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.setMapa(mapa);
		mapa.setJugador(jugador, cantidadDeFilas, 0);

		jugador.abajo();

		assertEquals(cantidadDeFilas, mapa.getFilaJugador());
		assertEquals(0, mapa.getColumnaJugador());
	}

}
