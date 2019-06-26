package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;


public class HachaMetal extends Herramienta {

	static final int DURABILIDAD_HACHA_METAL = 400;
	static final int FUERZA_HACHA_METAL = 10;
	
    public HachaMetal() {
        super(DURABILIDAD_HACHA_METAL, FUERZA_HACHA_METAL);
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
