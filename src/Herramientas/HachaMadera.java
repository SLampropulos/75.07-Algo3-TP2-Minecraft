package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;

//Definición de constantes
static final int DURABILIDAD_HACHA_MADERA 100;
static final int FUERZA_HACHA_MADERA 2;

public class HachaMadera extends Herramienta{

    public HachaMadera(){
        super(DURABILIDAD_HACHA_MADERA, FUERZA_HACHA_MADERA);
        desgastador = new DesgastadorLineal(fuerza, 1);
    }

}
