package Materiales;

import Herramientas.HachaMadera;
import Herramientas.HachaMetal;
import Herramientas.HachaPiedra;
import Herramientas.Herramienta;
import Herramientas.PicoFino;
import Herramientas.PicoMadera;
import Herramientas.PicoMetal;
import Herramientas.PicoPiedra;


public class Piedra extends Material {

    public Piedra() {
        super(30);
    }

    @Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

    @Override
    public void desgastarCon(PicoMadera pico) {
        this.desgastar(pico.usar());
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
}
