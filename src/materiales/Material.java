package materiales;

import herramientas.Herramienta;

public abstract class Material{

    protected int durabilidad;

    public Material(int durabilidadDada) {
        durabilidad = durabilidadDada;
    }

    public int obtenerDurabilidad() {
        return durabilidad;
    }

    public abstract void desgastarCon(Herramienta herramienta);

    public void recibirGolpeDe(Herramienta herramienta) {}

    protected void desgastar(int desgaste) {
        durabilidad -= desgaste;
    }

}
