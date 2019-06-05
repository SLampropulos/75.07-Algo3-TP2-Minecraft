package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;

static final int DURABILIDAD_MADERA 10;

public class Madera extends Material {

    public Madera() {
        this.durabilidad = DURABILIDAD_MADERA;
    }

    public void desgastarCon(HachaMadera hacha) {
        this.desgastar(hacha.obtenerDesgaste());
    }

    public void desgastarCon(HachaPiedra hacha) {
        this.desgastar(hacha.obtenerDesgaste());
    }

    public void desgastarCon(HachaMetal hacha) {
        this.desgastar(hacha.obtenerDesgaste());
    }

}
