package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;

public class HachaMadera extends Herramienta {

	static final int DURABILIDAD_HACHA_MADERA = 100;
	static final int FUERZA_HACHA_MADERA = 2;
	
	
	public HachaMadera() {
		super(DURABILIDAD_HACHA_MADERA, FUERZA_HACHA_MADERA);
		desgastador = new DesgastadorLineal(fuerza, 1);
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
