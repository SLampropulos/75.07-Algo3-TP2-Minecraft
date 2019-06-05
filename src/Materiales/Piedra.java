package Materiales;

import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;

static final int DURABILIDAD_PIEDRA 30;

public class Piedra extends Material {

    public Piedra() {
        this.durabilidad = DURABILIDAD_PIEDRA;
    }

    public void desgastarCon(PicoMadera pico) {
        this.desgastar(pico.obtenerDesgaste());
    }

    public void desgastarCon(PicoPiedra pico) {
        this.desgastar(pico.obtenerDesgaste());
    }

    public void desgastarCon(PicoMetal pico) {
        this.desgastar(pico.obtenerDesgaste());
    }

}
