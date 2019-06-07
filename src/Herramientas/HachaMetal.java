package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;


public class HachaMetal extends Herramienta {

    public HachaMetal() {
        super(400, 10);
        desgastador = new DesgastadorLineal(fuerza,2);
    }


}
