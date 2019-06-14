package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;


public class HachaMetal extends Herramienta {

    public HachaMetal() {
        super(400, 10);
        desgastador = new DesgastadorLineal(fuerza,2);
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
