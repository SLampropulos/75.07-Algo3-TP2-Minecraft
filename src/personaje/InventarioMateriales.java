package personaje;

import excepciones.MaterialNoSeleccionadoException;
import materiales.*;
import java.util.ArrayList;
import java.util.HashMap;

import excepciones.NoHayMaterialException;

public class InventarioMateriales {

    private HashMap<Class, ArrayList<Material>> materiales;
    private Class materialSeleccionado;

    public InventarioMateriales() {
        materiales = new HashMap<>();
        materiales.put(Madera.class, new ArrayList<>());
        materiales.put(Metal.class, new ArrayList<>());
        materiales.put(Piedra.class, new ArrayList<>());
        materiales.put(Diamante.class, new ArrayList<>());
    }

    public void agregar(Material material) {
        materiales.get(material.getClass()).add(material);
    }

    public Material quitar(Class<?> clase) throws NoHayMaterialException {
        if ( materiales.get(clase).size() == 0 )
            throw new NoHayMaterialException();
        return materiales.get(clase).remove(0);
    }
    
    public Material quitar() throws NoHayMaterialException {
        if ( materiales.get(materialSeleccionado).size() == 0 )
            throw new NoHayMaterialException();
        return materiales.get(materialSeleccionado).remove(0);
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

	public Material quitarSeleccionado() throws NoHayMaterialException, MaterialNoSeleccionadoException {
        if(materialSeleccionado == null) throw new MaterialNoSeleccionadoException();
        if ( materiales.get(materialSeleccionado).size() == 0 )
            throw new NoHayMaterialException();
        Material material = materiales.get(materialSeleccionado).remove(0);
        return material;
	}

	public void seleccionarMaterial(Class<Material> clase) {
        materialSeleccionado = clase;
	}
	
	public Class<Material> materialSeleccionado() {
		return materialSeleccionado;
	}
}
