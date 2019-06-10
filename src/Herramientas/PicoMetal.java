package Herramientas;

import Herramientas.Desgastador.DesgastadorPorUsos;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;


public class PicoMetal extends Herramienta{

    public PicoMetal() {
        super(400, 12);
        desgastador = new DesgastadorPorUsos(10, 400);
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
