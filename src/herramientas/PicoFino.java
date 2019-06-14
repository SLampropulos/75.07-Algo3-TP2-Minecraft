package herramientas;

import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;
import herramientas.Herramienta;
import herramientas.desgastador.DesgastadorPorcentual;

public class PicoFino extends Herramienta {

    public PicoFino() {
        super(1000, 20);
        desgastador = new DesgastadorPorcentual(1000, 10);
    }

	@Override
	public void desgastarA(Madera madera) {
		madera.recibirGolpeDe(this);
	}

	@Override
	public void desgastarA(Piedra piedra) {
		piedra.recibirGolpeDe(this);
	}

	@Override
	public void desgastarA(Metal metal) {
		metal.recibirGolpeDe(this);
	}

	@Override
	public void desgastarA(Diamante diamante) {
		diamante.recibirGolpeDe(this);
	}
}
