package Personaje;

import Herramientas.Herramienta;

public class Jugador {

    FabricadorHerramientas fabricadorHerramientas = new FabricadorHerramientas();
    InventarioHerraminetas inventarioHerraminetas = new InventarioHerraminetas();
    Herramienta equipo;

    public Jugador(){
        equipo = inventarioHerraminetas.getHerramienta(0);
    }

    public Herramienta getEquipado() {
        return equipo;
    }
}
