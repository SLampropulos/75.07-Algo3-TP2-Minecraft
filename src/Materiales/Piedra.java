package Materiales;

import Herramientas.PicoFino;
import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;


public class Piedra extends Material {

    public Piedra() {
        super(30);
    }

    public void desgastarCon(PicoMadera pico) {
        this.desgastar(pico.usar());
    }
    public void desgastarCon(PicoPiedra pico) {
        this.desgastar(pico.usar());
    }
    public void desgastarCon(PicoMetal pico) {
        this.desgastar(pico.usar());
    }
    public void desgastarCon(PicoFino pico) {
        this.desgastar(pico.usar());
    }


}
