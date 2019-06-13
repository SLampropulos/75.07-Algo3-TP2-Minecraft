package Personaje;

import java.util.ArrayList;

import Herramientas.Herramienta;
import Materiales.Material;
import juego.Mapa;

public class Jugador {

	Mapa mapa;
	
	ArrayList<Material> materiales;


//	FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
	InventarioHerramientas inventarioHerramientas = new InventarioHerramientas();
	Herramienta equipo;

	public Jugador() {
		materiales = new ArrayList<Material>();
		equipo = inventarioHerramientas.getHerramienta(0);
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

	private void agregar(Material material) {
		materiales.add(material);
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
				agregar(material);
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
