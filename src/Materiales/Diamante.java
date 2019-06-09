package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Herramientas.PicoFino;
import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;


public class Diamante extends Material {

    public Diamante() {
        super(100);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

	@Override
    public void desgastarCon(PicoFino picoFino) {
        this.desgastar(picoFino.usar());
    }

	@Override
	public void desgastarCon(HachaMadera hacha) {}

	@Override
	public void desgastarCon(HachaPiedra hacha) {}

	@Override
	public void desgastarCon(HachaMetal hacha) {}

	@Override
	public void desgastarCon(PicoMadera pico) {}

	@Override
	public void desgastarCon(PicoPiedra pico) {}

	@Override
	public void desgastarCon(PicoMetal pico) {}
}
