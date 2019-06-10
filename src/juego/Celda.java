package juego;

import Materiales.Material;

public class Celda {
	private Material material;
	private int fila;
	private int columna;
	
	Celda(Material material, int fila, int columna) {
		this.material = material;
		this.fila = fila;
		this.columna = columna;
	}

	public Material getMaterial() {
		return material;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}
}
