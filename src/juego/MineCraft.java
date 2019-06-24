package juego;

import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;
import personaje.Jugador;

public class MineCraft {

	//Declaración de constantes
	static final int POSICION_MIN_COLOCAR_MADERA_EN_FILA = 4;
	static final int POSICION_MAX_COLOCAR_MADERA_EN_FILA = 9;
	static final int POSICION_MIN_COLOCAR_MADERA_EN_COLUMNA = 3;
	static final int POSICION_MAX_COLOCAR_MADERA_EN_COLUMNA = 12;
	static final int POSICION_MIN_COLOCAR_PIEDRA_EN_FILA = 11;
	static final int POSICION_MAX_COLOCAR_PIEDRA_EN_FILA = 14;
	static final int POSICION_MIN_COLOCAR_PIEDRA_EN_COLUMNA = 8;
	static final int POSICION_MAX_COLOCAR_PIEDRA_EN_COLUMNA = 10;
	static final int POSICION_MIN_COLOCAR_METAL_EN_FILA = 14;
	static final int POSICION_MAX_COLOCAR_METAL_EN_FILA = 16;
	static final int POSICION_MIN_COLOCAR_METAL_EN_COLUMNA = 20;
	static final int POSICION_MAX_COLOCAR_METAL_EN_COLUMNA = 22;
	static final int POSICION_MIN_COLOCAR_DIAMANTE_EN_FILA = 1;
	static final int POSICION_MAX_COLOCAR_DIAMANTE_EN_FILA = 3;
	static final int POSICION_MIN_COLOCAR_DIAMANTE_EN_COLUMNA = 20;
	static final int POSICION_MAX_COLOCAR_DIAMANTE_EN_COLUMNA = 22;
	
	//Variables reservadas
	private Mapa mapa;
	private Jugador jugador;
	
	//Constructor del juego
	public MineCraft() {
		mapa = new Mapa();
		inicializarMapa();
		jugador = new Jugador();
		jugador.declararMapa(mapa);
		mapa.declararJugador(jugador, 14, 11);
	}

	//Pre: El mapa fue creado
	//Post: Se inicializa el mapa con materiales distribuidos
	private void inicializarMapa() {
		mapa.agregarMaterialEnRango(new Madera(), POSICION_MIN_COLOCAR_MADERA_EN_FILA, POSICION_MAX_COLOCAR_MADERA_EN_FILA, POSICION_MIN_COLOCAR_MADERA_EN_COLUMNA, POSICION_MAX_COLOCAR_MADERA_EN_COLUMNA);
		mapa.agregarMaterialEnRango(new Piedra(), POSICION_MIN_COLOCAR_PIEDRA_EN_FILA, POSICION_MAX_COLOCAR_PIEDRA_EN_FILA, POSICION_MIN_COLOCAR_PIEDRA_EN_COLUMNA, POSICION_MAX_COLOCAR_PIEDRA_EN_COLUMNA);
		mapa.agregarMaterialEnRango(new Metal(), POSICION_MIN_COLOCAR_METAL_EN_FILA, POSICION_MAX_COLOCAR_METAL_EN_FILA, POSICION_MIN_COLOCAR_METAL_EN_COLUMNA, POSICION_MAX_COLOCAR_METAL_EN_COLUMNA);
		mapa.agregarMaterialEnRango(new Diamante(), POSICION_MIN_COLOCAR_DIAMANTE_EN_FILA, POSICION_MAX_COLOCAR_DIAMANTE_EN_FILA, POSICION_MIN_COLOCAR_DIAMANTE_EN_COLUMNA, POSICION_MAX_COLOCAR_DIAMANTE_EN_COLUMNA);
	}

	//Post: Auxiliar, devuelve el mapa creado
	public Mapa obtenerMapa() {
		return mapa;
	}

	//Post: Auxiliar, devuelve el jugador creado
	public Jugador obtenerJugador() {
		return jugador;
	}
}
