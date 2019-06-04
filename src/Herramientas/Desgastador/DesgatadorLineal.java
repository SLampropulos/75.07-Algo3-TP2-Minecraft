package Herramientas.Desgastador;

public class DesgatadorLineal implements Desgatador {

    private final float indiceDesgaste;

    public DesgatadorLineal(float fuerza, float i) {
        indiceDesgaste = fuerza/i;
    }
    public DesgatadorLineal(float fuerza, float i, float i2) {
        indiceDesgaste = (fuerza*i2)/i;
    }


    @Override
    public float calcularDesgaste() {
        return indiceDesgaste;
    }

}
