package herramientas;

import herramientas.desgastador.DesgastadorLineal;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;


public class PicoMadera extends Herramienta {

	static final int DURABILIDAD_PICO_MADERA = 100;
	static final int FUERZA_PICO_MADERA = 2;
	static final int INDICE_DESGASTE_PICO_MADERA = 1;
	
    public PicoMadera() {
        super(DURABILIDAD_PICO_MADERA, FUERZA_PICO_MADERA);
        desgastador = new DesgastadorLineal(fuerza, INDICE_DESGASTE_PICO_MADERA);
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
