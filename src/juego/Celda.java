package juego;

public class Celda {
	private Posicionable elemento;
	private int fila;
	private int columna;
	
	Celda(Posicionable elemento, int fila, int columna) {
		this.elemento = elemento;
		this.fila = fila;
		this.columna = columna;
	}

	public Posicionable getElemento() {
		return elemento;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}
}
