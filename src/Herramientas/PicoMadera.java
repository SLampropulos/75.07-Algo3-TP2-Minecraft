package Herramientas;

import Herramientas.Desgastador.DesgatadorLineal;

public class PicoMadera extends Herramienta {

    public PicoMadera() {
        super(100, 2);
        desgastador = new DesgatadorLineal(fuerza,1);
    }
}
