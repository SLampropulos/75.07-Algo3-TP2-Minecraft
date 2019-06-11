package Personaje;

import java.util.ArrayList;

import Herramientas.Herramienta;
import Materiales.Material;
import juego.Mapa;

public class Jugador {

	Mapa mapa;
	
	ArrayList<Material> materiales;


//	FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
	InventarioHerraminetas inventarioHerraminetas = new InventarioHerraminetas();
	Herramienta equipo;

	public Jugador() {
		equipo = inventarioHerraminetas.getHerramienta(0);
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public Herramienta getEquipado() {
		return equipo;
	}

	public void golpear(Material material) {
		equipo.golpear(material);
	}

	//TODO esto puede mover fuera del mapa.  pasar mover() a Mapa???
	private void irA(int fila, int columna) {
		if (mapa.estaVacio(fila, columna)) {
			mapa.setJugador(this,fila,columna);
		} else {
			Material material = mapa.getMaterialEn(fila, columna);
			if (material.getDurabilidad() > 0) {
				this.golpear(material);
			} else {
				// TODO el jugador debe adquirir el material
				mapa.borrar(material);
			}
		}
	}

	public void irIzquierda() {
		irA(mapa.getFila(this), mapa.getColumna(this) - 1);
	}

	public void irDerecha() {
		irA(mapa.getFila(this), mapa.getColumna(this) + 1);
	}

	public void irArriba() {
		irA(mapa.getFila(this) - 1, mapa.getColumna(this));
	}

	public void irAbajo() {
		irA(mapa.getFila(this) + 1, mapa.getColumna(this));
	}
	
	public ArrayList<Material> getMateriales() {
		return materiales;
	}
}
