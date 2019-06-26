package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;

public class PicoPiedra extends Herramienta {
    
	static final int DURABILIDAD_PICO_PIEDRA = 200;
	static final int FUERZA_PICO_PIEDRA = 4;
	static final float INDICE_DESGASTE_PICO_PIEDRA = (float) 1.5;
	
	public PicoPiedra() {
        super(DURABILIDAD_PICO_PIEDRA, FUERZA_PICO_PIEDRA);
        desgastador = new DesgastadorLineal(fuerza, INDICE_DESGASTE_PICO_PIEDRA);
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
