package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;


public class HachaMetal extends Herramienta {

    public HachaMetal() {
        super(400, 10);
        desgastador = new DesgastadorLineal(fuerza,2);
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
