package materiales;

import herramientas.Herramienta;

public abstract class Material{

    protected float durabilidad;

    public Material(float durabilidadDada) {
        durabilidad = durabilidadDada;
    }

    public float getDurabilidad() {
        return durabilidad;
    }

    public abstract void desgastarCon(Herramienta herramienta);

    public void recibirGolpeDe(Herramienta herramienta) {}

    protected void desgastar(float desgaste) {
        durabilidad -= desgaste;
    }

}
