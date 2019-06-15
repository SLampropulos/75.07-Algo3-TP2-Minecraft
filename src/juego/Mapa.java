package juego;

import materiales.Material;
import personaje.Jugador;

public class Mapa {

	private final int cantidadDeFilas = 16;
	private final int cantidadDeColumnas = 24;

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

	public void agregar(Material material, int fila, int columna) { // TODO excepcion si ocupado
		celdas[fila][columna].agregar(material);
	}

	public Material getMaterialEn(int fila, int columna) {
		return celdas[fila][columna].getMaterial();
	}

	public boolean estaVacio(int fila, int columna) { // TODO contemplar jugador
		return celdas[fila][columna].estaVacia();
	}

	public void borrar(int fila, int columna) {
		celdas[fila][columna].borrarMaterial();
	}

	public void setJugador(Jugador jugador, int fila, int columna) {
		this.jugador = jugador;
		filaJugador = fila;
		columnaJugador = columna;
	}

	public int getFilaJugador() {
		return filaJugador;
	}

	public int getColumnaJugador() {
		return columnaJugador;
	}

	public Celda[][] getCeldas() {
		return celdas;
	}

	private void jugadorA(int fila, int columna) {
		if (fila >= cantidadDeFilas || fila < 0 || columna >= cantidadDeColumnas || columna < 0)
			return;
		if (estaVacio(fila, columna)) {
			filaJugador = fila;
			columnaJugador = columna;
		} else {
			Material material = getMaterialEn(fila, columna);
			if (material.getDurabilidad() > 0) {
				jugador.golpear(material);
			} else {
				jugador.agregarMaterial(material);
				borrar(fila, columna);
			}
		}
	}

	public void izquierda() {
		jugadorA(filaJugador, columnaJugador - 1);
	}

	public void derecha() {
		jugadorA(filaJugador, columnaJugador + 1);
	}

	public void arriba() {
		jugadorA(filaJugador - 1, columnaJugador);
	}

	public void abajo() {
		jugadorA(filaJugador + 1, columnaJugador);
	}

}
