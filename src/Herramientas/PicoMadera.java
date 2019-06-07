package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;


public class PicoMadera extends Herramienta {

    public PicoMadera() {
        super(100, 2);
        desgastador = new DesgastadorLineal(fuerza,1);
    }
}
