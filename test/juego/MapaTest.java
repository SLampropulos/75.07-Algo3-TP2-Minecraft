package juego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.NoHayHerramientaExcepcion;
import materiales.Madera;
import materiales.Piedra;
import personaje.Jugador;
import juego.Mapa;

class MapaTest {

	private final int cantidadDeFilas = 16;
	private final int cantidadDeColumnas = 24;

	@Test
	void testAgregarMaderaPosicionVacia() {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregarMaterial(unaMadera, 5, 6);

		assertEquals(unaMadera, mapa.obtenerMaterialEn(5, 6));
	}

	@Test
	void testAgregarPiedraPosicionVacia() {
		Mapa mapa = new Mapa();
		Piedra unaPiedra = new Piedra();

		mapa.agregarMaterial(unaPiedra, 8, 9);

		assertEquals(unaPiedra, mapa.obtenerMaterialEn(8, 9));
	}

	@Test
	void testAgregarJugadorPosicionVacia() {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		mapa.declararJugador(jugador, 10, 15);
		assertEquals(10, mapa.obtenerFilaJugador());
		assertEquals(15, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaDerechaVacia() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.declararJugador(jugador, 10, 15);
		jugador.declararMapa(mapa);
		try {
			jugador.derecha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(10, mapa.obtenerFilaJugador());
		assertEquals(16, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaIzquierdaVacia() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.declararJugador(jugador, 10, 15);
		jugador.declararMapa(mapa);
		try {
			jugador.izquierda();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(10, mapa.obtenerFilaJugador());
		assertEquals(14, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaSuperiorVacia() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.declararJugador(jugador, 10, 15);
		jugador.declararMapa(mapa);
		try {
			jugador.arriba();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(9, mapa.obtenerFilaJugador());
		assertEquals(15, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaInferiorVacia() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();

		mapa.declararJugador(jugador, 10, 15);
		jugador.declararMapa(mapa);
		try {
			jugador.abajo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(11, mapa.obtenerFilaJugador());
		assertEquals(15, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaDerechaConMaderaYNoSeMueve() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregarMaterial(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.declararJugador(jugador, 10, 15);
		jugador.declararMapa(mapa);
		try {
			jugador.derecha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(unaMadera, mapa.obtenerMaterialEn(10, 16));
		assertEquals(10, mapa.obtenerFilaJugador());
		assertEquals(15, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorACeldaDerechaConMaderaYLaDesgasta() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Madera unaMadera = new Madera();

		mapa.agregarMaterial(unaMadera, 10, 16);
		Jugador jugador = new Jugador();
		mapa.declararJugador(jugador, 10, 15);
		jugador.declararMapa(mapa);
		float durabilidadInicial = unaMadera.obtenerDurabilidad();
		try {
			jugador.derecha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertTrue(unaMadera.obtenerDurabilidad() < durabilidadInicial);
	}

	@Test
	void testMoverJugadorFueraDeLimiteIzquierdoNoHaceNada() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.declararMapa(mapa);
		mapa.declararJugador(jugador, 0, 0);

		jugador.izquierda();

		assertEquals(0, mapa.obtenerFilaJugador());
		assertEquals(0, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorFueraDeLimiteDerechoNoHaceNada() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.declararMapa(mapa);
		mapa.declararJugador(jugador, 0, cantidadDeColumnas);

		try {
			jugador.derecha();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(0, mapa.obtenerFilaJugador());
		assertEquals(cantidadDeColumnas, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorFueraDeLimiteSuperiorNoHaceNada() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.declararMapa(mapa);
		mapa.declararJugador(jugador, 0, 0);

		try {
			jugador.arriba();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(0, mapa.obtenerFilaJugador());
		assertEquals(0, mapa.obtenerColumnaJugador());
	}

	@Test
	void testMoverJugadorFueraDeLimiteInferiorNoHaceNada() throws NoHayHerramientaExcepcion {
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		jugador.declararMapa(mapa);
		mapa.declararJugador(jugador, cantidadDeFilas, 0);

		try {
			jugador.abajo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(cantidadDeFilas, mapa.obtenerFilaJugador());
		assertEquals(0, mapa.obtenerColumnaJugador());
	}

}
