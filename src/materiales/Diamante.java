package materiales;

import herramientas.Herramienta;
import herramientas.PicoFino;

public class Diamante extends Material {

    public Diamante() {
        super(100);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

    public void recibirGolpeDe(PicoFino picoFino) {
        this.desgastar(picoFino.getFuerza());
    }

}
