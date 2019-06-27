package herramientas;

import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;
import herramientas.Herramienta;
import herramientas.desgastador.DesgastadorPorcentual;

public class PicoFino extends Herramienta {

	static final int DURABILIDAD_PICO_FINO = 1000;
	static final int FUERZA_PICO_FINO = 20;
	static final int INDICE_DESGASTE_PICO_FINO = 10;
	
    public PicoFino() {
        super(DURABILIDAD_PICO_FINO, FUERZA_PICO_FINO);
        desgastador = new DesgastadorPorcentual(DURABILIDAD_PICO_FINO, INDICE_DESGASTE_PICO_FINO);
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
