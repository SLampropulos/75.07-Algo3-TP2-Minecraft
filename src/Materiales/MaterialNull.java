package Materiales;

import Herramientas.Herramienta;

public class MaterialNull extends Material {
    public MaterialNull() {
        super(999999);
    }

    @Override
    public void desgastarCon(Herramienta herramienta) {

    }
}
