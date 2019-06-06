package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;


public class Madera extends Material {

    public Madera() {
        super(10);
    }

    public void desgastarCon(HachaMadera hacha) {
        this.desgastar(hacha.usar());
    }
    public void desgastarCon(HachaPiedra hacha) {
        this.desgastar(hacha.usar());
    }
    public void desgastarCon(HachaMetal hacha) {
        this.desgastar(hacha.usar());
    }

}
