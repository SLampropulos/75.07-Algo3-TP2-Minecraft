package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;

//Definición de constantes
static final int DURABILIDAD_HACHA_PIEDRA 200;
static final int FUERZA_HACHA_PIEDRA 5;

public class HachaPiedra extends Herramienta {

    public HachaPiedra() {
        super(DURABILIDAD_HACHA_PIEDRA, FUERZA_HACHA_PIEDRA);
        desgastador = new DesgastadorLineal(fuerza, 1);
    }
}
