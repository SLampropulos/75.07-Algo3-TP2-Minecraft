package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;


public class HachaPiedra extends Herramienta {

	static final int DURABILIDAD_HACHA_PIEDRA = 200;
	static final int FUERZA_HACHA_PIEDRA = 5;
	
    public HachaPiedra() {
        super(DURABILIDAD_HACHA_PIEDRA, FUERZA_HACHA_PIEDRA);
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
