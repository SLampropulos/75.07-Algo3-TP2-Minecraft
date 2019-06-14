package juego;

import Materiales.Material;
import Materiales.MaterialNull;

public class Celda {
	private Material material;
	
	Celda(Material material) {
		this.material = material;
	}

	public Material getMaterial() {
		return material;
	}

	public boolean estaVacia() {
		return material instanceof MaterialNull;
	}

	public void agregar(Material unMaterial) {
		material = unMaterial;
	}

	public void borrarMaterial() {
		material = new MaterialNull();
	}

}
