package personaje;

import herramientas.HachaMadera;
import herramientas.Herramienta;
import java.util.ArrayList;

public class InventarioHerramientas {

    private ArrayList<Herramienta> herramientas;

    public InventarioHerramientas() {
        herramientas = new ArrayList<>();
        herramientas.add(new HachaMadera());
    }

    public int cantidadDeHerramientas() {
        return herramientas.size();
    }

    public void agregar(Herramienta herramienta) {
        herramientas.add(herramienta);
    }

    public Herramienta obtenerHerramienta(int i) {
        return herramientas.get(i);
    }

    public void remove(Herramienta herramienta) {
        herramientas.remove(herramienta);
    }
}