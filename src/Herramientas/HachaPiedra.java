package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;


public class HachaPiedra extends Herramienta {

    public HachaPiedra() {
        super(200, 5);
        desgastador = new DesgastadorLineal(fuerza, 1);
    }
}
