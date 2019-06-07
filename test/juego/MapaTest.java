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
		assertEquals(unaMadera, mapa.getElementoEnCelda(5, 6));
		assertEquals(5, mapa.getFila(unaMadera));
		assertEquals(6, mapa.getColumna(unaMadera));
	}

	@Test
	void testAgregarPiedraPosicionVacia() {
		Mapa mapa = new Mapa();
		Piedra unaPiedra = new Piedra();
		mapa.agregar(unaPiedra, 8, 9);
		assertEquals(unaPiedra, mapa.getElementoEnCelda(8, 9));
		assertEquals(8, mapa.getFila(unaPiedra));
		assertEquals(9, mapa.getColumna(unaPiedra));
	}

	@Test
	void testAgregarJugadorPosicionVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		assertEquals(jugador, mapa.getElementoEnCelda(10, 15));
		assertEquals(10, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaDerechaVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irDerecha();
		assertEquals(null, mapa.getElementoEnCelda(10, 15));
		assertEquals(jugador, mapa.getElementoEnCelda(10, 16));
		assertEquals(10, mapa.getFila(jugador));
		assertEquals(16, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaIzquierdaVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irIzquierda();
		assertEquals(null, mapa.getElementoEnCelda(10, 15));
		assertEquals(jugador, mapa.getElementoEnCelda(10, 14));
		assertEquals(10, mapa.getFila(jugador));
		assertEquals(14, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaSuperiorVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irArriba();
		assertEquals(null, mapa.getElementoEnCelda(10, 15));
		assertEquals(jugador, mapa.getElementoEnCelda(9, 15));
		assertEquals(9, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaInferiorVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irAbajo();
		assertEquals(null, mapa.getElementoEnCelda(10, 15));
		assertEquals(jugador, mapa.getElementoEnCelda(11, 15));
		assertEquals(11, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	@Test
	void testMoverJugadorACeldaDerechaConMaderaYNoSeMueve() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();
		mapa.agregar(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		jugador.setMapa(mapa);
		jugador.irDerecha();
		assertEquals(unaMadera, mapa.getElementoEnCelda(10, 16));
		assertEquals(jugador, mapa.getElementoEnCelda(10, 15));
		assertEquals(10, mapa.getFila(jugador));
		assertEquals(15, mapa.getColumna(jugador));
	}

	//TODO Arreglar. Solo correo por los casteos especificos
	@Test
	void testMoverJugadorACeldaDerechaConMaderaYLaDesgasta() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();
		mapa.agregar(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.agregar(jugador, 10, 15);
		jugador.setMapa(mapa);
		float durabilidadInicial = unaMadera.getDurabilidad();
		jugador.irDerecha();
		assertTrue(unaMadera.getDurabilidad() < durabilidadInicial);
	}

}
