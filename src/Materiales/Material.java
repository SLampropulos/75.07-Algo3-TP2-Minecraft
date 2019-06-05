package Materiales;

import Herramientas.Herramienta;

public abstract class Material {

    protected int durabilidad;

    public int obtenerDurabilidad() {
        return this.durabilidad;
    }

    public void desgastarCon(Herramienta herramienta) {}

    protected void desgastar(int desgaste) {
        this.durabilidad -= desgaste;
    }

}
