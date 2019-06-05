package Herramientas;

import Herramientas.Desgastador.DesgastadorPorUsos;

//Definición de constantes
static final int DURABILIDAD_PICO_METAL 400;
static final int FUERZA_PICO_METAL 12;

public class PicoMetal extends Herramienta{

    public PicoMetal() {
        super(DURABILIDAD_PICO_METAL, FUERZA_PICO_METAL);
        desgastador = new DesgastadorPorUsos(10, 400);
    }
}
