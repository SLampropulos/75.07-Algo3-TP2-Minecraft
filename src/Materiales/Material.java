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

    public void desgastarCon(Herramienta herramienta) {}

    public void desgastarCon(HachaMadera hacha) {}
    
    public void desgastarCon(HachaPiedra hacha) {}

    public void desgastarCon(HachaMetal hacha) {}
    
    public void desgastarCon(PicoMadera pico) {}

    public void desgastarCon(PicoPiedra pico) {}
    
    public void desgastarCon(PicoMetal pico) {}

    public void desgastarCon(PicoFino pico) {}
    
    protected void desgastar(float desgaste) {
        durabilidad -= desgaste;
    }

}
