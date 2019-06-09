package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;


public class HachaPiedra extends Herramienta {

    public HachaPiedra() {
        super(200, 5);
        desgastador = new DesgastadorLineal(fuerza, 1);
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
