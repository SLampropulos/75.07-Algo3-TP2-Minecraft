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
				celdas[i][j] = new Celda(new MaterialNull(), i, j);
			}
		}
	}

	public void agregar(Material material, int fila, int columna) // TODO excepcion si ocupado
	{
		celdas[fila][columna].agregar(material);
	}

	public Material getMaterialEn(int fila, int columna) {
		return celdas[fila][columna].getMaterial();
	}

	public boolean estaVacio(int fila, int columna) {  //TODO contemplar jugador
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

}
