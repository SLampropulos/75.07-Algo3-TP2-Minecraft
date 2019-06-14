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

	public void agregar(Material material) {
		materiales.add(material);
	}
	
	public void izquierda() {
		mapa.izquierda();
	}

	public void derecha() {
		mapa.derecha();
	}

	public void arriba() {
		mapa.arriba();
	}

	public void abajo() {
		mapa.abajo();
	}
	
	public ArrayList<Material> getMateriales() {
		return materiales;
	}
}
