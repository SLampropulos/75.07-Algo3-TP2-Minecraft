package Materiales;

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

    public void recibirGolpeDe(PicoMadera pico) {
        this.desgastar(pico.getFuerza());
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
