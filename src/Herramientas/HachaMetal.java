package Herramientas;


import Herramientas.Desgastador.DesgatadorLineal;

public class HachaMetal extends Herramienta {

    public HachaMetal() {
        super(400,10);
        desgastador = new DesgatadorLineal(fuerza,2);
    }


}
