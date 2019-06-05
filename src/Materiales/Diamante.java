package Materiales;

import Herramientas.PicoFino;

static final int DURABILIDAD_DIAMANTE 100;

public class Diamante extends Material {

    public Diamante() {
        this.durabilidad = DURABILIDAD_DIAMANTE;
    }

    public void desgastarCon(PicoFino picoFino) {
        this.desgastar(picoFino.obtenerDesgaste());
    }

}
