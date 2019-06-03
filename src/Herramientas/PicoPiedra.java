package Herramientas;

import Herramientas.Desgastador.DesgatadorLineal;

public class PicoPiedra extends Herramienta {
    public PicoPiedra() {
        super(200, 4);
        desgastador = new DesgatadorLineal(fuerza, 15,10);
    }
}
