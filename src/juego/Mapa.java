package juego;

import Materiales.Material;
import Personaje.Jugador;

public class Mapa {
	private Posicionable [][] celdas;
	private Jugador jugador;

	public Mapa()
	{
		celdas = new Posicionable[20][20];  //TODO parametrizar
	}
	
	void agregarMaterial (Material material, int fila, int columna) //TODO excepcion si ocupado
	{
		celdas[fila][columna] = material;
	}
	
	void agregarJugador (Jugador jugador, int fila, int columna)
	{
		celdas[fila][columna] = jugador;
		this.jugador = jugador;
	}
	

	public Posicionable getElementoEnCelda(int fila, int columna) {
		return celdas[fila][columna];
	}
}
