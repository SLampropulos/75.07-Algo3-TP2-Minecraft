package juego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import materiales.Madera;
import materiales.Piedra;
import personaje.Jugador;

class MapaTest {

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
		float durabilidadInicial = unaMadera.getDurabilidad();
		jugador.derecha();

		assertTrue(unaMadera.getDurabilidad() < durabilidadInicial);
	}

}
