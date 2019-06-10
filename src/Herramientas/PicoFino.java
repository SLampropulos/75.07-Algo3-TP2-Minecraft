package Herramientas;

import Herramientas.Desgastador.DesgastadorPorcentual;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import Herramientas.Herramienta;

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
