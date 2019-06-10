package Materiales;

import Herramientas.Herramienta;
import Herramientas.PicoFino;
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

	public void recibirGolpeDe(PicoPiedra pico) {
        this.desgastar(pico.getFuerza());
    }

	public void recibirGolpeDe(PicoMetal pico) {
        this.desgastar(pico.getFuerza());
    }

	public void recibirGolpeDe(PicoFino pico) {
        this.desgastar(pico.getFuerza());
    }

}
