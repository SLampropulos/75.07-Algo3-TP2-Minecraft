package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;

public class Madera extends Material {

    public Madera() {
        super(10);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

	public void recibirGolpeDe(HachaMadera hacha) {
        this.desgastar(hacha.usar());
    }

    public void recibirGolpeDe(HachaPiedra hacha) {
        this.desgastar(hacha.usar());
    }

    public void recibirGolpeDe(HachaMetal hacha) {
        this.desgastar(hacha.usar());
    }

}
