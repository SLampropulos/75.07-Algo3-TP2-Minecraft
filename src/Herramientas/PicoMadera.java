package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;

//Definición de constantes
static final int DURABILIDAD_PICO_MADERA 100;
static final int FUERZA_PICO_MADERA 2;

public class PicoMadera extends Herramienta {

    public PicoMadera() {
        super(DURABILIDAD_PICO_MADERA, FUERZA_PICO_MADERA);
        desgastador = new DesgastadorLineal(fuerza,1);
    }
}
