package Materiales;

import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;


public class Piedra extends Material {

    public Piedra() {
        this.durabilidad = 30;
    }

    public void desgastarCon(PicoMadera pico) {
        this.desgastar(pico.getDesgaste());
    }

    public void desgastarCon(PicoPiedra pico) {
        this.desgastar(pico.getDesgaste());
    }

    public void desgastarCon(PicoMetal pico) {
        this.desgastar(pico.getDesgaste());
    }

}
