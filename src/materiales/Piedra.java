package materiales;

import herramientas.Herramienta;
import herramientas.PicoFino;
import herramientas.PicoMadera;
import herramientas.PicoMetal;
import herramientas.PicoPiedra;

public class Piedra extends Material {

	static final int DURABILIDAD_PIEDRA = 30;
	
    public Piedra() {
        super(DURABILIDAD_PIEDRA);
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
