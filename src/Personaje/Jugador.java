package Personaje;

import Herramientas.Herramienta;
import Materiales.Material;
import juego.Mapa;

public class Jugador {

	private Mapa mapa;
	//FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
	private InventarioHerramientas inventarioHerramientas;
	private InventarioMateriales inventarioMateriales;
	private Herramienta equipado;

	public Jugador() {
		inventarioHerramientas = new InventarioHerramientas();
		inventarioMateriales = new InventarioMateriales();
		equipado = inventarioHerramientas.getHerramienta(0);
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public Herramienta getEquipado() {
		return equipado;
	}

	public void golpear(Material material) {
		equipado.golpear(material);
	}

	public void agregarMaterial(Material material) {
		inventarioMateriales.agregar(material);
	}

	public void agregarHerramienta(Herramienta herramienta) {
		inventarioHerramientas.add(herramienta);
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
				agregarMaterial(material);
				mapa.borrar(fila, columna);
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
