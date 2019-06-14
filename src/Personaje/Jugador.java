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

}
