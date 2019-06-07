package Personaje;

import Herramientas.HachaMadera;
import Herramientas.Herramienta;
import Herramientas.PicoMadera;

import java.util.ArrayList;

public class InventarioHerraminetas {

    ArrayList herraminetas = new ArrayList();

    public InventarioHerraminetas() {
        herraminetas.add( new HachaMadera());
    }

    public int sizeHerramineta() {
        return herraminetas.size();
    }

    public void add(Herramienta herramienta) {
        herraminetas.add(herramienta);
    }

    public Herramienta getHerramienta(int i) {
        return (Herramienta) herraminetas.get(i);
    }

    public void remove(Herramienta herramienta) {
        herraminetas.remove(herramienta);
    }
}
