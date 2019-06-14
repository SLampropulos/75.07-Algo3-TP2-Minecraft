package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;

public class PicoPiedra extends Herramienta {
    public PicoPiedra() {
        super(200, 4);
        desgastador = new DesgastadorLineal(fuerza, (float) 1.5);
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
