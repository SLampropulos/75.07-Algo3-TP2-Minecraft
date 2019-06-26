package juego;

import excepciones.GameOverException;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;
import personaje.Jugador;

public class MineCraft {

	private Mapa mapa;
	private Jugador jugador;
	
	static final int POSICION_INICIAL_HORIZONTAL_JUGADOR = 14;
	static final int POSICION_INICIAL_VERTICAL_JUGADOR = 11;
	
	static final int POSICION_INICIO_HORIZONTAL_MADERA = 4;
	static final int POSICION_FIN_HORIZONTAL_MADERA = 9;
	static final int POSICION_INICIO_VERTICAL_MADERA = 3;
	static final int POSICION_FIN_VERTICAL_MADERA = 12;
	
	static final int POSICION_INICIO_HORIZONTAL_PIEDRA = 11;
	static final int POSICION_FIN_HORIZONTAL_PIEDRA = 14;
	static final int POSICION_INICIO_VERTICAL_PIEDRA = 8;
	static final int POSICION_FIN_VERTICAL_PIEDRA = 10;
	
	static final int POSICION_INICIO_HORIZONTAL_METAL = 14;
	static final int POSICION_FIN_HORIZONTAL_METAL = 16;
	static final int POSICION_INICIO_VERTICAL_METAL = 20;
	static final int POSICION_FIN_VERTICAL_METAL = 22;
	
	static final int POSICION_INICIO_HORIZONTAL_DIAMANTE = 1;
	static final int POSICION_FIN_HORIZONTAL_DIAMANTE = 3;
	static final int POSICION_INICIO_VERTICAL_DIAMANTE = 20;
	static final int POSICION_FIN_VERTICAL_DIAMANTE = 22;
	
	
	public MineCraft() {
		mapa = new Mapa();
		armarMapa();
		jugador = new Jugador();
		jugador.setMapa(mapa);
		mapa.setJugador(jugador, POSICION_INICIAL_HORIZONTAL_JUGADOR, POSICION_INICIAL_VERTICAL_JUGADOR);
		
	}

	private void armarMapa() {
		for (int fila = POSICION_INICIO_HORIZONTAL_MADERA; fila < POSICION_FIN_HORIZONTAL_MADERA; fila++)
			for (int columna = POSICION_INICIO_VERTICAL_MADERA; columna < POSICION_FIN_VERTICAL_MADERA; columna++)
				mapa.agregar(new Madera(), fila, columna);

		for (int fila = POSICION_INICIO_HORIZONTAL_PIEDRA; fila < POSICION_FIN_HORIZONTAL_PIEDRA; fila++)
			for (int columna = POSICION_INICIO_VERTICAL_PIEDRA; columna < POSICION_FIN_VERTICAL_PIEDRA; columna++)
				mapa.agregar(new Piedra(), fila, columna);

			for (int fila = POSICION_INICIO_HORIZONTAL_METAL; fila < POSICION_FIN_HORIZONTAL_METAL; fila++) 
				for (int columna = POSICION_INICIO_VERTICAL_METAL; columna < POSICION_FIN_VERTICAL_METAL; columna++) 
					mapa.agregar(new Metal(), fila,columna);

			for (int fila = POSICION_INICIO_HORIZONTAL_DIAMANTE; fila < POSICION_FIN_HORIZONTAL_DIAMANTE; fila++)
				for (int columna = POSICION_INICIO_VERTICAL_DIAMANTE; columna < POSICION_FIN_VERTICAL_DIAMANTE; columna++)
					mapa.agregar(new Diamante(), fila, columna);
	}

	public Mapa getMapa() {
		return mapa;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void actualizar() throws GameOverException {
		if (jugador.getEquipado() == null)
			throw new GameOverException();
	}
}
