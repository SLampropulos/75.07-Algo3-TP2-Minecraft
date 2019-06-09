package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Herramientas.PicoFino;
import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;

public class Metal extends Material {

    public Metal(){
        super(50);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

	@Override
	public void desgastarCon(PicoPiedra pico) {
        this.desgastar(pico.usar());
    }

	@Override
	public void desgastarCon(PicoMetal pico) {
        this.desgastar(pico.usar());
    }
    
	@Override
	public void desgastarCon(PicoFino pico) {
        this.desgastar(pico.usar());
    }

	@Override
	public void desgastarCon(HachaMadera hacha) {}

	@Override
	public void desgastarCon(HachaPiedra hacha) {}

	@Override
	public void desgastarCon(HachaMetal hacha) {}

	@Override
	public void desgastarCon(PicoMadera pico) {}
}
