package Herramientas.Desgastador;

public class DesgastadorLineal implements Desgastador {

    private float desgaste;

    public DesgastadorLineal(float fuerza, float i) {
        desgaste = fuerza / i;
    }


    @Override
    public float calcularDesgaste() {
        return desgaste;
    }

}
