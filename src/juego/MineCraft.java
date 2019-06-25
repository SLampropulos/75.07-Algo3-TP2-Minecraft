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
	
	public MineCraft() {
		mapa = new Mapa();
		armarMapa();
		jugador = new Jugador();
		jugador.setMapa(mapa);
		mapa.setJugador(jugador, 14, 11);
		
	}

	private void armarMapa() {
		for (int fila = 4; fila < 9; fila++)
			for (int columna = 3; columna < 12; columna++)
				mapa.agregar(new Madera(), fila, columna);

		for (int fila = 11; fila < 14; fila++)
			for (int columna = 8; columna < 10; columna++)
				mapa.agregar(new Piedra(), fila, columna);

			for (int fila = 14; fila < 16; fila++) 
				for (int columna = 20; columna < 22; columna++) 
					mapa.agregar(new Metal(), fila,columna);

			for (int fila = 1; fila < 3; fila++)
				for (int columna = 20; columna < 22; columna++)
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
