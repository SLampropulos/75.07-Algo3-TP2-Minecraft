package Personaje;

import Exceptions.NoHayMaterialException;
import Materiales.*;
import java.util.ArrayList;
import java.util.HashMap;

public class InventarioMateriales {

    private HashMap<Class, ArrayList<Material>> materiales;

    public InventarioMateriales() {
        materiales = new HashMap<Class, ArrayList<Material>>();
        materiales.put(Madera.class, new ArrayList<Material>());
        materiales.put(Metal.class, new ArrayList<Material>());
        materiales.put(Piedra.class, new ArrayList<Material>());
        materiales.put(Diamante.class, new ArrayList<Material>());
    }

    public void agregar(Material material) {
        materiales.get(material.getClass()).add(material);
    }

    public Material quitar(Class clase) throws NoHayMaterialException {
        if ( materiales.get(clase).size() == 0 )
            throw new NoHayMaterialException();
        return materiales.get(clase).remove(0);
    }

    public int cantidadDeMadera() {
        return materiales.get(Madera.class).size();
    }

    public int cantidadDeMetal() {
        return materiales.get(Metal.class).size();
    }

    public int cantidadDePiedra() {
        return materiales.get(Piedra.class).size();
    }

    public int cantidadDeDiamante() {
        return materiales.get(Diamante.class).size();
    }
}
