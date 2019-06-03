package Herramientas;

import Herramientas.Desgastador.DesgatadorLineal;

public class HachaPiedra extends Herramienta {

    public HachaPiedra() {
        super(200, 5);
        desgastador = new DesgatadorLineal(fuerza,1);
    }
}
