package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Herramientas.PicoFino;
import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;
import juego.Posicionable;

public abstract class Material implements Posicionable {

    protected float durabilidad;

    public Material(float durabilidadDada) {
        durabilidad = durabilidadDada;
    }

    public float getDurabilidad() {
        return durabilidad;
    }

//TODO ver si se puede simplificar
    public abstract void desgastarCon(Herramienta herramienta);

    public abstract void desgastarCon(HachaMadera hacha);
    
    public abstract void desgastarCon(HachaPiedra hacha);

    public abstract void desgastarCon(HachaMetal hacha);
    
    public abstract void desgastarCon(PicoMadera pico);

    public abstract void desgastarCon(PicoPiedra pico);
    
    public abstract void desgastarCon(PicoMetal pico);

    public abstract void desgastarCon(PicoFino pico);
    
    protected void desgastar(float desgaste) {
        durabilidad -= desgaste;
    }

}
