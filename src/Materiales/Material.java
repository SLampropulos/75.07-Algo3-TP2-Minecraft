package Materiales;

import Herramientas.Herramienta;
import juego.Posicionable;

public abstract class Material implements Posicionable {

    protected float durabilidad;

    public Material(float durabilidadDada) {
        durabilidad = durabilidadDada;
    }

    public float getDurabilidad() {
        return durabilidad;
    }

    public void desgastarCon(Herramienta herramienta) {}

    protected void desgastar(float desgaste) {
        durabilidad -= desgaste;
    }

}
