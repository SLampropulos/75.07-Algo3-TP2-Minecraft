package Herramientas;

import Herramientas.Desgastador.DesgatadorLineal;

//Definición de constantes
static final int DURABILIDAD_HACHA_METAL 400;
static final int FUERZA_HACHA_METAL 10;

public class HachaMetal extends Herramienta {

    public HachaMetal() {
        super(DURABILIDAD_HACHA_METAL, FUERZA_HACHA_METAL);
        desgastador = new DesgastadorLineal(fuerza,2);
    }


}
