package Herramientas;

import Herramientas.Desgastador.DesgastadorLineal;

public class PicoPiedra extends Herramienta {
    public PicoPiedra() {
        super(200, 4);
        desgastador = new DesgastadorLineal(fuerza, (float) 1.5);
    }
}
