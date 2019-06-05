package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;

//Definición de constantes
static final int DURABILIDAD_PICO_PIEDRA 200;
static final int FUERZA_PICO_PIEDRA 4;

public class PicoPiedra extends Herramienta {
    public PicoPiedra() {
        super(DURABILIDAD_PICO_PIEDRA, FUERZA_PICO_PIEDRA);
        desgastador = new DesgastadorLineal(fuerza, 15, 10);
    }
}
