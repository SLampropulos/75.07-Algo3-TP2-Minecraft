package juego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Materiales.Madera;
import Materiales.Piedra;
import Personaje.Jugador;

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
		assertEquals(10, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaDerechaVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irDerecha();

		assertEquals(10, mapa.getFila(jugador));
		assertEquals(16, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaIzquierdaVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irIzquierda();

		assertEquals(10, mapa.getFila(jugador));
		assertEquals(14, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaSuperiorVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irArriba();

		assertEquals(9, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaInferiorVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irAbajo();

		assertEquals(11, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaDerechaConMaderaYNoSeMueve() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregar(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.setJugador(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irDerecha();

		assertEquals(unaMadera, mapa.getMaterialEn(10, 16));
		assertEquals(10, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
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
		jugador.irDerecha();

		assertTrue(unaMadera.getDurabilidad() < durabilidadInicial);
	}

}
