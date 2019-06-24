package materiales;

import herramientas.Herramienta;
import herramientas.PicoFino;
import herramientas.PicoMadera;
import herramientas.PicoMetal;
import herramientas.PicoPiedra;

public class Piedra extends Material {

	static final int DURABILIDAD = 30;
	
    public Piedra() {
        super(DURABILIDAD);
    }

    @Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

    public void recibirGolpeDe(PicoMadera pico) {
        this.desgastar(pico.obtenerFuerza());
    }

    public void recibirGolpeDe(PicoPiedra pico) {
        this.desgastar(pico.obtenerFuerza());
    }

    public void recibirGolpeDe(PicoMetal pico) {
        this.desgastar(pico.obtenerFuerza());
    }

    public void recibirGolpeDe(PicoFino pico) {
        this.desgastar(pico.obtenerFuerza());
    }

}