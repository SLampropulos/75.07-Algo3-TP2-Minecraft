package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;

public class HachaMadera extends Herramienta{

    public HachaMadera(){
        super(100, 2);
        desgastador = new DesgastadorLineal(fuerza, 1);
    }

}
