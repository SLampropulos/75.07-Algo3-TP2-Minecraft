package Materiales;

import Herramientas.PicoFino;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;

public class Metal extends Material {

    public Metal(){
        super(50);
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
