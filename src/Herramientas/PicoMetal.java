package Herramientas;

import Herramientas.Desgastador.DesgatadorPorUsos;

public class PicoMetal extends Herramienta{

    public PicoMetal() {
        super(400, 12);
        desgastador = new DesgatadorPorUsos(10,400);
    }
}
