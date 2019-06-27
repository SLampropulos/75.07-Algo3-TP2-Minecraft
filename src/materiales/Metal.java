package materiales;

import herramientas.Herramienta;
import herramientas.PicoFino;
import herramientas.PicoMetal;
import herramientas.PicoPiedra;

public class Metal extends Material {

	static final int DURABILIDAD_METAL = 50;
	
    public Metal(){
        super(DURABILIDAD_METAL);
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
