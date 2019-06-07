package juego;

public class Mapa {
	private Posicionable[][] celdas;

	public Mapa() {
		celdas = new Posicionable[20][20]; // TODO parametrizar
	}

	public void agregar(Posicionable elemento, int fila, int columna) // TODO excepcion si ocupado
	{
		celdas[fila][columna] = elemento;
	}

	public int getFila(Posicionable elemento) {
		int respuesta = -1;
		for (int fila = 0; fila < celdas.length; fila++) {
			for (int columna = 0; columna < celdas[fila].length; columna++) {
				if (celdas[fila][columna] == elemento)
					respuesta = fila;
			}
		}
		return respuesta;
	}

	public int getColumna(Posicionable elemento) {
		int respuesta = -1;
		for (int fila = 0; fila < celdas.length; fila++) {
			for (int columna = 0; columna < celdas[fila].length; columna++) {
				if (celdas[fila][columna] == elemento)
					respuesta = columna;
			}
		}
		return respuesta;
	}

	public Posicionable getElementoEnCelda(int fila, int columna) {
		return celdas[fila][columna];
	}

	public boolean estaVacio(int fila, int columna) {
		return celdas[fila][columna] == null;
	}

	public void borrar(Posicionable elemento) {
		for (int fila = 0; fila < celdas.length; fila++) {
			for (int columna = 0; columna < celdas[fila].length; columna++) {
				if (celdas[fila][columna] == elemento)
					celdas[fila][columna] = null;
			}
		}
	}

}
