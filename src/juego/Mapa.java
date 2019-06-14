package juego;

import Materiales.Material;
import Materiales.MaterialNull;
import Personaje.Jugador;

public class Mapa {

	private Celda[][] celdas;

	private Jugador jugador;
	private int filaJugador;
	private int columnaJugador;

	public Mapa() {
		celdas = new Celda[16][24];
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 24; j++) {
				celdas[i][j] = new Celda(new MaterialNull());
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

	public int getFila(Jugador jugador) {
		return filaJugador;
	}

	public int getColumna(Jugador jugador) {
		return columnaJugador;
	}

	public Celda[][] getCeldas() {
		return celdas;
	}

	// TODO esto puede mover fuera del mapa.
	private void jugadorA(int fila, int columna) {
		if (estaVacio(fila, columna)) {
			filaJugador = fila;
			columnaJugador = columna;
		} else {
			Material material = getMaterialEn(fila, columna);
			if (material.getDurabilidad() > 0) {
				jugador.golpear(material);
			} else {
				jugador.agregar(material);
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
