package Personaje;

import Herramientas.Herramienta;
import Materiales.Material;
import juego.Mapa;
import juego.Posicionable;

public class Jugador implements Posicionable {

	Mapa mapa;

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
	InventarioHerraminetas inventarioHerraminetas = new InventarioHerraminetas();
	Herramienta equipo;

	public Jugador() {
		equipo = inventarioHerraminetas.getHerramienta(0);
	}

	public Herramienta getEquipado() {
		return equipo;
	}

	private void irA(int fila, int columna) {
		if (mapa.estaVacio(fila, columna)) {
			mapa.borrar(this);
			mapa.agregar(this, fila, columna);
		} else {
			Material material = (Material) mapa.getElementoEn(fila, columna);
			if (material.getDurabilidad() > 0) {
				Herramienta equipado = this.getEquipado();
				material.desgastarCon(equipado);
			}
			else {
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
}
