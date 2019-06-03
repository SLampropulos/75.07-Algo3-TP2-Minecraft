package Herramientas;

import Herramientas.Desgastador.DesgastadorPorcentual;
import Herramientas.Herramienta;

public class PicoFino extends Herramienta {

    public PicoFino() {
        super(1000, 20);
        desgastador = new DesgastadorPorcentual(1000,10);
    }
}
