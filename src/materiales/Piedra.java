package materiales;

import herramientas.Herramienta;
import herramientas.PicoFino;
import herramientas.PicoMadera;
import herramientas.PicoMetal;
import herramientas.PicoPiedra;

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
