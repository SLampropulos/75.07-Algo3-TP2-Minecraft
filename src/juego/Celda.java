package juego;

import materiales.Material;
import materiales.MaterialNull;

public class Celda {
	
	//Declaración de variables
	private Material material;
	
	//Constructor
	Celda() {
		material = MaterialNull.obtenerInstancia();
	}

	//Post: Devuelve el material en la celda
	//Si esta vacia, devuelve materialNull
	public Material obtenerMaterial() {
		return material;
	}

	//Post: Indica si la celda está vacia
	public boolean estaVacia() {
		return material instanceof MaterialNull;
	}

	//Post: Se asigna un material a la celda
	public void agregar(Material unMaterial) {
		material = unMaterial;
	}

	//Post: Asigna materialNull a la celda
	public void borrarMaterial() {
		material = MaterialNull.obtenerInstancia();
	}

}