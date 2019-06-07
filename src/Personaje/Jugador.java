package Personaje;

import Herramientas.Herramienta;
import juego.Posicionable;

public class Jugador implements Posicionable {

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
