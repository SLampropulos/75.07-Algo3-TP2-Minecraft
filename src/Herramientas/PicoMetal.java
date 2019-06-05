package Herramientas;

import Herramientas.Desgastador.DesgastadorPorUsos;


public class PicoMetal extends Herramienta{

    public PicoMetal() {
        super(400, 12);
        desgastador = new DesgastadorPorUsos(10, 400);
    }
}
