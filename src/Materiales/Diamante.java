package Materiales;

import Herramientas.PicoFino;

public class Diamante extends Material {

    public Diamante() {
        this.durabilidad = 100;
    }

    public void desgastarCon(PicoFino picoFino) {
        this.desgastar(picoFino.getDesgaste());
    }

}
