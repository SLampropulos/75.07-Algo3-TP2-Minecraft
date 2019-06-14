package juego;

import Materiales.Material;
import Materiales.MaterialNull;

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

	public boolean estaVacia() {
		return material instanceof MaterialNull;
	}

	public void agregar(Material unMaterial) {
		material = unMaterial;
	}

	public void borrarMaterial() {
		material = new MaterialNull();
	}

}
