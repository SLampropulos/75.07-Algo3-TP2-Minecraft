package juego;

import java.util.ArrayList;

public class Mapa {
	private ArrayList<Celda> celdas;

	public Mapa() {
		celdas = new ArrayList<Celda>();
	}

	public void agregar(Posicionable elemento, int fila, int columna) // TODO excepcion si ocupado
	{
		celdas.add(new Celda(elemento, fila, columna));
	}

	public int getFila(Posicionable elemento) {
		for (Celda celda : celdas)
			if (celda.getElemento() == elemento)
				return celda.getFila();
		return -1;
	}

	public int getColumna(Posicionable elemento) {
		for (Celda celda : celdas)
			if (celda.getElemento() == elemento)
				return celda.getColumna();
		return -1;
	}

	public Posicionable getElementoEn(int fila, int columna) {
		for (Celda celda : celdas)
			if (celda.getFila() == fila && celda.getColumna()==columna)
				return celda.getElemento();
		return null;
	}

	public boolean estaVacio(int fila, int columna) {
		for (Celda celda : celdas)
			if (celda.getFila() == fila && celda.getColumna()==columna)
				return false;
		return true;
	}

	public void borrar(Posicionable elemento) {
	    celdas.removeIf(celda -> celda.getElemento()==elemento);
//		celdas.remove(elemento); //TODO ver
	}
}
