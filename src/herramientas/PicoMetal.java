package herramientas;

import herramientas.desgastador.DesgastadorPorUsos;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;


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
