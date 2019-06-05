package Herramientas;

import Herramientas.Desgastador.DesgastadorPorcentual;
import Herramientas.Herramienta;

//Definición de constantes
static final int DURABILIDAD_PICO_FINO 1000;
static final int FUERZA_PICO_FINO 20;

public class PicoFino extends Herramienta {

    public PicoFino() {
        super(DURABILIDAD_PICO_FINO, FUERZA_PICO_FINO);
        desgastador = new DesgastadorPorcentual(1000, 10);
    }
}
