package personaje;

import materiales.*;

import java.util.ArrayList;
import java.util.HashMap;

import excepciones.NoHayMaterialExcepcion;

public class InventarioMateriales {

	//Declaración de variables
    private HashMap<Class, ArrayList<Material>> inventario;

    //Constructor
    public InventarioMateriales() {
        inventario = new HashMap<>();
        inventario.put(Madera.class, new ArrayList<>());
        inventario.put(Metal.class, new ArrayList<>());
        inventario.put(Piedra.class, new ArrayList<>());
        inventario.put(Diamante.class, new ArrayList<>());
    }

    //Post: Se agrega un material al inventario
    public void agregar(Material material) {
    	inventario.get(material.getClass());
    }

    //Post: Se elimina un material del inventario
    public Material quitar(Class clase) throws NoHayMaterialExcepcion {
        if ( inventario.get(clase).size() == 0 )
            throw new NoHayMaterialExcepcion();
        return inventario.get(clase).remove(0);
    }

    //Post: Se devuelve la cantidad del material disponible
    public int cantidadDeMadera() {
        return inventario.get(Madera.class).size();
    }

    //Post: Se devuelve la cantidad del material disponible
    public int cantidadDeMetal() {
        return inventario.get(Metal.class).size();
    }

    //Post: Se devuelve la cantidad del material disponible
    public int cantidadDePiedra() {
        return inventario.get(Piedra.class).size();
    }

    //Post: Se devuelve la cantidad del material disponible
    public int cantidadDeDiamante() {
        return inventario.get(Diamante.class).size();
    }
}