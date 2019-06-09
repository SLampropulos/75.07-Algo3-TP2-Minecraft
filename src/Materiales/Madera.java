package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Herramientas.PicoFino;
import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;


public class Madera extends Material {

    public Madera() {
        super(10);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

	@Override
	public void desgastarCon(HachaMadera hacha) {
        this.desgastar(hacha.usar());
    }

    @Override
    public void desgastarCon(HachaPiedra hacha) {
        this.desgastar(hacha.usar());
    }

	@Override
    public void desgastarCon(HachaMetal hacha) {
        this.desgastar(hacha.usar());
    }

	@Override
	public void desgastarCon(PicoMadera pico) {}

	@Override
	public void desgastarCon(PicoPiedra pico) {}

	@Override
	public void desgastarCon(PicoMetal pico) {}

	@Override
	public void desgastarCon(PicoFino pico) {}
}
