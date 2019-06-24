package juego;

import excepciones.NoHayHerramientaExcepcion;
//import materiales.Madera;
import materiales.Material;
import personaje.Jugador;

public class Mapa {

	//Declaración de constantes
	private final int cantidadDeFilas = 16;
	private final int cantidadDeColumnas = 24;

	//Declaración de variables
	private Celda[][] celdas;
	private Jugador jugador;
	private int filaJugador;
	private int columnaJugador;

	public Mapa() {
		celdas = new Celda[cantidadDeFilas][cantidadDeColumnas];
		for (int i = 0; i < cantidadDeFilas; i++) {
			for (int j = 0; j < cantidadDeColumnas; j++) {
				celdas[i][j] = new Celda();
			}
		}
	}
	
	public void agregarMaterialEnRango(Material material, int min_fil, int max_fil, int min_col, int max_col) {
		for (int fila = min_fil; fila < max_fil; fila++)
			for (int columna = min_col; columna < max_col; columna++)
				agregarMaterial(material, fila, columna);
	}

	public void agregarMaterial(Material material, int fila, int columna) { // TODO excepcion si ocupado
		celdas[fila][columna].agregar(material);
	}

	public Material obtenerMaterialEn(int fila, int columna) {
		return celdas[fila][columna].obtenerMaterial();
	}

	public boolean estaVacio(int fila, int columna) { // TODO contemplar jugador
		return celdas[fila][columna].estaVacia();
	}

	public void borrar(int fila, int columna) {
		celdas[fila][columna].borrarMaterial();
	}

	public void declararJugador(Jugador jugador, int fila, int columna) {
		this.jugador = jugador;
		filaJugador = fila;
		columnaJugador = columna;
	}

	public int obtenerFilaJugador() {
		return filaJugador;
	}

	public int obtenerColumnaJugador() {
		return columnaJugador;
	}

	public Celda[][] obtenerCeldas() {
		return celdas;
	}

	private void jugadorA(int fila, int columna) throws NoHayHerramientaExcepcion {
		if (fila >= cantidadDeFilas || fila < 0 || columna >= cantidadDeColumnas || columna < 0)
			return;
		if (estaVacio(fila, columna)) {
			filaJugador = fila;
			columnaJugador = columna;
		} else {
			Material material = obtenerMaterialEn(fila, columna);
			if (material.obtenerDurabilidad() > 0) {
				jugador.golpear(material);
			} else {
				jugador.agregarMaterial(material);
				borrar(fila, columna);
			}
		}
	}

	public void izquierda() throws NoHayHerramientaExcepcion {
		jugadorA(filaJugador, columnaJugador - 1);
	}

	public void derecha() throws NoHayHerramientaExcepcion {
		jugadorA(filaJugador, columnaJugador + 1);
	}

	public void arriba() throws NoHayHerramientaExcepcion {
		jugadorA(filaJugador - 1, columnaJugador);
	}

	public void abajo() throws NoHayHerramientaExcepcion {
		jugadorA(filaJugador + 1, columnaJugador);
	}

}
