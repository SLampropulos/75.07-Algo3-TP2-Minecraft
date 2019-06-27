package materiales;

import herramientas.Herramienta;
import herramientas.PicoFino;

public class Diamante extends Material {

	static final int DURABILIDAD_DIAMANTE = 100;
	
    public Diamante() {
        super(DURABILIDAD_DIAMANTE);
    }

	@Override
	public void desgastarCon(Herramienta herramienta) {
		herramienta.desgastarA(this);
	}

    public void recibirGolpeDe(PicoFino picoFino) {
        this.desgastar(picoFino.getFuerza());
    }

}
