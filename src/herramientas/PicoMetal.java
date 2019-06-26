package herramientas;

import herramientas.desgastador.DesgastadorPorUsos;
import materiales.Diamante;
import materiales.Madera;
import materiales.Metal;
import materiales.Piedra;


public class PicoMetal extends Herramienta{

	static final int DURABILIDAD_PICO_METAL = 400;
	static final int FUERZA_PICO_METAL = 12;
	static final int INDICE_USOS_DESGASTE_PICO_METAL = 10;
	
    public PicoMetal() {
        super(DURABILIDAD_PICO_METAL, FUERZA_PICO_METAL);
        desgastador = new DesgastadorPorUsos(INDICE_USOS_DESGASTE_PICO_METAL, DURABILIDAD_PICO_METAL);
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
