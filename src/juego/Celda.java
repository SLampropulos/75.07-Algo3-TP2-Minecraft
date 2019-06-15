package juego;

import materiales.Material;
import materiales.MaterialNull;

public class Celda {
	private Material material;
	
	Celda() {
		material = new MaterialNull();
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
