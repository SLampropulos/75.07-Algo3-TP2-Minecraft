package personaje;

import herramientas.HachaMadera;
import herramientas.Herramienta;
import java.util.ArrayList;

public class InventarioHerramientas {

    ArrayList herramientas = new ArrayList();

    public InventarioHerramientas() {
        herramientas.add( new HachaMadera());
    }

    public int cantidadDeHerramientas() {
        return herramientas.size();
    }

    public void add(Herramienta herramienta) {
        herramientas.add(herramienta);
    }

    public Herramienta getHerramienta(int i) {
        return (Herramienta) herramientas.get(i);
    }

    public void remove(Herramienta herramienta) {
        herramientas.remove(herramienta);
    }
}
