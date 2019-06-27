package materiales;

import herramientas.HachaMadera;
import herramientas.HachaMetal;
import herramientas.HachaPiedra;
import herramientas.Herramienta;

public class Madera extends Material {

    public Madera() {
        super(10);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

	public void recibirGolpeDe(HachaMadera hacha) {
        this.desgastar(hacha.getFuerza());
    }

    public void recibirGolpeDe(HachaPiedra hacha) {
        this.desgastar(hacha.getFuerza());
    }

    public void recibirGolpeDe(HachaMetal hacha) {
        this.desgastar(hacha.getFuerza());
    }

}
