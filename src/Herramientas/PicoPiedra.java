package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class PicoPiedra extends Herramienta {
    public PicoPiedra() {
        super(200, 4);
        desgastador = new DesgastadorLineal(fuerza, (float) 1.5);
    }

	@Override
	public void desgastarA(Madera madera) {
		madera.desgastarCon(this);
	}

	@Override
	public void desgastarA(Piedra piedra) {
		piedra.desgastarCon(this);
	}

	@Override
	public void desgastarA(Metal metal) {
		metal.desgastarCon(this);
	}

	@Override
	public void desgastarA(Diamante diamante) {
		diamante.desgastarCon(this);
	}
}
