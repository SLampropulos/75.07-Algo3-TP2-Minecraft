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
		mapa.agregarMaterial(unaMadera, 5, 5);
		Posicionable respuesta = mapa.getElementoEnCelda(5,5);
		assertEquals(unaMadera, respuesta);
	}

	@Test
	void testAgregarPiedraPosicionVacia() {
		Mapa mapa = new Mapa();
		Piedra unaPiedra = new Piedra();
		mapa.agregarMaterial(unaPiedra, 8, 8);
		Posicionable respuesta = mapa.getElementoEnCelda(8,8);
		assertEquals(unaPiedra, respuesta);
	}

	@Test
	void testAgregarJugadorPosicionVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.agregarJugador(jugador, 10, 10);
		Posicionable respuesta = mapa.getElementoEnCelda(10,10);
		assertEquals(jugador, respuesta);
	}

}
