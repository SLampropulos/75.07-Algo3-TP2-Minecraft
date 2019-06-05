package Materiales;

import Herramientas.PicoFino;


public class Diamante extends Material {

    public Diamante() {
        super(100);
    }

    public void desgastarCon(PicoFino picoFino) {
        this.desgastar(picoFino.obtenerDesgaste());
    }

}
