package juego;

import java.util.ArrayList;

import Materiales.Material;
import Personaje.Jugador;

public class Mapa {
	private ArrayList<Celda> celdas;
	private Jugador jugador;
	private int filaJugador;
	private int columnaJugador;

	public Mapa() {
		celdas = new ArrayList<Celda>();
	}

	public void agregar(Material material, int fila, int columna) // TODO excepcion si ocupado
	{
		celdas.add(new Celda(material, fila, columna));
	}

	public int getFila(Material material) {
		for (Celda celda : celdas)
			if (celda.getMaterial() == material)
				return celda.getFila();
		return -1;
	}

	public int getColumna(Material material) {
		for (Celda celda : celdas)
			if (celda.getMaterial() == material)
				return celda.getColumna();
		return -1;
	}

	public Material getMaterialEn(int fila, int columna) {
		for (Celda celda : celdas)
			if (celda.getFila() == fila && celda.getColumna()==columna)
				return celda.getMaterial();
		return null;
	}

	public boolean estaVacio(int fila, int columna) {  //TODO contemplar jugador
		for (Celda celda : celdas)
			if (celda.getFila() == fila && celda.getColumna()==columna)
				return false;
		return true;
	}

	public void borrar(Material material) {
	    celdas.removeIf(celda -> celda.getMaterial()==material);
//		celdas.remove(material); //TODO ver
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
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
}
